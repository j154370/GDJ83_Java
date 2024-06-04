package com.goodee83.s1.lang.wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		Integer i = new Integer("10");

		int num = 10;
		
		int a = Integer.parseInt("1234");
		int b = 2;
		
		System.out.println(a + b);
		
		
		//auto boxing
		//primitive타입을 강제로 같은 타입의 클래스와 묶는다.
		Integer n1 = num;
		
		//auto unboxing
		num = n1;
		
		Double d1 = 3.12;
		
		n1 = (int)3.12;
		
		
		
		
	}

}
