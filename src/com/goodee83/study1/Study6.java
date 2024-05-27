package com.goodee83.study1;

public class Study6 {
	public static void main(String[] args) {
		
		int total = 290;
		int average = total/3;
		
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//평균이 60점 미만이면 F
		
		switch(average/10) {
		case 10:
		case 9:
			System.out.println("A입니다");
			int n = 10;
			break;
		case 8:
			System.out.println("B입니다");
			break;
		case 7:
			System.out.println("C입니다");
			break;
		case 6:
			System.out.println("D입니다");
			break;
		default:
			System.out.println("F입니다");
		}
			
		
	}

}
