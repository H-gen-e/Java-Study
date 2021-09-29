package ch01;

import java.io.IOException;

public class systemInTest01 {

	public static void main(String[] args) {

		// 표준 입출력
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

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
