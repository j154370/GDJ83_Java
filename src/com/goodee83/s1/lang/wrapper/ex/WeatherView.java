package com.goodee83.s1.lang.wrapper.ex;

public class WeatherView {
	
	// view
	// 날씨들의 정보를 받아서 이쁘게 출력
	
	public void view(WeatherDTO[] dtos) {
		
		for(int i = 0; i < dtos.length; i++) {
			System.out.print(dtos[i].getCity() + "	-	");
			System.out.print(dtos[i].getTemperature() + "	-	");
			System.out.print(dtos[i].getStatus() + "	-	");
			System.out.print(dtos[i].getHumidity());
			System.out.println("");
			
			//ctrl + alt를 누르면 한줄 복사가 가능하다.
		}
		
		
	}

}
