package com.goodee83.study1;

public class Study2 {

	public static void main(String [] args) {
		
		int age = 30;
		System.out.println(age);
		
		String name = "Leejeonghyo";
		
		// 형변환 (Casting)- type의 변환
		
		long num1 = 30L;
		int num2 = (int)num1;
		
		float f1 = 1.2f;
		double d1 = f1;   // 자동 형변환,상위 데이터 type은 하위 데이터 type을 별도의 변환 없이 포함할 수 있다.
		
		int total = 100;
		double average = (double)total/3;
		
		average = 33.22;
		total = (int)(average *10);
		
		System.out.println(average);
		System.out.println(total);
	}
}
