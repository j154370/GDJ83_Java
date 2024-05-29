package com.goodee83.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		Scanner input = new Scanner(System.in);
		StudentService studentService = new StudentService();
		Student[] students = null;

		while (true) {
			System.out.println("1. 학생 정보 입력 | 2. 전체 출력 | 3. 학생 정보 검색 | 4. 프로그램 종료");
			int select = input.nextInt();

			if (select == 1) {
				students = studentService.makeStudent();
				

			} else if (select == 2) {
				for (int i = 0; i < students.length; i++) {
					System.out.println(students[i].name);
					
				}

			} else if (select == 3) {
				System.out.println("학생 정보 검색 코드 작성");
				
				
			} else if (select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
				
			} else {
				System.out.println("올바른 번호를 입력해주세요.");
				continue;
				
				
			}
		}
	}

}
