package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class DataStructureTest01 {

	public static void main(String[] args) {

		// set 계열 자료구조
		// Hash 는 중복을 담지 않은다.
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(1); // 중복값
		set1.add(2);
		set1.add(3);
		set1.add(3);
		set1.add(3);
		
		// 사이즈 확인 
		System.out.println(set1.size());
		
		// set 삭제
		set1.remove(1);
		System.out.println(set1);
		
//		set1.clear();
//		System.out.println(set1);
		
		// 활용가능 - 비어있지 않으면, 안의 요소를 모두 출력하라
		System.out.println(set1.isEmpty());
		
		// 일반 for문으로는 set 계열의 자료구조를 순서대로 반복할 수 없다.
		// 순서대로 저장되어있지 않기 때문이다. -> foreach 문을 사용해야 한다.
		for(int i=0;i<set1.size();i++) {
			System.out.println("set1 값 : 확인 "+ i);
		}
		
		for (Integer integer : set1) {
			System.out.println("값 확인 : "+ integer);
		}
		
		// Iterator 는 어떤 자료구조든 반복을 수행할 수 있도록 만들어준다.
		// 요소 순회(반복자) 컬렉션 프레임워크에 저장된 요소를 하나씩 차례로 참조하는 것이다.
		Iterator iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println("값 확인 : "+ iter.next());
		}
		
		// set 자료구조 활용예제
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












