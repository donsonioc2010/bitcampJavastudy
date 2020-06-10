package SingletonHe;

import Single.SingletonClass;

public class SingletonHeClass {
	private Object num;
	
	public void function() {
		SingletonClass sc = SingletonClass.getInstance();
		num = sc.snum;
		System.out.println(num);
	}
}
