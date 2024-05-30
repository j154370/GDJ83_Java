package com.goodee83.study3.ex4;

public class Ex4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new 생성자 호출
		Car car = new Car();
		
		car.info();
		
		Car car2 = new Car(2000);
		car2.info();
		
		Car car3 = new Car(2000, "pink", "K10");
		car3.info();
		
		Bike bike = new Bike("red", 1500);

	}

}
