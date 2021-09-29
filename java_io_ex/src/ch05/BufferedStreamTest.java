package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		// BufferedStream 을 사용했을 때와 그렇지 않을때의 시간차이 확인하기 위한 코드
		long millisecond = 0;

		// 배열의 단위로 문자 입력
		try (FileInputStream fis = new FileInputStream("a.zip");
			 FileOutputStream fos = new FileOutputStream("copy.zip");
			
			 // 보조스트림은 혼자 사용하지 못한다.
			 // 보조스트림의 매개변수로는 기반 스트림 데이터 타입을 넣어준다.
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			millisecond = System.currentTimeMillis();

//			기반 스트림 : 파일 복사 하는데40680소요 되었습니다.
//			int i;
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}
			
//			보조 스트림 : 파일 복사 하는데169소요 되었습니다.
			int i;
			while((i=bis.read())!=-1){
				bos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사 하는데" + millisecond + "소요 되었습니다.");

	}

}
