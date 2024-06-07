package com.goodee83.s2.util.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain3 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(8);
		hs.add(15);
		
		
		//set에서 요소를 하나씩 꺼내기 위해서는 Iterator를 사용해야 된다...
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
		

	}

}
