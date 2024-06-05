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
	
	public void singleView(WeatherDTO dto) {
			
			if(dto == null) {
				System.out.println("잘못된 지역명입니다. 다시 입력해주세요.");
			}else {
				System.out.print(dto.getCity() + "	-	");
				System.out.print(dto.getTemperature() + "	-	");
				System.out.print(dto.getStatus() + "	-	");
				System.out.print(dto.getHumidity());
				System.out.println("");
			}
	}

}
