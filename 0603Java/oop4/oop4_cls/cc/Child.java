package oop4_cls.cc;

public class Child extends Parant{ //부모의 기본생성자 필수. 기본생성자가 먼저 실행되고 자식의 기본생성자가 실행된다
	public Child() {
		//super : 부모 클래스의 reference(pointer == w주소)
		//this : 자기자신의 참조
		
		super(5);
		//super는 맨위에
		System.out.println("Child Child()");
	}
	public Child(int num) {
		super(num);
	}
	public void func() {
		//number = 1;
		name = "홍길동";
	}
}
