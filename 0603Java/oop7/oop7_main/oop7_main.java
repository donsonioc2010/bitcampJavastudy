package oop7_main;

public class oop7_main {

	public static void main(String[] args) {
		oop7_parapnt p = new oop7_parapnt();
	//	p.method();
		
	//	Object o = new oop7_parapnt();
	//	((oop7_parapnt)o).method();
		
		/*
		 	instanceOf : 상속받은 object를 부모 클래스의 instance로 생성
		 	
		 	ChildOne -> Parant
		 	ChildTwo -> Parant
		 	
		 	생성된 instance에 어떤 자식 클래스가 생성되었는지 판별 할 수 있는 제어자
		 */
		oop7_parapnt arrPar[] = new oop7_parapnt[3];
		arrPar[0] = new oop7_ChildOne();
		arrPar[1] = new oop7_ChildTwo();
		arrPar[2] = new oop7_ChildOne();
		
		for(int i = 0; i<arrPar.length;i++) {
			arrPar[i].method();
			if(arrPar[i] instanceof oop7_ChildOne) { //ChildOne이 들어가 있으면 True값 반환
				oop7_ChildOne one = (oop7_ChildOne)arrPar[i];
				one.oneMethod();
			}
		}
		
	}

}
