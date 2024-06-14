package com.goodee83.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.UUID;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		
		birth.set(1996, 7, 15);
		System.out.println(birth.getTime());
		
		long c = ca.getTimeInMillis();
		System.out.println(c);
		
		System.out.println(1000*60*60*24);
		
		System.out.println(c / (1000*60*60*24));
		
		long b = birth.getTimeInMillis();
		System.out.println(b / (1000*60*60*24));
		
		//1995-03-12
		String n = "1995-03-12";
		String[] nn = n.split("-");
		ca.set(Integer.parseInt(nn[0]), Integer.parseInt(nn[1])-1, Integer.parseInt(nn[2]));
		System.out.println(ca.getTime());
		
		
		ca = Calendar.getInstance();
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm");
		String s = sd.format(ca.getTime());
		System.out.println(s);
		
		String id = UUID.randomUUID().toString();
		System.out.println(id);
	}

}
