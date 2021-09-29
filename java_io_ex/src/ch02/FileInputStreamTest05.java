package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest05 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input2.txt")){
			
			byte[] bs = new byte[10];
			
			// �о���� ���۰��� ������ ���Ѵ�
//			fis.read(bs, 0, 5);
			
//			for (byte b : bs) {
//				System.out.print((char)b);
//			}
			
			int i;
			while((i=fis.read(bs,0,5))!=-1) {
				
				for(int j=0;j<i;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : "+i+"����Ʈ ����");
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
