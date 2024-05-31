package com.goodee83.s4;

public class Car {
	
	public static final String COMPANY = "ABC";
	
	
	public int price;
	
	
	public static void info() {
		System.out.println("static method");
	}
	
	public void info2() {
		Car.info();
		final int num = 30;
	}

}
