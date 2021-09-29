package ch04;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {

		//문자를 읽어들이는 스트림
		try(FileReader fr = new FileReader("assets/article.txt")){
			
			int i;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
