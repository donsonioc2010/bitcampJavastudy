package ObjectOrientedPrograming;

import myclass.TV;
import student.student;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Object Oriented Programing
		 	
		 	기존수업 : 처리중심
		 	
		 	객체지향 : 설계중심
		 	
		 	
		 */
		//Ex) Tv가 2대
		/*
		String name[]  = new String[2]; //삼성이냐 엘지냐 브랜드명
		int channel[] = new int[2]; //채널
		boolean power[] = new boolean[2]; //온 오프 유무
		
		name[0] = "삼성";
		name[1] = "LG";
		
		channel[0] = 11;
		channel[1] = 23;
		
		power[0] = true;
		power[1] = false;
		*/
		
		/*
		 	문법
		 	class 설계
		 		class MyClass{
		 			변수(member) - 접근저징(외부, 내부)
		 			
		 			
		 			함수(메소드) - (처리)
		 			
		 		}
		 	생성:
		 		클래스명 변수(instance) = new 클래스명();
		 		MyClass cls = new MyClass();
	메모리가올라가는영역		Stack	  Heap
		 		즉 동적할당이라는 얘기
		 		
		 		MyClass cls = null;->(0) 동적할당을 안하려면
		 */
		
		TV tv1 = new TV();			// tv1 => instance(주체) : 메모리상에 존재하는 요소
		tv1.getInput("LG", 11, true);
		tv1.method();
		
		TV tv2 = new TV();			// tv1/tv2...-> object라고도 한다
		tv2.getInput("삼성", 23, false);
		tv2.method();
		
		//배열만을 동적할당
		TV arrTv[] = new TV[3];			// => TV arrTV1,arrTV2,arrTV3;
		//객체를 동적할당
		//arrTv[0] = new TV();
		//arrTv[0].getInput("", 1, true);
		
		for (int i = 0; i < arrTv.length; i++) {
			arrTv[i] = new TV();
		}
		arrTv[0].getInput("aaa", 1, true);
		arrTv[1].getInput("bbb", 2, true);
		arrTv[2].getInput("ccc", 3, false);
		for (int i = 0; i < arrTv.length; i++) {
			arrTv[i].method();
		}
		arrTv[0].setPower();
		arrTv[0].method();
		
		student student2 = new student();
		student2.setName("홍길동");
		student2.setAge(24);
		student2.setEng(90);
		student2.setMath(80);
		
	}

}
