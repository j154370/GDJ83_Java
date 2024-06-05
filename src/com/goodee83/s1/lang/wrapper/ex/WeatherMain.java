package com.goodee83.s1.lang.wrapper.ex;

public class WeatherMain {

	public static void main(String[] args) {
		// DTO (Data Transfer Object) : Data를 담고 있고 Data를 운반 당하는 오브젝트
		// VO (Value Object)
		
//		WeatherService service = new WeatherService();
//		WeatherDTO[] dtos = service.init();
//		
//		WeatherView view = new WeatherView();
//		view.view(dtos);
		
		WeatherController controller = new WeatherController();
		controller.start();
		
		
	
		
		
		

	}

}
