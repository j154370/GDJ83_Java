package com.goodee83.s1.lang;

public class S3Main {

	public static void main(String[] args) {
		String name = "final.pdf";

		// int value = name.indexOf("pdf"); // char 문자를 넣을시 해당 문자열에 특정 문자가 몇 번째 인덱스에 있는지
		// 반환

		// System.out.println(name.indexOf("pdf"));
		boolean flag = true;
		int result = -1;
		
		
		while(flag) {
			result = name.indexOf("f", result + 1);
			
			if(result == -1) {
				break;
			}
			
			System.out.println(result);
			
		}	
		
		System.out.println("종료");
		
	}

}
