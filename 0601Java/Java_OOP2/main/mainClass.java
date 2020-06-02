package main;

public class mainClass {
	public static void main(String[] args) {
		MyClass cls = new MyClass();
		//		instance	클래스형
		cls.number = 1;
		cls.name = "홍길동";
		cls.age = 24;
		cls.address = "서울시";
		
		cls.func();
		cls.method();
		
		MyClass mcls= new MyClass();
		System.out.println(cls);
		System.out.println(mcls);
		/*
		 	순서의 처리
		 	
		 		절차지향
		 			정령
		 				1.입력
		 				2.정렬처리
		 					Swap
		 				3.출력
		 		
		 		객체지향
		 			처리들
		 				입력,정렬,교환,출력
		 			
		 			순서 호출
		 */
	}
}
