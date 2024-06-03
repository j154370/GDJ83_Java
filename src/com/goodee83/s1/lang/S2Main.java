package com.goodee83.s1.lang;

import java.util.Scanner;

public class S2Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = "abc";
		String s2 = "abc";
		
		
		System.out.println(s1.equals(s2));
		
		Test t1 = new Test();
		Test t2 = new Test();
		
		System.out.println(t1.equals(t2));
		
		System.out.println("문자를 입력하세요.");
		String s3 = sc.next();
		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		
	}

}
