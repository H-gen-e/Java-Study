package ch01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest02 {

	public static void main(String[] args) {
		
		// 표준 입출력
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		
		int i;
		
		try {
			
			// 바이트를 문자로 변경해주는 녀석 -> 보조 스트림
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

// System.in.read() : 1byte 씩 읽어들이는 녀석이다. -> 2byte 이상은 깨진다. 
// 생성자의 매개변수가 InputStream / OutputStream(기반 스트림)이면 보조 스트림이다.