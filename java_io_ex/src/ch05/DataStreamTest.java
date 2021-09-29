package ch05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) {
		
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)){
			
			dos.writeByte(100);
			dos.writeChar('A');
			dos.writeInt(10);
			dos.writeFloat(3.14f);
			dos.writeUTF("TEST");
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)){
			
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

// DataOutputStream 은 파일에 write 를 수행할 때, 데이터타입을 그대로 설정하여 작성할 수 있다.
// -> 읽어들일 때도 데이터 단위에 따라 읽어들여야 한다.