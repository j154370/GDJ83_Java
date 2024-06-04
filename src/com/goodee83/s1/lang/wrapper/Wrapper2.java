package com.goodee83.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요.");
		String pw = sc.next();

		// pw 중에서 대문자는 한 개 이상 있어야만 한다.
		// pw 길이는 최소 6글자 이상이 되어야 한다.
		// 대소문자, 숫자가 각 1개 이상이 있어야 한다. ( isLowerCase, ISDigit )
		char ch = ' ';
		boolean check = false;
		boolean check2 = false;
		boolean check3 = false;
		boolean logIn = false;
		boolean logIn2 = false;
		boolean logIn3 = false;

		if (pw.length() < 6) {
			System.out.println("패스워드의 길이는 최소 여섯 글자 이상이어야 합니다.");
			return;
		}

		for (int i = 0; i < pw.length(); i++) {
			ch = pw.charAt(i);
			check = Character.isUpperCase(ch);
			if (check == true) {
				logIn = true;
				break;
			}
		}

		for (int i = 0; i < pw.length(); i++) {
			ch = pw.charAt(i);
			check2 = Character.isLowerCase(ch);
			if (check2 == true) {
				logIn2 = true;
				break;
			}
		}

		for (int i = 0; i < pw.length(); i++) {
			ch = pw.charAt(i);
			check3 = Character.isDigit(ch);
			if (check3 == true) {
				logIn3 = true;
				break;
			}
		}


		if (logIn == true && logIn2 == true && logIn3 == true) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("최소 한 개 이상의 대소문자, 숫자를 포함하여야 합니다.");
		}

	}

}
