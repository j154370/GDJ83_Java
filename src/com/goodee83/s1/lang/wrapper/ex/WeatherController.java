package com.goodee83.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {
	private WeatherService service;
	private WeatherDTO[] dtos;
	private WeatherView view;
	private WeatherDTO dto;

	
	// 생성자
	public WeatherController() {
		service = new WeatherService();
		dtos = service.init();
		view = new WeatherView();
		dto = new WeatherDTO();
	}

	// 매서드
	public void start() {
		Scanner sc = new Scanner(System.in);

		// dtos의 초기화는 WeatherController의 생성자 내에서 초기화
		// 1. 날씨 전체 정보 출력
		// 2. 종료

		while (true) {
			System.out.println("1. 날씨 정보 출력 | 2. 날씨 정보 검색 | 3. 날씨 정보 추가 |  4. 날씨 정보 삭제 | 5. 종료");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				view.view(dtos);
			} else if (menu == 2) {
				dto = service.findByCity(dtos);
				view.singleView(dto);
			} else if(menu == 3){
				dtos = service.addWeather(dtos);
			}else if(menu == 4){
				dtos = service.removeWeather(dtos);
			}else if(menu == 5){
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
			}

		}
	}
}