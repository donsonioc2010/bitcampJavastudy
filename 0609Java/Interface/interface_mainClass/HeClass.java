package interface_mainClass;

public class HeClass implements MyInterface,YouInterface{

	@Override
	public void method() {
		System.out.println("HeClass method()");
	}

	@Override
	public void func() {
		System.out.println("HeClass func()");
	}
	public void heMethod() {
		System.out.println("HeClass heMethod()");
	}
	
	
}
