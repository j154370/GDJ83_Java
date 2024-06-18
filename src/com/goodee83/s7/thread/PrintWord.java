package com.goodee83.s7.thread;

public class PrintWord implements Runnable{
	
	@Override
	public void run() {
		this.print();
		
	}
	
	public void print() {
		
		for(int i = 'a'; i < 'a' + 10; i ++) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
