package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		// ���ڸ� �ۼ����ִ� ��Ʈ��
		try(FileWriter fw = new FileWriter("assets/writer.txt", true)){
			
			fw.write('A');
			
			char[] buf = {'B','C','D','E','F','G'};
			fw.write(buf);
			
			fw.write("�ȳ��ϼ���. �� �����׿�.");
			
			fw.write(buf, 1, 2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
