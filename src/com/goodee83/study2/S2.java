package com.goodee83.study2;

public class S2 {
	public static void main(String[] args) {

		// JAVA는 메모리 영역을 3가지로 나눠서 구분한다.
		// 1. 메서드 영억 -> 메서드 영역에 만들어진 변수를 '클래스 변수', 'static 변수'라고 부른다.
		// 2. 스택 영역 -> 메서드가 실행 될 때 차지하는 영역, 스택 영역은 선입후출(First in Last out)구조를 가진다.
		// ㄴ> 스택 영역에 만들어진 변수를 '지역 변수'라고 부른다.
		// 3. 힙 영역
		// ㄴ> 힙 영역에 만들어진 변수를 '인스턴스 변수'라고 부른다.

		int[] arr = new int[3];
		int[] arr2 = { 1, 2, 3 };
		String[] names = new String[2];

		System.out.println(arr);
		System.out.println(names);

		System.out.println(arr2[2]);
		System.out.println(names[0]);
		arr[0] = 50;
		arr = arr2;
		System.out.println(arr[0]);
	}

}
