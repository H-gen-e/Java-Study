package ch02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class DataStructureTest02 {

	public static void main(String[] args) {

//		Map<K, V> map;
//		Map 계열 자료구조는 key 와 value 구조로 데이터를 저장한다.
		
//		HashMap 은 null 값 허용
		HashMap<String, String> map1 = new HashMap<>();
//		HashTable 은 null 값 허용X
		Hashtable<String, String> map2 = new Hashtable<>();
		
		map1.put("A01", "김포공항정문");
		map1.put("A02", "김포공항후문");
		map1.put("A03", "김포공항로비");
		map1.put("B01", "인천공항정문");
		map1.put("B02", "인천공항후문");
		map1.put("C01", null);
		
		System.out.println(map1);
		System.out.println(map1.get("A03"));
		
		// 삭제 방법
		map1.remove("C01");
		System.out.println(map1);
//		map1.clear();
//		System.out.println(map1);
		
		// 사이즈 확인 방법
		System.out.println(map1.size());
		
		// Map 자료구조의 활용
		// Entry 인터페이스를 통해 키와 밸류를 한 번에 받아서 활용가능하다.
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[key] "+entry.getKey()+" : [value] "+entry.getValue());
		}
		
		for (String key : map1.keySet()) {
			System.out.println(key+" : "+map1.get(key));
		}
		
	}

}
