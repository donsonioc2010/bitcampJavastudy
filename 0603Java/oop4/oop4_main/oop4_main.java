package oop4_main;

import oop4_cls.cc.Child;

public class oop4_main {

	public static void main(String[] args) {
		/*
		 	은닉성 : 접근 지정자를 통해서 외부로부터 접근을 차단, 허용해주는것을 의미
		 			private(무조건적인 차단),public(무조건 허용)
		 			variable()			method()
		 			
		 	상속성 : 부모클래스에서 기능을 상속한다.
		 			variable			method
		 			추가로 기능을 확장하는 경우
		 			
		 	다형성 : 상속 후에 여러 형태로 자식 클래스가 구현되는 것을 의미
		 	
		 	super
		 	Over Ride(받은 재산을 수정해서 확장) - 관리의 목적	
		 */
		
		Child c = new Child();
		c.Parant_method();
		//c.name = "일지마";
		Child cls = new Child(8);
	}

}
