package ch01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest02 {

	public static void main(String[] args) {
		
		// ǥ�� �����
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������");
		
		int i;
		
		try {
			
			// ����Ʈ�� ���ڷ� �������ִ� �༮ -> ���� ��Ʈ��
			InputStreamReader irs = new InputStreamReader(System.in);
			
//			while((i=System.in.read()) != '\n') {
			while((i=irs.read()) != '\n') {
//				System.out.println(i);
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

// System.in.read() : 1byte �� �о���̴� �༮�̴�. -> 2byte �̻��� ������. 
// �������� �Ű������� InputStream / OutputStream(��� ��Ʈ��)�̸� ���� ��Ʈ���̴�.