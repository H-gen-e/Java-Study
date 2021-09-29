package ch03;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest01 {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("end");
		
	}

}

// �⺻������ java ������ ���Ͽ� ������ �ۼ��Ҷ�, ������ ������, �������ش�.
// FileOutputStream �ν��Ͻ��� �Ű�������, ���ϸ� �ڿ� false ��� �ۼ��ϸ�,
// �Ź� ���Ӱ� ������ ����� �������̵� �ȴ�.
// -> true ��� ������ ���Ͽ� append �Ѵ�.