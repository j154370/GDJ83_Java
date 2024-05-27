package com.goodee83.study1;

public class Study3 {
	public static void main(String [] args) {
		
		
		// 연결연산자의 경우 숫자와 문자가 만나면 문자열로 바뀐다.
		System.out.println("1" + 1);
		System.out.println(1 + "1" + 1);
		System.out.println(1 + 'a' + "1");
		
		//예제1
		
		int total = 25500;
		int money = 50000;
		int safeMoney = money - total;
		
		int man = safeMoney/10000;
		int chun = (safeMoney/1000)%10;
		int back = (safeMoney/100)%10;
		int ship = (safeMoney/10)%10;
		
		
		System.out.println("잔돈 : " + safeMoney + "원");
		System.out.println("만원 : " + man + "장");
		System.out.println("천원 : " + chun + "장");
		System.out.println("백원 : " + back + "장");
		System.out.println("십원 : " + ship + "장");
		
		
	}
}
