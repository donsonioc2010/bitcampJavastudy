package SingletonYcls;

import Single.SingletonClass;

public class SingletonYouClass {
	private Object tag;
	/*
	public void setTag(int tag) {
		this.tag = tag;
	}
	*/
	
	public void func() {
		SingletonClass sc = SingletonClass.getInstance();
		this.tag = sc.snum;
	}
	@Override
	public String toString() {
		return "SingletonYouClass [tag=" + tag + "]";
	}
	
}
