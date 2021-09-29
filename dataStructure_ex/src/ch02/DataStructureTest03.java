package ch02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int grade;
}



public class DataStructureTest03 {

	public static void main(String[] args) {
		
		List list0;
		
		// ������ �ְ�(�ε���) �ߺ��� �����ϴ�.
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> members = new ArrayList<>();
		
		// ���߰� ���
		list.add(3);
		list.add(null);
		// ����Ʈ�� �ε����� �����Ƿ�, ������ġ ������ �����ϴ�.
		list.add(1, 10);
		
		System.out.println("���߰� Ȯ�� : "+list);
		
		// �� ���� ���
		list.remove(2);
		
		System.out.println("������ Ȯ�� : "+list);
		
//		list.clear();
//		System.out.println("�ѹ������� Ȯ�� : "+list);

		// ������ Ȯ��
		System.out.println("������ Ȯ�� : "+list.size());
		
		// ����Ʈ �迭 �ڷᱸ�� Ȱ��
		System.out.println("0��° �ε��� �� : "+list.get(0));
		
		for (Integer integer : list) {
			System.out.println("for��� ��Ȯ�� : "+integer);
		}
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("iterator��� ��Ȯ�� : "+iter.next());
		}
		
		// ArrayList �� �˻��ϴ� ���
		// contains() �޼���� ����Ʈ �ȿ� ���� �ִ� �� Ȯ���Ѵ� -> boolean ������ Ÿ������ ��ȯ
		System.out.println(list.contains(1));
		System.out.println(list.contains(3));
		
		// �ε��� ��ȣ �˻��ϴ� ���
		// ���� ������ �ش� �ε��� ��ȣ�� ��ȯ�ϰ�, ������ -1�� ��ȯ�Ѵ�.
		System.out.println(list.indexOf(3));
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(1));
		
		
	}
	
	
}
















