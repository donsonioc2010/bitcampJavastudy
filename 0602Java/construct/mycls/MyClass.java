package mycls;

import java.util.Scanner;

public class MyClass {
	/*
	 	constructor	:	생성자 == method
	 					규칙
	 					class 명과 같은 method
	 					return 값이 없다
	 					OverLoad가 가능하다
	 					자동호출된다
	 					별도의 호출이 불가능하다
	 					생략이 가능하다
	 					기본값을 설정할 경우 많다.
	 					초기화는 사용을 안하는 편이 좋다
	 	
	 	destructor	:	소멸자 (자바에선 이제 사용X)	
	 */
	private int number;
	private String name;
	
	public MyClass(){
		//기본생성자
		System.out.println("MyClass MyClass()");
	}
	/*
	public MyClass(int number) {
		this.number = number;
		System.out.println("MyClass MyClass(int number)");
	}
	public MyClass(int number, String name) {
		//this();
		this(34);
		this.number = number;
		this.name = name;
		System.out.println("MyClass MyClass(int number,String name)");
	}
	*/
	//toolbar source-constructor using field 코드를 지원해준다

	public MyClass(int number, String name) {
		//super();
		Scanner sc = new Scanner(System.in);
		this.number = number;
		this.name = name;
	}
}
