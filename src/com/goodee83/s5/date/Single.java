package com.goodee83.s5.date;

public class Single {
	
	//SingleTone 기법 -> 오직 하나의 객체만을 만들기 위해 사용
	
	private static Single single;
	
	private int num = 10;
	
	private Single() {
		
	}
	
	public static Single get() {
		if(single == null) {
			Single.single = new Single();
		}
		return Single.single;
	}

}
