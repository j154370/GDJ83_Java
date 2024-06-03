package com.goodee83.s1.lang;

public class S5Main {

	public static void main(String[] args) {

		String name = " winter ";
		System.out.println(name);
		System.out.println(name.length());
		
		name = name.strip();
		System.out.println(name);
		System.out.println(name.length());
		
		name = "winter-24*서울";
		name = name.replace("*", "-");
		String[] datas = name.split("-");   // 하나의 문자열을 여러개의 문자열로 나누는 작업을 '파싱'이라 한다.
		
		
		for(int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		String s = String.valueOf(10.2);    // 어떤 타입이든 String으로 바꾸는 매서드
		System.out.println(s);
		

	}

}
