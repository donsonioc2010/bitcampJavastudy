package whileClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	순환문
		 		while
		 		do while
		 		
		 	형식:
		 	 	while문 : 
			 		변수 선언
			 		변수 초기화
			 		while(조건){
			 			처리
			 			변수연산
			 		}
		 		
		 		do while문 : 
		 			변수 선언
		 			변수 초기화
		 			do{
		 				처리
		 				변수 연산
		 			}while(조건);
		 */
		int w;
		w = 0;
		while(w<10) {
			System.out.println("w = "+w);
			w++;
		}
		System.out.println();
		w = 10;
		do {
			System.out.println("w = "+w);
			w++;
		}while(w<10);
		
		for(int i =  0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<5; j++) {
				System.out.println("    j = "+j);
			}
		}
		int w1 = 0,w2 = 0;
		while(w1<10) {
			System.out.println("w1 = "+w1);
			while(w2<5) {
				System.out.println("  w2 = "+w2);
				w2 ++;
			}
			w1++;
			w2 = 0;
		}
		
		/*
		 	어플리케이션의 구성 
		 	1.initialize (초기화)(init)
		 	
		 	2.loop(순환)
		 	while(true){
		 		탈출
		 		1.입력
		 		2.출력
		 	}
		 	
		 	3.release(해방)
		 */
	}

}
