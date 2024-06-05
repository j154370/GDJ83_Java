package com.goodee83.s1.lang.wrapper.ex;

import java.util.Scanner;

public class WeatherController {
	private WeatherDTO[] dtos;
	private WeatherService service;
	private WeatherView view;

	public WeatherController() {
		service = new WeatherService();
		dtos = service.init();
		view = new WeatherView();
	}

	public void start() {
		Scanner sc = new Scanner(System.in);

		// dtos의 초기화는 WeatherController의 생성자 내에서 초기화
		// 1. 날씨 전체 정보 출력
		// 2. 종료

		while (true) {
			System.out.println("1. 날씨 정보 출력 | 2. 종료");
			int menu = sc.nextInt();
			
			if (menu == 1) {
				view.view(dtos);
			} else if (menu == 2) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("올바른 메뉴를 선택해주세요.");
				continue;
			}

		}
	}
}