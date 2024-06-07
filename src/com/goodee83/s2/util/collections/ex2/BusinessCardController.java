package com.goodee83.s2.util.collections.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class BusinessCardController {
	private Scanner sc;
	private BusinessCardService service;
	private ArrayList<BusinessCardDTO> dtos;
	private BusinessCardView view;
	
	
	public BusinessCardController() {
		sc = new Scanner(System.in);
		service = new BusinessCardService();
		dtos = new ArrayList<BusinessCardDTO>();
		view = new BusinessCardView();
	}
	
	
	public void start() {
		dtos = service.init();
		
		while(true) {
			System.out.println("1. 명함 출력 | 2. 명함 추가 | 3. 명함 삭제 | 4. 프로그램 종료");
			int menu = sc.nextInt();
			
			if(menu == 1) {
			 	view.view(dtos);
			}else if(menu == 2) {
				service.addCard(dtos);
			}else if(menu == 3) {
				int result = service.removeCard(dtos);
				if(result > 0) {
					System.out.println("명함을 삭제하였습니다.");
				}else {
					System.out.println("잘못된 입력입니다.");
				}
			}else if(menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}
		}
		
	}

}
