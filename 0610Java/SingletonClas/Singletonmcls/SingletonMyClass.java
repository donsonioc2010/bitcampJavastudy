package Singletonmcls;

import Single.SingletonClass;

public class SingletonMyClass {
	private Object number;
	
	public SingletonMyClass() {
		number = 12;
	}
	
	public void method() {
		SingletonClass sc = SingletonClass.getInstance();
		sc.snum = this.number;
	}
	/*
	public int getNumber() {
		return number;
	}*/
}
