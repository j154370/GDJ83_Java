package com.goodee83.study1;

import java.util.Scanner;

public class Study8 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		//1. 입력시 단발모드
		//2. 입력시 점사
		// 탕 *30
		// 타타탕 * 10
		
		for(int i=0; i<3; i++) {
			System.out.println("1. 단발, 2. 점사 : 옵션을 선택하세요");
			int option = input.nextInt();
			for(int j=0; j<30; j++) {
				if(option == 1) {
					System.out.println("탕");
				}else if(option == 2){
					System.out.println("탕탕탕");
					j++;
					j++;
				}else {
					System.out.println("잘못 입력하였습니다. 올바른 번호를 입력해주세요");
					i--;
					break;
				}
			}
		}
		
	}
}
