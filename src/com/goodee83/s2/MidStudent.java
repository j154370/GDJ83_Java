package com.goodee83.s2;

public class MidStudent extends Student {
	
	private int history;

	
	public MidStudent() {
		// TODO Auto-generated constructor stub
		super();
	}
	

	public void midInfo() {
		super.info();
		System.out.println(this.history);
	}
	
	
	
	
	//getter setter method
	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}
	
	
}
