package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream02 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", false);
		
		// java 9부터 제공되는 auto close 
		try(fos) {
			
			byte[] bs = new byte[26];
			byte data = 65;
			
			for(int i=0;i<bs.length;i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
