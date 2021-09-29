package ch02;

import java.io.FileInputStream;

public class FileInputStream03 {
	
	public static void main(String[] args) {
		
		// �ڵ� close() ��� Ȱ��
		try(FileInputStream fis = new FileInputStream("assets/input.txt")){
			
			int i;
			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
