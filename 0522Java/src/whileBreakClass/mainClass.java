package whileBreakClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	break : 탈출(loop문에서 탈출을 의미 : for, while, do~while)
		 	    (==return)
		 	    
		 	단독으로 사용이 불가능 하고 순환문,switch문과 같이 사용할수 있다
		 	switch(num){
		 		case 100:
		 			처리
		 			break;
		 	}
		 	
		 	for(int i = 0; i<10; i++){
		 		if(i == 5){
		 			break;
		 		}
		 	}
		 */
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			if(i==4) {
				break;
			}
		}
		System.out.println("탈출후");
		
		char charArr[] = {'A','B','C','D','E'};
		for(int i = 0; i<charArr.length; i++) {
			if(charArr[i] == 'C') {
				System.out.println("C를 찾았다;");
				break;
			}
		}
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<10; j++) {
				System.out.print("   j = "+j);
				if(i == 4 && j==3) {
					break; //for문 한개만 탈출한다.
				}
			}
		}
		//두가지 방법존재 
		//1.탈출법 : loop문 갯수에 맞게 break를 설정한다
		boolean b = false;
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<5; j++) {
				System.out.println("   j = "+j);
				if(i == 4 && j==3) {
					b = true;
				}
				if(b == true) {
					break;
				}
			}
			if(b == true) {
				break;
			}
		}
		
		//2.탈출법:키워드를 사용하는 방법(goto)
		nubNub:for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<10; j++) {
				System.out.println("   j = "+j);
				if(i == 2 && j==1) {
					break nubNub; 
				}
			}
		}
		
		
	}

}
