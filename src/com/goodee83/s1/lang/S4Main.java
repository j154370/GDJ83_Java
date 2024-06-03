package com.goodee83.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name = "computer Science";

		System.out.println(name.substring(5, 8));

		// 확장자 분리 코드
		System.out.println("파일명(확장자 포함)을 입력하세요.");
		name = sc.next();

		int a = name.lastIndexOf(".");
		String result = name.substring(a + 1);

		System.out.println(result);

//		if (result.equals("jpg")) {
//			System.out.println("이미지 파일 입니다.");
//		} else if (result.equals("jpeg")) {
//			System.out.println("이미지 파일 입니다.");
//		} else if (result.equals("png")) {
//			System.out.println("이미지 파일 입니다.");
//		} else if (result.equals("gif")) {
//			System.out.println("이미지 파일 입니다.");
//		} else if (result.equals("jiff")) {
//			System.out.println("이미지 파일 입니다.");
//		} else {
//			System.out.println("이미지 파일이 아닙니다.");
//		}
//	}


		String[] ar = { "jpg", "png", "jpeg", "gif", "jiff" };
		
		String s = "이미지 파일이 아닙니다.";
			for (int i = 0; i < ar.length; i++) {
				if (result.equals(ar[i])) {
					s = "이미지 파일입니다.";
					break;
				}	
			}System.out.println(s);			
		}
	}
