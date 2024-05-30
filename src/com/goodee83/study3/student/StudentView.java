package com.goodee83.study3.student;

public class StudentView {
	
	public void view3(String str) {
		System.out.println(str);
	}
	
	public void view2(Student student) {

		System.out.println(student.name);
		System.out.println(student.num);
		System.out.println(student.kor);
		System.out.println(student.eng);
		System.out.println(student.math);
		System.out.println(student.total);
		System.out.println(student.aver);
		
	}

	public void view(Student[] students) {

		for (int i = 0; i < students.length; i++) {
			System.out.print("이름 : " + students[i].name);
			System.out.print(" 번호 : " + students[i].num);
			System.out.print(" 국어 : " + students[i].kor);
			System.out.print(" 영어 : " + students[i].eng);
			System.out.print(" 수학 : " + students[i].math);
			System.out.print(" 총점 : " + students[i].total);
			System.out.print(" 평균 : " + students[i].aver);
			System.out.println("");
		}
		
	}
}
