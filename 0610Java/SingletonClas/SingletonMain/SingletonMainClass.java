package SingletonMain;

import Single.SingletonClass;
import SingletonHe.SingletonHeClass;
import SingletonYcls.SingletonYouClass;
import Singletonmcls.SingletonMyClass;

public class SingletonMainClass {
/*
 	Singleton : 하나의 instance에 접근을 하여 데이터를 송수신 하는 Patter
 	
 */
	public static void main(String[] args) {
		SingletonMyClass mcls = new SingletonMyClass();
		SingletonYouClass ycls = new SingletonYouClass();
		
		//int n = mcls.getNumber();
		//ycls.setTag(n);

		mcls.method();
		ycls.func();
		SingletonHeClass h = new SingletonHeClass();
		h.function();
		System.out.println(ycls.toString());
		SingletonClass sc = SingletonClass.getInstance();
		System.out.println("sc:"+sc);
		SingletonClass sc2 = SingletonClass.getInstance();
		System.out.println("sc2:"+sc);
		
	}

}
