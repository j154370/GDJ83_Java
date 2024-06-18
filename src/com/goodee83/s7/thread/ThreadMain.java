package com.goodee83.s7.thread;

public class ThreadMain {

	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		PrintWord pw = new PrintWord();
		Thread thread = new Thread(pw);
		
		pn.start();
		thread.start();

	}

}
