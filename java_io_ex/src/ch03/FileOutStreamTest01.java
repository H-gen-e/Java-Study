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

// 기본적으로 java 에서는 파일에 내용을 작성할때, 파일이 없으면, 생성해준다.
// FileOutputStream 인스턴스의 매개변수에, 파일명 뒤에 false 라고 작성하면,
// 매번 새롭게 내용을 덮어쓰며 오버라이드 된다.
// -> true 라면 기존의 파일에 append 한다.