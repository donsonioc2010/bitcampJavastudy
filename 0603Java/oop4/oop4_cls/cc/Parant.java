package oop4_cls.cc;

public class Parant {
	private int number;
	protected String name;
	//setter,getter를 사용하면서 잘 사용은 안하게됨
	
	public Parant() {
		System.out.println("Parant Parant()");
	}
	public Parant(int number) {
		this.number = number;
		System.out.println("Parant Parant(int number)");
		System.out.println("number = "+number);
	}
	public void Parant_method() {
		System.out.println("Parant Parant_method()");
	}
}
