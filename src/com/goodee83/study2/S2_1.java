package com.goodee83.study2;

import java.util.Scanner;

public class S2_1 {
	public static void main(String[] args) {

		int[] arr = new int[5];

		// 각 인덱스 칸에 값을 키보드로 입력받아서 저장하기

		Scanner input = new Scanner(System.in);

		System.out.println("정수 5개를 입력하세요.");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("배열의 크기를 입력");
		
		int num = input.nextInt();
		int[] arr2 = new int[num];
		
	}
}
