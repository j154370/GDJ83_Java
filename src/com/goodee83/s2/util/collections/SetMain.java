package com.goodee83.s2.util.collections;

import java.util.HashSet;

import com.goodee83.s2.util.collections.ex.ProductDTO;

public class SetMain {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("first");
		hs.add("second");
		hs.add("third");
		hs.add("second");
		System.out.println(hs);
		
		HashSet<ProductDTO> hs2 = new HashSet<ProductDTO>();
		
		ProductDTO dto = new ProductDTO();
		ProductDTO dto2 = new ProductDTO();
		
		dto2 = dto;
		hs2.add(dto);
		hs2.add(dto2);
		
		System.out.println(hs2);
		
		

	}

}
