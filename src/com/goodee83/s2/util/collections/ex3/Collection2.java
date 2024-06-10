package com.goodee83.s2.util.collections.ex3;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Collection2 {
	
	public void useList(List<Integer> ar) {
		
//		for(int i = 0 ; i < ar.size(); i++) {
//			System.out.println(ar.get(i));
//		}
		
		// 향상된 for 문
		// for : for(꺼낼데이터타입 변수명 : collection의 참조변수명) {}
		
		for(Integer n : ar) {
			System.out.println(n);
		}
		
	
	}
	
	public void useMap(Map<String, Integer> map) {
		System.out.println(map.get("k1"));
	}

}
