package com.goodee83.s1.lang.wrapper.ex;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	Scanner sc = new Scanner(System.in);

	// Controller
	// business Layer <- 현재는 여기
	// DAO (Data Access Object)

	private StringBuffer sb;

	public WeatherService() {
		this.sb = new StringBuffer();
		this.sb.append("서울 , 29.3 - 맑음 - 60");
		this.sb.append("-부산 , 33.6 - 흐림 - 90");
		this.sb.append("-제주 , 26.5 - 눈 - 30");
		this.sb.append("-광주 , 10.6 - 태풍 - 80");
	}

	public WeatherDTO[] init() {
		// sb에 있는 데이터를 문자열 변수에 담아서 출력
		String info = sb.toString();

		info = info.replace(",", "-");

		WeatherDTO[] dtos = this.useTokenizer(info); //this.getWeathers(info);

		return dtos;

	}
	
	private WeatherDTO[] useTokenizer(String info) {
		StringTokenizer st = new StringTokenizer(info, "-");
		WeatherDTO[] dtos = new WeatherDTO[4];

		int i = 0;
		while(st.hasMoreTokens()) {
			WeatherDTO dto = new WeatherDTO();
			dto.setCity(st.nextToken().trim());
			dto.setTemperature(Double.parseDouble(st.nextToken().trim()));
			dto.setStatus(st.nextToken().trim());
			dto.setHumidity(Integer.parseInt(st.nextToken().trim()));
			
			dtos[i] = dto;
			i++;
		}
		return dtos;
		
	}

	private WeatherDTO[] getWeathers(String info) {

		String[] ar = info.split("-");
		WeatherDTO[] dtos = new WeatherDTO[ar.length / 4];

		int j = 0;
		for (int i = 0; i < ar.length; i += 4) {
			WeatherDTO dto = new WeatherDTO();
			dto.setCity(ar[i].trim());
			dto.setTemperature(Double.parseDouble(ar[i + 1].trim()));
			dto.setStatus(ar[i + 2].trim());
			dto.setHumidity(Integer.parseInt(ar[i + 3].trim()));

			dtos[j] = dto;
			j++;
		}

		return dtos;
	}

	// 날씨 정보를 도시명으로 검색 메서드
	// 검색해서 해당 날씨 정보를 리턴한다. 출력은 view에서만 한다.
	// view에는 날씨 정보 하나만 출력하는 메서드가 필요하다.

	public WeatherDTO findByCity(WeatherDTO[] dtos) {

		System.out.println("찾고자 하는 도시 명을 입력하세요.");
		String search = sc.next();

		for (int i = 0; i < dtos.length; i++) {

			if (search.equals(dtos[i].getCity())) {
				return dtos[i];
			}
		}
		return null;

	}

	// 날씨 정보를 추가하는 메서드를 만든다.
	// 메서드 명은 addWeather로 한다.
	// DTO의 변수들을 입력받아서 기존의 배열에 추가한다.

	public WeatherDTO[] addWeather(WeatherDTO[] dtos) {

		WeatherDTO dto = new WeatherDTO();

		WeatherDTO[] dtos2 = new WeatherDTO[dtos.length + 1];

		for (int i = 0; i < dtos2.length - 1; i++) {
			dtos2[i] = dtos[i];
		}

		dtos2[dtos2.length - 1] = dto;

		System.out.println("추가할 도시 명을 입력하세요.");
		String addCity = sc.next();
		dtos2[dtos2.length - 1].setCity(addCity);

		System.out.println("추가할 기온을 입력하세요.");
		double addTemp = sc.nextDouble();
		dtos2[dtos2.length - 1].setTemperature(addTemp);

		System.out.println("추가할 날씨를 입력하세요.");
		String addStatus = sc.next();
		dtos2[dtos2.length - 1].setStatus(addStatus);

		System.out.println("추가할 습도를 입력하세요.");
		int addHum = sc.nextInt();
		dtos2[dtos2.length - 1].setHumidity(addHum);

		return dtos2;

	}
	
	// 검색해서 일치하는 번호를 삭제
	// removeWeather
	
	public WeatherDTO[] removeWeather(WeatherDTO[] dtos) {
		
		System.out.println("삭제하고자 하는 도시 명을 입력하세요.");
		String search = sc.next();
		
		WeatherDTO[] dtos2 = new WeatherDTO[dtos.length-1];
		
		int j = 0;
		for(int i = 0 ; i < dtos.length; i++) {
			if(search.equals(dtos[i].getCity())) {
				continue;
			}
			if(j == dtos.length-1) {
				return dtos;
			}
			dtos2[j] = dtos[i];
			j++;
			// 문제 코드 : 한 번도 일치하는게 없을 경우 바운더리 입센션 발생
		}
		
		return dtos2;
	}

}
