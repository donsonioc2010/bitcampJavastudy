package main;

import mycls.MyClass_3;

public class Java_oop3 {

	public static void main(String[] args) {
		/*
		 	OOP 목적 : Code의 관리
		 	
		 	절차지향
		 		-> Array
		 		-> function -> 분산처리
		 	
		 	객체지향 특징
		 	1. 은닉성(==캡슐화)
		 		: 외부와의 차단으로 변수들을 관리할 수 있다
		 		class의 내부에서 접근(처리) 가 가능하도록 접근 지정자로 제어할 수 있다
		 		
		 			private(개인적인) -> member variable에 주로 설정
		 			public(대중적인)  -> member method 에 주로 설정
		 			protected(특정부분) ->상속에 관련
		 	2. 상속성
		 	3. 다형성
		 */
		MyClass_3 cls = new MyClass_3();
		//      instance  
		//cls.number = 123; //은닉성에 위배 패키지가 다를때
		//cls.number2 = 123;//클래스에서만접근가능
		cls.name = "hello"; // public
		//cls.setNumber(245);
		//int num = cls.getNumber();
		System.out.println(cls);
		
		System.out.println(cls.getThis());
		}

}
