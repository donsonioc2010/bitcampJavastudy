package oop5_main;

public class oop5_main {

	public static void main(String[] args) {
	//	oop5_child c = new oop5_child();
		
	//	c.method();
		
		oop5_Parant p = new oop5_child();
	//메모리			
		//인스턴트는 parant지만 오버라이딩을 하면 오버라이딩한(나중에작성한) 메소드가 호출이 된다
		p.method();
		//p.func();
	}

}
