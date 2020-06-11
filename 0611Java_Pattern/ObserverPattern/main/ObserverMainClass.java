package main;

import Observer.ObserverA;
import Observer.ObserverB;

public class ObserverMainClass {

	public static void main(String[] args) {
		/*
		 	Observer : 감시,정찰
		 				감시자패턴 => class감시
		 				
		 */
		
		ObserverMyClass cls = new ObserverMyClass();
		
		//감시자를 추가
		cls.addObserver(new ObserverA());
		cls.addObserver(new ObserverB());
		
		cls.setId("abc123");
		cls.setPw("q1w2e3r4");
		
		
		cls.notifyObservers(cls.getPw());
	}

}
