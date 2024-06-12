package com.goodee83.s4.io;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// bit -> 문자 -> 문자열
		// 파일 정보를 담고있는 객체가 필요하다
		File file = new File("C:\\Study");
		
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.getName());
		System.out.println(file.length());
		
		System.out.println("===================");
		//file = new File("C:\\Study", "test.txt");
		file = new File(file, "sub");
		System.out.println(file.exists());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		if(!file.exists()) {
			file.mkdir();		
		}
		
		file = new File("C:\\Study\\sub2\\student");
		
		file.mkdirs();
		
		file = new File("C:\\Study\\test.txt");
		file.delete();
		
		file = new File("C:\\Study\\sub2");
		file.delete();
		
		file = new File("C:\\Study");
		String[] list = file.list();
		
		for(String s:list) {
			System.out.println(s);
		}
		
		File[] files = file.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()) {
				System.out.println("폴더입니다.");
			}else if(files[i].isFile()){
				System.out.println("파일입니다.");
			}else {
				System.out.println("아무것도 아닙니다.");
			}
			System.out.println("------------------");
		}
	}

}
