package com.goodee83.s1.lang.wrapper.ex;

public class WeatherDTO {

	// DTO의 모든 맴버 변수는 private로 설정
	// 때문에 getter와 setter가 필요
	
	private String city;
	private String status;
	private double temperature;
	private int humidity;
	
	
	
	
	//getter와 setter Method
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
}
