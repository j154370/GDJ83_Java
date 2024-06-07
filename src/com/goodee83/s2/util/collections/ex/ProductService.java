package com.goodee83.s2.util.collections.ex;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductService {

	private StringBuffer sb;
	private Scanner sc;

	public ProductService() {
		sb = new StringBuffer();
		sc = new Scanner(System.in);
		sb.append("50000, iphone, 50,");
		sb.append("45000, Galaxy, 100,");
		sb.append("30000, BlackBerry, 20");
	}

	public ArrayList<ProductDTO> init() {
		// StringBuffer로 추가한 엘리먼트를 String 타입으로 바꿈
		String info = sb.toString();

		StringTokenizer st = new StringTokenizer(info, ",");
		ArrayList<ProductDTO> dtos = new ArrayList<ProductDTO>();

		while (st.hasMoreTokens()) {
			ProductDTO dto = new ProductDTO();
			dto.setPrice(Integer.parseInt(st.nextToken().trim()));
			dto.setName(st.nextToken().trim());
			dto.setStock(Integer.parseInt(st.nextToken().trim()));

			dtos.add(dto);
		}
		return dtos;
	}

	// 기존 ArrayList에 새 상품을 추가

	public void addProduct(ArrayList<ProductDTO> dtos) {

		ProductDTO dto = new ProductDTO();
		System.out.println("상품명을 입력하세요.");
		dto.setName(sc.next());
		System.out.println("가격을 입력하세요.");
		dto.setPrice(sc.nextInt());
		System.out.println("재고를 입력하세요.");
		dto.setStock(sc.nextInt());

		dtos.add(dto);  // add는 성공시 true를 리턴해준다. 이걸 호출시 받아서 사용할 수가 있다.

	}

	// 기존 ArrayList에 상품을 제거

	public int removeProduct(ArrayList<ProductDTO> dtos) {

		System.out.println("삭제하고자 하는 상품명을 입력하세요.");
		String search = sc.next();
		int result = 0;
		
		for (int i = 0; i < dtos.size(); i++) {
			if (search.equals(dtos.get(i).getName())) {
				dtos.remove(i);
				result = 1;
				break;
			}
		}
		
		return result;
	}

}
