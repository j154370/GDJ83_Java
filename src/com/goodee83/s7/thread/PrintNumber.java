package com.goodee83.s7.thread;

public class PrintNumber extends Thread{
	
	public synchronized void info() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void run() {
		this.info();
	}

}
