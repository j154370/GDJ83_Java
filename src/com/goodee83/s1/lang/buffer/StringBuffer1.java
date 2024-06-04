package com.goodee83.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열을 누적시키고 싶을 때 사용
		StringBuffer sb = new StringBuffer();
		
		sb.append("winter");
		sb.append("iu");
		sb.append(10);
		
		String result = sb.toString();
		System.out.println(result);
		
		
	}

}
