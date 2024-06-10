package com.goodee83.s3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
		int num = 10;
		
		System.out.println("숫자 입력");
		int num2 = sc.nextInt();
		
		System.out.println(num / num2);
//		throw new ArithmeticException();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력하세요");
		} catch (Exception e) {
			
		} catch (Throwable e) {
			
		}
		
		Exception1 ex = new Exception1();
		try {
			ex.ex1(0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");

	}

}
