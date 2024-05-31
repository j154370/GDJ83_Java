package com.goodee83.s4;

public class Customer {
	
	int money;
	int point;
	
	
	//매개변수를 하나만 선언
	public void buy(Product product) {
		this.money = this.money - product.price;
		this.point = this.point + product.point;
		
		System.out.println(money);
		System.out.println(point);
		
	}

}
