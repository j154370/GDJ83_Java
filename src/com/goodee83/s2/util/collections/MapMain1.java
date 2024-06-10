package com.goodee83.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("k1", 1);
		map.put("k2", 2);
		map.put("k3", 5);
		
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.size());
		System.out.println(map.containsKey("k1"));
		System.out.println(map.containsValue(3));
		System.out.println(map.get("k3"));
		
		map.remove("k2");
		map.clear();
		
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}

	}

}
