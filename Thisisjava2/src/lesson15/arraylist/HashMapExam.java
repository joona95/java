package lesson15.arraylist;

import java.util.*;

public class HashMapExam {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("태양", 1);
		map.put("지구", 2);
		map.put("화성", 3);
		map.put("지구", 5);
		System.out.println("총 개수: "+map.size());
		System.out.println("\t지구: "+map.get("지구"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		
		map.clear();
		System.out.println("총 Entry 수 : "+map.size());
	}

}
