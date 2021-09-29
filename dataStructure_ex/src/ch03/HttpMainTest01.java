package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpMainTest01 {

	public static void main(String[] args) {
		
		// http ������ ����� ���� ��ü
		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/todos/10");
			// fake server ���� �����۾� ���
			HttpURLConnection connection = (HttpURLConnection)url.openConnection();
			// ������ ��û�� �� �� �ּ�â�� �ּҸ� ����ڰ� �Է��� ������ Ȯ��
			// <-> POST : �������� �κ��� �����ش� 
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-type", "application/json");
			// ����
			connection.connect();
			
			// �����ڵ�� ����� �ޱ�
			// 200 - ���� / 404 - ����
			int statusCode = connection.getResponseCode();
			System.out.println("������� : "+statusCode);
			
			// I/O Stream 
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			// �޸𸮸� ȿ�������� ��� ����(���ο� ��ü ���� ����)
			StringBuffer sb = new StringBuffer();
			String line = null;
			
			if(statusCode == 200) {
				
				while((line = reader.readLine())!=null) {
					sb.append(line);
				}
				
				String str = sb.toString();
				System.out.println(str);
				
			}
			else {
				System.out.println("������ ������ �� �� �����ϴ�.");
			}
			
			String str = sb.toString();
			System.out.println(str);
			System.out.println("--------------------");
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// json ���
		// https://jsonplaceholder.typicode.com/
		
	}
	
}
