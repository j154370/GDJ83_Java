package com.goodee83.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "asd, 18, qwe, 20, axcz, 30, qr21d, 15, agd3, 19";

		StringTokenizer st = new StringTokenizer(names, ",");

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) {
			String name = st.nextToken();
			String age = st.nextToken();
			System.out.println(name.trim());
			System.out.println(age.trim());
			System.out.println("=========");
		}
		
	}

}
