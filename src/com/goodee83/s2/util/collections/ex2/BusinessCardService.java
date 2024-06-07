package com.goodee83.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BusinessCardService {

	private StringBuffer sb;
	private Scanner sc;

	public BusinessCardService() {
		sb = new StringBuffer();
		sc = new Scanner(System.in);
		sb.append("이정효, google, staff,");
		sb.append("김정효, naver, CEO,");
		sb.append("최정효, kakao, manager,");
	}

	public ArrayList<BusinessCardDTO> init() {
		String info = sb.toString();

		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<BusinessCardDTO> dtos = new ArrayList<BusinessCardDTO>();

		while (st.hasMoreTokens()) {
			BusinessCardDTO dto = new BusinessCardDTO();
			dto.setName(st.nextToken().trim());
			dto.setCompany(st.nextToken().trim());
			dto.setPosition(st.nextToken().trim());

			dtos.add(dto);
		}
		return dtos;

	}

	public void addCard(ArrayList<BusinessCardDTO> dtos) {
		
		BusinessCardDTO dto = new BusinessCardDTO();
		System.out.println("이름을 입력하세요.");
		dto.setName(sc.next());
		System.out.println("회사를 입력하세요.");
		dto.setCompany(sc.next());
		System.out.println("직급을 입력하세요.");
		dto.setPosition(sc.next());

		dtos.add(dto);

	}

	public int removeCard(ArrayList<BusinessCardDTO> dtos) {
		System.out.println("삭제할 명함을 입력해주세요.");
		String select = sc.next();
		int result = 0;

		for (int i = 0; i < dtos.size(); i++) {
			if (select.equals(dtos.get(i).getName())) {
				result = 1;
				dtos.remove(i);
				break;
			}

		}
		return result;
	}

}
