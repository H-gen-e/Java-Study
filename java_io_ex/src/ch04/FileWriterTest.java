package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		// 문자를 작성해주는 스트림
		try(FileWriter fw = new FileWriter("assets/writer.txt", true)){
			
			fw.write('A');
			
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);
			
			fw.write("안녕하세요. 잘 써지네요.");
			
			fw.write(buf, 1, 2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
