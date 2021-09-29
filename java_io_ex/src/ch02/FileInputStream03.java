package ch02;

import java.io.FileInputStream;

public class FileInputStream03 {
	
	public static void main(String[] args) {
		
		// 자동 close() 기능 활용
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
