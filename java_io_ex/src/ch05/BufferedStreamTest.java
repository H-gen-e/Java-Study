package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		// BufferedStream �� ������� ���� �׷��� �������� �ð����� Ȯ���ϱ� ���� �ڵ�
		long millisecond = 0;

		// �迭�� ������ ���� �Է�
		try (FileInputStream fis = new FileInputStream("a.zip");
			 FileOutputStream fos = new FileOutputStream("copy.zip");
			
			 // ������Ʈ���� ȥ�� ������� ���Ѵ�.
			 // ������Ʈ���� �Ű������δ� ��� ��Ʈ�� ������ Ÿ���� �־��ش�.
			 BufferedInputStream bis = new BufferedInputStream(fis);
			 BufferedOutputStream bos = new BufferedOutputStream(fos);) {

			millisecond = System.currentTimeMillis();

//			��� ��Ʈ�� : ���� ���� �ϴµ�40680�ҿ� �Ǿ����ϴ�.
//			int i;
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}
			
//			���� ��Ʈ�� : ���� ���� �ϴµ�169�ҿ� �Ǿ����ϴ�.
			int i;
			while((i=bis.read())!=-1){
				bos.write(i);
			}

			millisecond = System.currentTimeMillis() - millisecond;

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("���� ���� �ϴµ�" + millisecond + "�ҿ� �Ǿ����ϴ�.");

	}

}
