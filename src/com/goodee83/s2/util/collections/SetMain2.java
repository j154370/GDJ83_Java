package com.goodee83.s2.util.collections;

import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {

		// 로또 번호
		// 1 - 45 => 중 6개

		Random random = new Random();

		HashSet<Integer> hs = new HashSet<Integer>();

		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}

		System.out.println(hs);

	}

}
