package com.goodee83.study3;

import java.util.Random;

public class StudyReturn {
	
	
	
	
	public int t1() {
		int num = 3;
		int num2 = 6;
		return num*num2;
	}
	
	
	public void t2() {
		Random random = new Random();
		
		// 0이상 10미만의 정수 하나를 랜덤하게 리턴한다.
		int num = random.nextInt(10);
		if(num%2 == 0) {
			return;
		}else {
			System.out.println(num);
		}
	}
	
	public void t4(int sal) {
		//월급을 받아서 3.3%를 제외한 실수령액을 계산하는 메서드
		double result =  sal - sal*0.033;
		System.out.println(result);
		
		sal=100;
	}
	
	public void t5(Test test) {
		System.out.println(test.level);
		test.level = 200;
		test = new Test();
		test.level = 500;
		
		
	}
	
}
