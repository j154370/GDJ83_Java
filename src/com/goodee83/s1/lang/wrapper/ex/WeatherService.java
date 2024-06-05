package com.goodee83.s1.lang.wrapper.ex;

public class WeatherService {

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
		
		WeatherDTO[] dtos = this.getWeathers(info);
		
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

}
