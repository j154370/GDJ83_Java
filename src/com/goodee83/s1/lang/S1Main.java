package com.goodee83.s1.lang;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// import를 생략 가능한 케이스
		// 1. 같은 패키지 내에 있는 클래스일 경우
		// 2. java.lang 패키지 내의 클래스는 import를 생략할 수 있다.

			String n = "winter";
					
			char ch = n.charAt(0);
			System.out.println(ch);
			
			int l = n.length();
			System.out.println(l);
			
			System.out.println("문자를 입력하세요.");
			n = sc.next();
			
			
			for(int i = 0; i < n.length(); i++) {
				ch = n.charAt(i);
				System.out.println(ch);
			}
			
			System.out.println(n.length() * 1000 + "원 입니다.");
			
	}

}
