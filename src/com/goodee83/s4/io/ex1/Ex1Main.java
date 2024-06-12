package com.goodee83.s4.io.ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex1Main {

	public static void main(String[] args) {
		ReadStudy read = new ReadStudy();

		List<MenuDTO> dtos = read.read();

	}

}
