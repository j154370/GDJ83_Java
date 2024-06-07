package com.goodee83.s2.util.collections.ex2;

import java.util.ArrayList;

public class BusinessCardView {
	
	public void view(ArrayList<BusinessCardDTO> dtos) {
		
		for(int i = 0; i < dtos.size(); i++) {
			System.out.print(dtos.get(i).getName() + "\t");
			System.out.print(dtos.get(i).getCompany() + "\t");
			System.out.println(dtos.get(i).getPosition() + "\t");
			System.out.println("=================================");
		}
	}

}
