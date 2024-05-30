package com.goodee83.study3.ex3;

public class Cal {
	
	// 메서드 오버로딩
	// 같은 이름의 매서드를 여러개 만드는 것
	// ★★★ 매개변수의 타입 조합이나 개수가 다르면 성립 
	// 매서드의 내용은 달라도 상관없다
	// println이 대표적인 오버로딩을 적용한 매서드 중 하나
	

	public void hap(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	public void hap(int n1, long n2) {
		System.out.println(n1 + n2);
	}
	
	public void hap(long n1, int n2) {
		System.out.println(n1 + n2);
	}

}
