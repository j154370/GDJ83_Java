package com.goodee83.s4.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IoMain {

	public static void main(String[] args) {
		// bit를 처리
		InputStream is = System.in;
		// char 문자들을 처리
		InputStreamReader ir = new InputStreamReader(is);
		// String을 만드는 애가 필요
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("입력하세요");
		String s = "";
		try {
			s = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(s);

	}

}
