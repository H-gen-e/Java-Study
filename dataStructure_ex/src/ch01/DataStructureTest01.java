package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest01 {

	public static void main(String[] args) {

		// set �迭 �ڷᱸ��
		// Hash �� �ߺ��� ���� ������.
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1); // �ߺ���
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(3);
		
		// ������ Ȯ�� 
		System.out.println(set1.size());
		
		// set ����
		set1.remove(1);
		System.out.println(set1);
		
//		set1.clear();
//		System.out.println(set1);
		
		// Ȱ�밡�� - ������� ������, ���� ��Ҹ� ��� ����϶�
		System.out.println(set1.isEmpty());
		
		// �Ϲ� for�����δ� set �迭�� �ڷᱸ���� ������� �ݺ��� �� ����.
		// ������� ����Ǿ����� �ʱ� �����̴�. -> foreach ���� ����ؾ� �Ѵ�.
		for(int i=0;i<set1.size();i++) {
			System.out.println("set1 �� : Ȯ�� "+ i);
		}
		
		for (Integer integer : set1) {
			System.out.println("�� Ȯ�� : "+ integer);
		}
		
		// Iterator �� � �ڷᱸ���� �ݺ��� ������ �� �ֵ��� ������ش�.
		// ��� ��ȸ(�ݺ���) �÷��� �����ӿ�ũ�� ����� ��Ҹ� �ϳ��� ���ʷ� �����ϴ� ���̴�.
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("�� Ȯ�� : "+ iter.next());
		}
		
		// set �ڷᱸ�� Ȱ�뿹��
		HashSet<Integer> set2 = new HashSet<>();
		System.out.println("-----------------------------");
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		set2.add(getRandomNumber());
		System.out.println(set2);
		
	}

	public static int getRandomNumber(){
		Random rd = new Random();
		int value = rd.nextInt(45) + 1;
		return value;
	}
}












