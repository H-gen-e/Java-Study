package ch02;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class DataStructureTest02 {

	public static void main(String[] args) {

//		Map<K, V> map;
//		Map �迭 �ڷᱸ���� key �� value ������ �����͸� �����Ѵ�.
		
//		HashMap �� null �� ���
		HashMap<String, String> map1 = new HashMap<>();
//		HashTable �� null �� ���X
		Hashtable<String, String> map2 = new Hashtable<>();
		
		map1.put("A01", "������������");
		map1.put("A02", "���������Ĺ�");
		map1.put("A03", "�������׷κ�");
		map1.put("B01", "��õ��������");
		map1.put("B02", "��õ�����Ĺ�");
		map1.put("C01", null);
		
		System.out.println(map1);
		System.out.println(map1.get("A03"));
		
		// ���� ���
		map1.remove("C01");
		System.out.println(map1);
//		map1.clear();
//		System.out.println(map1);
		
		// ������ Ȯ�� ���
		System.out.println(map1.size());
		
		// Map �ڷᱸ���� Ȱ��
		// Entry �������̽��� ���� Ű�� ����� �� ���� �޾Ƽ� Ȱ�밡���ϴ�.
		for(Entry<String, String> entry : map1.entrySet()) {
			System.out.println("[key] "+entry.getKey()+" : [value] "+entry.getValue());
		}
		
		for (String key : map1.keySet()) {
			System.out.println(key+" : "+map1.get(key));
		}
		
	}

}
