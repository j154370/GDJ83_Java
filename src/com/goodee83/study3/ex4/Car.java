package com.goodee83.study3.ex4;

public class Car {
	
	String color;
	String brand;
	String company;
	int price;
		
	
	// 생성자 (Constructor)
	
	public Car() {
		//기본 생성자
		this(2500);   //자기 자신의 또 다른 생성자를 호출  // this()는 생성자 내에서 무조건 첫 줄에 위치해야만 한다.
	}
	
	public Car(int price) {
		this(price, "blcak");
	}
	
	public Car(int price, String color) {
		this(price, color, "k5");
	}
	
	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}
	
	
	public void info() {
		System.out.println(this.color);
		System.out.println(brand);
		System.out.println(price);
	}
	
	

}
