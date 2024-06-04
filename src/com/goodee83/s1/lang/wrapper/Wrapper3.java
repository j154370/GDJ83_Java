package com.goodee83.s1.lang.wrapper;

import java.util.Scanner;


public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주민등록 번호를 입력하세요.");
		// 960815-11*****
		String jumin = sc.next();
		
		
		// 1. 성별 검증
		String check = jumin.substring(7, 8);
		
		if(check.equals("1") || check.equals("3") || check.equals("5")) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		
		
		// 2. 나이를 계산 ( 2024 - 출생년도 )
		String s = jumin.substring(0, 2);
		StringBuffer sb = new StringBuffer();
		sb.append("19");
		sb.append(s);
		String result = sb.toString();
		int a = Integer.parseInt(result);
		int age = 2024 - a;
		
		System.out.println("고객님의 나이는 " + age + "세 입니다.");
		
		
		
		// 3. 주민번호 유효성 검증
		// 9  5  1  2  2  6  -  1  2  3  4  5  6  7(검증용 숫자)
		// *2 *3 *4 *5 *6 *7 - *8 *9 *2 *3 *4 *5 
		// 18 15 4 10 12 42  -  8 18  6 12 20 30  7
		// 총합을 11로 나눈 나머지를 구해라
		// 나머지에 11을 뺀 결과값을 검증용 숫자와 같은지 비교
		// 만약 결과값이 두 자리 수 라면 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자와 비교
		
		String jumin2 = jumin.replace("-", "");
		char[] ar = jumin2.toCharArray();
		int count = 2;
		int total = 0;
		
		for(int i = 0; i < ar.length - 1; i++) {
			total += Integer.parseInt(String.valueOf(ar[i])) * count;
			count++;
			if(count > 9) {
				count = 2;
			}
		}
		
		int test = 11 - (total % 11);
		if(test == Integer.parseInt(String.valueOf(ar[12])) || test % 10 == Integer.parseInt(String.valueOf(ar[12]))) {
			System.out.println("정상적인 주민등록 번호 입니다.");
		}else {
			System.out.println("정상적이지 않은 주민등록 번호입니다.");
		}
	}
}
