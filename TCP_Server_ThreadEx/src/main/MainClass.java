package main;

public class MainClass {

	public static void main(String[] args) {
		/*
			1.
			non block socket
			일단 받고해결하자
			
			2.
			Timer를 줘서
			Accept를 하는 방식
			성능은 떨어짐
			
			
			3.그래서 나온방식
			Thread
		 */
		Thread thread1 = new ThreadEx("퐁");
		Thread thread2 = new ThreadEx("당");
		Thread thread3 = new ThreadEx("!");
		thread1.start();//start를 무조건해야함
		thread2.start();
		thread3.start();
		
	}

}
