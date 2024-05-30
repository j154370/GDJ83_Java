package com.goodee83.study3.ex3;

public class Car {
	
	String color;
	String brand;
	String company;
	
	// 참조변수 this => 자기 자신의 주소를 담고있다.
	// 객체 생성시 값이 대입되는 변수
	// 각각의 객체 내에서만 사용 가능
	
	public void info() {
		System.out.println(this.color);
		System.out.println(this.brand);
		System.out.println(this.company);
	}

}
