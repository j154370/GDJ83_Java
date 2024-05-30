package com.goodee83.study3.ex2;

public class Ex2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Study study = new Study();
		int[] ar = {1, 2, 3, 4, 5};
		
		
		ar = study.add(ar);
		//System.out.println(ar.length);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}
		
		System.out.println("");
		ar = study.remove(ar);
		ar = study.remove(ar);
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}

	}

}
