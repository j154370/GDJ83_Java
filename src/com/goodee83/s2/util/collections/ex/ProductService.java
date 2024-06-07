package com.goodee83.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ProductService {
	
	private StringBuffer sb;
	
	
	public ProductService() {
		sb = new StringBuffer();
		sb.append("50000, iphone, 50,");
		sb.append("45000, Galaxy, 100,");
		sb.append("30000, BlackBerry, 20");
	}
	
	
	public ArrayList<ProductDTO> init() {
		//StringBuffer로 추가한 엘리먼트를 String 타입으로 바꿈
		String info = sb.toString();
		
		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<ProductDTO> dtos = new ArrayList<ProductDTO>();
		
		while(st.hasMoreTokens()) {
			ProductDTO dto = new ProductDTO();
			dto.setPrice(Integer.parseInt(st.nextToken().trim()));
			dto.setName(st.nextToken().trim());
			dto.setStock(Integer.parseInt(st.nextToken().trim()));
			
			dtos.add(dto);
		}
		return dtos;
	}

}
