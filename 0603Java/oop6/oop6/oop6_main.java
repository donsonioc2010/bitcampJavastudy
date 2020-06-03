package oop6;

import javax.jws.Oneway;

public class oop6_main {

	public static void main(String[] args) {
		oop6_ChildOne one = new oop6_ChildOne();
		oop6_ChildTwo two = new oop6_ChildTwo();
		
	//	one.method();
	//	two.method();
		
		oop6_Parant pone = new oop6_ChildOne();
		oop6_Parant ptwo = new oop6_ChildTwo();
		
	//	pone.method();
	//	ptwo.method();
		
		//10명
		//lady
		 oop6_ChildOne lady[] = new oop6_ChildOne[10];
		//man
		 oop6_ChildTwo man[] = new oop6_ChildTwo[10];
		 
		 oop6_Parant human[] = new oop6_Parant[4];
		 //배열만 잡아논것
		 
		 lady[0] = new oop6_ChildOne();
		 man[0] = new oop6_ChildTwo();
		 
		 
		 human[0] = new oop6_ChildOne();
		 human[1] = new oop6_ChildTwo();
		 human[2] = new oop6_ChildOne();
		 human[3] = new oop6_ChildTwo();
		 
		 for(int i = 0; i<human.length; i++)
			// human[i].method();
	//하나의 인스턴스로 자식클래스를 전부 관리할수있으며 부모클래스를 통해서 자식클래스를 호출할수 있는것	 
		 pone.method();
		 ptwo.method();
		 //형변환이 가능하다
		 oop6_ChildOne co = (oop6_ChildOne)pone;
		 //인스턴스값이 parant주소값을 가지고 있던 것에서 ChildOne의 주소값을 가지고있던 것으로 변환이 된 작업
		 co.func();
		 
		 ((oop6_ChildOne)pone).func(); 
		 
	}

}
