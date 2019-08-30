package lesson15.arraylist;

import java.util.*;

public class HashMapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("�¾�", 1);
		map.put("����", 2);
		map.put("ȭ��", 3);
		map.put("����", 5);
		System.out.println("�� ����: "+map.size());
		System.out.println("\t����: "+map.get("����"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		
		map.clear();
		System.out.println("�� Entry �� : "+map.size());
	}

}
