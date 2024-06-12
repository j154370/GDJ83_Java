package com.goodee83.s4.io.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadStudy {

	public List<MenuDTO> read() {
		// info.txt 파일을 읽어오기
		// 1. 항목별로 읽어서 파싱후 출력

		File file = new File("C:\\Study", "info.txt");
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<MenuDTO> dtos = new ArrayList<MenuDTO>();

		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			while (true) {
				MenuDTO dto = new MenuDTO();
				String s = br.readLine();
				if (s == null) {
					break;
				}
				StringTokenizer st = new StringTokenizer(s , ",");

				while(st.hasMoreTokens()) {
					dto.setMenuName(st.nextToken().trim());
					dto.setPrice(Integer.parseInt(st.nextToken().trim()));
					dto.setKcal(Integer.parseInt(st.nextToken().trim()));
					
					dtos.add(dto);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("종료");

	
		return dtos;
	}

}
