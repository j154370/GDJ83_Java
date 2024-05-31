package com.goodee83.s4;

public class S4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv = new Tv();
		tv.brand = "SAMSUNG";
		tv.price = 500;
		tv.point = 50;
		tv.size = 100;
		
		Computer computer = new Computer();
		computer.brand = "Apple";
		computer.price = 300;
		computer.point = 30;
		computer.cpu = "M3";
		
		Phone phone = new Phone();
		phone.brand = "LG";
		phone.price = 150;
		phone.point = 15;
		phone.color = "Pink";
		
		Customer customer = new Customer();
		customer.money = 1000;
		customer.point = 0;
		
		customer.buy(phone);
	}

}
