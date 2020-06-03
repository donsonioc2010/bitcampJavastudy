package oop5_main;

public class oop5_child extends oop5_Parant {
	public oop5_child() {
		//super();
		super(123);
	}
	
	//Over Ride 실시한method
	@Override
	public void method() {
		System.out.println("Child method()");
		super.method();
		//OverRide를 하여도 위의 메소드를 자식클래스에서는 호출이 가능하다
	}
	public void func() {
		System.out.println("Child func()");
	}

}
