package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream04 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input2.txt")){
			// 한번에 10개씩 읽도록 설정
			byte[] bs = new byte[10];
			int i;
			
			while((i = fis.read(bs))!=-1) {
				
				// bs 배열의 크기만큼 읽어들임 : 무조건 10byte
//				for (byte b : bs) {
//					System.out.print((char)b);
//				}
				// 읽어들이는 byte의 개수만큼 : 파일의 내용 개수만큼 
				for (int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : +"+i+"바이트 읽음");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
