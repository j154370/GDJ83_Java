package com.goodee83.study1;

import java.util.Scanner;

public class Study7 {
	public static void main(String[] args) {
		
		//3과목의 점수를 입력받아서 합계를 구하고자 한다.
		Scanner input = new Scanner(System.in);
		int total = 0;
		
		System.out.println("정수를 입력하세요");
		for(int i=0; i<3; i++) {
			int num = input.nextInt();
			total = total + num;
		}
		
		System.out.println(total);
		
		int c = 97;
		for(int i=0; i<26; i++) {
			System.out.println((char)c);
			c++;
		}
	}
}
