package com.goodee83.s3.exceptions;

public class Exception2 {

	
	public void sum(int n1, int n2) throws MyException{
		
		// 세 자리수 이상은 불가능함
		int sum = n1 + n2;
		
		if(sum > 99) {
			throw new MyException("3자리수는 몰라요");
		}
	}
}
