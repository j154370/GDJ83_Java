package com.goodee83.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class CollectionMain {

	public static void main(String[] args) {
		Collection1 c1 = new Collection1();
		Collection2 c2 = new Collection2();
		
		List<Integer> ar = c1.makeList();
		c2.useList(ar);
		
		
		Map map = new HashMap<String, Integer>();
		c2.useMap(map);
		

	}

}
