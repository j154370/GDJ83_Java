package com.goodee83.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		String name = "winter";
		int num = 2;
		ar.add(name);
		ar.add(num); // Integer로 auto-boxing되었다가 object가 되어 넣을 수 있다.
		ar.add(3.12);
		ar.add(false);
		ar.add(num);
		ar.add(1, "test");  // 해당 인덱스 번호에 추가하고자 하는 요소를 집어넣는다. 기존 인덱스가 한칸씩 밀리며 추가
		ar.set(0, 'c');  // 해당 인덱스 번호에 수정하고자 하는 요소를 집어넣는다. 기존 삭제 후 추가
		ar.remove(0);
		ar.remove(2);
		ar.clear();

		
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		LinkedList lk = new LinkedList();  //linkedList는 구조상 인덱스 중간에 대입을 할 때 속도가 빠르다
		lk.add("ad");
		

	}

}
