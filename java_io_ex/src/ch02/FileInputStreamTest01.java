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
		// try ���� ������ ������ ����Ǵ� finally	
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(Exception e2) {
				System.out.println(e2);
			} // Null ����Ʈ exception �ʿ�
		}
		
		
		System.out.println("end : ���α׷� �ٿ� �ȵ�!");
	}

}

// ������� �׻� ����ó���� �ʿ��ϴ�.
// �ڿ��� ��� ����ϰ� ���� close �� ���� �ݾ���� �޸� ���� ���� �� �ִ�.