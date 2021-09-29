package ch02;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream04 {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("assets/input2.txt")){
			// �ѹ��� 10���� �е��� ����
			byte[] bs = new byte[10];
			int i;
			
			while((i = fis.read(bs))!=-1) {
				
				// bs �迭�� ũ�⸸ŭ �о���� : ������ 10byte
//				for (byte b : bs) {
//					System.out.print((char)b);
//				}
				// �о���̴� byte�� ������ŭ : ������ ���� ������ŭ 
				for (int j = 0; j < i; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : +"+i+"����Ʈ ����");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
