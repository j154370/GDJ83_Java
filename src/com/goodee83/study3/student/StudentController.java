package com.goodee83.study3.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		Scanner input = new Scanner(System.in);
		StudentService studentService = new StudentService();
		StudentView studentView = new StudentView();
		Student[] students = null;

		while (true) {
			System.out.println("1. 학생 정보 입력 | 2. 전체 출력 | 3. 학생 정보 검색 | 4. 프로그램 종료");
			int select = input.nextInt();

			if (select == 1) {
				students = studentService.makeStudent();

			} else if (select == 2) {
				if (students != null) {
					studentView.view(students);
				} else {
					System.out.println("입력된 정보가 없습니다.");
				}

			} else if (select == 3) {
				Student student = studentService.findByNum(students);
				if (student != null) {
					studentView.view(student);
				} else {
					studentView.view("검색 결과가 없습니다.");
				}

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
