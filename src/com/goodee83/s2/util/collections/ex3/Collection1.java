package com.goodee83.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Collection1 {
	
	public List<Integer> makeList() {
		//ArrayList<Integer> ar = new ArrayList<Integer>();
		List<Integer> ar = new LinkedList<Integer>();
		
		
		ar.add(1);
		ar.add(2);
		ar.add(5);
		
		return ar;
	}
	
	public Map<String, Integer> makeMap() {
		Map map = new HashMap<String, Integer>();
		map.put("k1", 100);
		
		return map;
	}

}
