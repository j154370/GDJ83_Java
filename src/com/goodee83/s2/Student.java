package com.goodee83.s2;

public class Student {
	
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double aver;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int num) {
		// TODO Auto-generated constructor stub
		this.num = num;
	}
	
	
	public void info() {
		System.out.println(this.num);
	}
	
	
	
	
	
	// getter setter method
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}

}
