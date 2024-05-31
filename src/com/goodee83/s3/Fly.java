package com.goodee83.s3;

public interface Fly {
	
	// 상수와 추상 메서드만 가능
	// 인터페이스는 무조건 public만 가능하다
	// 무조건 상수만 가능하기에 public static final은 생략이 가능해진다.
	
	int NUM = 1;
	String NAME = "abc";
	
	
	void flyAble();

}
