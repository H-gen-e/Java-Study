package ch01;

import java.io.IOException;

public class systemInTest01 {

	public static void main(String[] args) {

		// ǥ�� �����
		System.out.println("���ĺ� �ϳ��� ���� [Enter]�� ��������");

		int i;

		try {
			i = System.in.read();
			System.out.println(i);
			System.out.println((char) i);

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
