package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("assets/input.txt");
			
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
	
}
// read() �޼���� ���� �����Ͱ� ������, -1�� return �Ѵ�.
