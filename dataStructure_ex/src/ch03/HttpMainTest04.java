package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class HttpMainTest04 {

	public static void main(String[] args) {

		// http 데이터 통신을 위한 객체
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/comments/21");
			// fake server 에의 연결작업 담당
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			// 데이터 요청을 할 때 주소창의 주소를 사용자가 입력한 값까지 확인
			// <-> POST : 보안적인 부분을 가려준다
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-type", "application/json");
			// 연결
			connection.connect();

			// 상태코드로 결과값 받기
			// 200 - 정상 / 404 - 오류
			int statusCode = connection.getResponseCode();
			System.out.println("연결상태 : " + statusCode);

			// I/O Stream
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			// 메모리를 효율적으로 담기 위해(새로운 객체 생성 방지)
			StringBuffer sb = new StringBuffer();
			String line = null;

			if (statusCode == 200) {

				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}

				String str = sb.toString();
				System.out.println(str);

			} else {
				System.out.println("서버에 연결을 할 수 없습니다.");
			}

			// 외부에서 가져온 API
			String str = sb.toString();
			Gson gson = new Gson();
			// 서로 다른 형식의 언어의 문자열을 모두 잘라서 옮길 필요 없도록 도와주는 GSON API
			Comment comment = gson.fromJson(str, Comment.class);
			
			System.out.println(comment.id);
			System.out.println(comment.name);
			System.out.println(comment.postId);
			System.out.println(comment.body);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
