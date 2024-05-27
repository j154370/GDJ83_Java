package com.goodee83.study1;

import java.util.Scanner;

public class Study4 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");  // 0이상의 정수를 입력
		
		int num = input.nextInt();
		int result = num/4*10 + num%4;
		
		System.out.println(num);
		System.out.println(result);
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}
}
