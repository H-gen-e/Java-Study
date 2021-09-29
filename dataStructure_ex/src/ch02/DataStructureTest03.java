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
		
		// 순서가 있고(인덱스) 중복이 가능하다.
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Student> members = new ArrayList<>();
		
		// 값추가 방법
		list.add(3);
		list.add(null);
		// 리스트는 인덱스가 있으므로, 삽입위치 지정도 가능하다.
		list.add(1, 10);
		
		System.out.println("값추가 확인 : "+list);
		
		// 값 삭제 방법
		list.remove(2);
		
		System.out.println("값삭제 확인 : "+list);
		
//		list.clear();
//		System.out.println("한번에삭제 확인 : "+list);

		// 사이즈 확인
		System.out.println("사이즈 확인 : "+list.size());
		
		// 리스트 계열 자료구조 활용
		System.out.println("0번째 인덱스 값 : "+list.get(0));
		
		for (Integer integer : list) {
			System.out.println("for사용 값확인 : "+integer);
		}
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("iterator사용 값확인 : "+iter.next());
		}
		
		// ArrayList 값 검색하는 방법
		// contains() 메서드는 리스트 안에 값이 있는 지 확인한다 -> boolean 데이터 타입으로 반환
		System.out.println(list.contains(1));
		System.out.println(list.contains(3));
		
		// 인덱스 번호 검색하는 방법
		// 값이 있으면 해당 인덱스 번호를 반환하고, 없으면 -1을 반환한다.
		System.out.println(list.indexOf(3));
		System.out.println(list.indexOf(10));
		System.out.println(list.indexOf(1));
		
		
	}
	
	
}
















