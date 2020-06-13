package main;

public class SingletonClass {//delegate 라는 명칭으로 많이쓰임
	private static SingletonClass sc = null;
	
	WindowOne one;
	WindowTwo two;
	
	private SingletonClass() {
		one = new WindowOne();
		two = new WindowTwo();
	}
	
	public static SingletonClass getInstance() {
		if(sc ==null) {
			sc = new SingletonClass();
		}
		return sc;
	}
}
