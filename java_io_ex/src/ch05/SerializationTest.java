package ch05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	
	String name;
	String job;
	
	public Person() {
		
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return this.name +", " + this.job;
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personBin = new Person("�����", "�ǹ���");
		Person personDo = new Person("����", "���ݺ���");
		
		// Object ������ ���Ͽ� ���� ���
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personBin);
			oos.writeObject(personDo);
			
		} catch (IOException e) {
			System.out.println(e);
		} 
		
		// Object ������ �о���̴� ���
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			try {
				Person p1 = (Person)ois.readObject();
				Person p2 = (Person)ois.readObject();
				
				System.out.println(p1);
				System.out.println(p2);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�۾��� �Ϸ��߽��ϴ�.");
		
	}
	
}

















