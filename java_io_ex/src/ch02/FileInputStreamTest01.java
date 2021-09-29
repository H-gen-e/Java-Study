package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("assets/input.txt");
			
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
		// try 문을 만나면 무조건 실행되는 finally	
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(Exception e2) {
				System.out.println(e2);
			} // Null 포인트 exception 필요
		}
		
		
		System.out.println("end : 프로그램 다운 안됨!");
	}

}

// 입출력은 항상 예외처리가 필요하다.
// 자원을 모두 사용하고 나면 close 를 통해 닫아줘야 메모리 낭비를 막을 수 있다.