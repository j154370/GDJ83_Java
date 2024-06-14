package com.goodee83.s2.util.collections.ex;

import java.util.ArrayList;

public class ProductMain {

	public static void main(String[] args) {
		
		
		ProductService service = new ProductService();
		
		ArrayList<ProductDTO> dtos = service.init();
		//service.addProduct(dtos);
		int result = service.removeProduct(dtos);
		
		if(result > 0) {
			System.out.println("삭제 성공!");
		}else {
			System.out.println("삭제 실패...");
		}
		
//		for(int i = 0; i < dtos.size(); i++) {
//			System.out.println(dtos.get(i).getPrice());
//			System.out.println(dtos.get(i).getName());
//			System.out.println(dtos.get(i).getStock());
//			System.out.println("=============");
//		}

	}

}