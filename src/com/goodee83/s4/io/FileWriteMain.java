package com.goodee83.s4.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();
		
		// 문자열 -> 문자 -> 이진데이터로 변환
		
		File file = new File("C:\\Study", fileName);
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true);
			
			// e 또는 E가 입력되면 종료
			while(true) {
				System.out.println("입력");
				String s = sc.next();
				if(s.equals("e") || s.equals("E")) {
					break;
				} else {
					fw.write(s + "\r\n");					
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("프로그램 종료");
		

	}

}
