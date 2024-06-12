package com.goodee83.s4.io;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		//study2 폴더 삭제
		
		File file = new File("C:\\Study2");
		
		File[] files = file.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			files[i].delete();
		}
		
		file.delete();

	}

}
