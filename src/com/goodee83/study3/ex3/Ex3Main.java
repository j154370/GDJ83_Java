package com.goodee83.study3.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.color = "red";
		car.brand = "카니발";
		car.company = "현대";
		
		Car car2 = new Car();
		car2.color = "black";
		car2.brand = "A7";
		car2.company = "Audi";
		
//		System.out.println(car);
//		car.info();
//		System.out.println(car2);
//		car2.info();
		
		Cal cal = new Cal();
		cal.hap(1, 20L);
	}

}
