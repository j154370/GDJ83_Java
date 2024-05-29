package com.goodee83.study3.student;

import java.util.Scanner;

public class StudentService {

	public Student[] makeStudent() {
		Scanner input = new Scanner(System.in);

		System.out.println("학생의 수를 입력하세요.");
		int num = input.nextInt();
		
		// 학생들을 모을 배열을 리턴
		Student[] students = new Student[num];
		
		for(int i = 0; i<students.length; i++) {
			Student s = new Student();
			System.out.println(i + 1 + " 번째 이름 입력");
			s.name = input.next();
			System.out.println(s.name + "의 번호 입력");
			s.num = input.nextInt();
			System.out.println(s.name + "의 국어 점수 입력");
			s.kor = input.nextInt();
			System.out.println(s.name + "의 영어 점수 입력");
			s.eng = input.nextInt();
			System.out.println(s.name + "의 수학 점수 입력");
			s.math = input.nextInt();
			
			s.total = s.kor + s.eng + s.math;
			s.aver = s.total / 3.0;
			
			students[i] = s;
		}
		
		return students;

	}
}
