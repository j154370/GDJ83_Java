package com.goodee83.study2;

import java.util.Scanner;

public class S2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 학생 수를 입력 받아서 학생 수 만큼 이름과 국어, 영어, 수학 점수를 입력받아 출력하자.
		// 학생 A의 점수 xx 형식으로 출력

		// 1. 학생 정보 입력 | 2. 학생 정보 출력 | 3. 프로그램 종료

		String[] names = null; // 학생 이름을 집어넣은 스트링 배열
		int[] korean = null;
		int[] english = null;
		int[] math = null;
		int[] numbers = null;
		int[] totals = null;
		double[] averages = null;
		
		while (true) {
			System.out.println("1. 학생 정보 입력 | 2. 학생 정보 출력 | 3. 학생 정보 검색 | 4. 성적순으로 출력 | 5. 프로그램 종료");
			int menu = input.nextInt();

			

			if (menu == 1) {
				System.out.println("학생 수를 입력하세요");
				int num = input.nextInt(); // 학생 수
				
				names = new String[num]; // 학생 이름을 집어넣은 스트링 배열
				korean = new int[num];
				english = new int[num];
				math = new int[num];
				numbers = new int[num];
				totals = new int[num];
				averages = new double[num];

				for (int i = 0; i < names.length; i++) {
					numbers[i] = i + 1;
					System.out.println(numbers[i] + "번째 학생 이름을 입력하세요");
					names[i] = input.next();
					System.out.println(numbers[i] + "번째 학생의 국어 점수를 입력하세요");
					korean[i] = input.nextInt();
					System.out.println(numbers[i] + "번째 학생의 영어 점수를 입력하세요");
					english[i] = input.nextInt();
					System.out.println(numbers[i] + "번째 학생의 수학 점수를 입력하세요");
					math[i] = input.nextInt();

					totals[i] = korean[i] + english[i] + math[i];
					averages[i] = (double) totals[i] / 3;
				}
			} else if (menu == 2) {
				for (int i = 0; i < names.length; i++) {
					System.out.println(numbers[i] + "번재 학생 " + names[i] + "의 국어 점수는 " + korean[i] + "점, 영어 점수는 "
							+ english[i] + "점, 수학 점수는 " + math[i] + "점, 총 점수는 " + totals[i] + "점, 평균 점수는 " + averages[i]
							+ "점 입니다.");
				}
			} else if (menu == 3) {
				System.out.println("몇번째 학생의 정보를 열람하시겠습니까?");
				int search = input.nextInt();
				for(int i = 0; i < numbers.length; i++) {
					if(search == numbers[i]) {
						System.out.println(numbers[i] + "번재 학생 " + names[i] + "의 국어 점수는 " + korean[i] + "점, 영어 점수는 "
								+ english[i] + "점, 수학 점수는 " + math[i] + "점, 총 점수는 " + totals[i] + "점, 평균 점수는 " + averages[i]
								+ "점 입니다.");
					}
				}
				
			}else if (menu==4){
				
				//성적순으로 입력
				int temp = 0;
				for(int i=0; i<averages.length-1;i++) {
					for(int j=i+1; j < averages.length; j++) {
						if(averages[i] < averages[j]) {
							
						}
					}
				}
				
				
				
				
			}else if (menu == 5){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("올바른 번호를 입력해주세요.");
				continue;
			}
		}

	}
}
