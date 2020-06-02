package continueClass;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		continue : skip(생략)
					그다음 처리를 생략한다
					루프문과 같이 사용된다
					
		loop{
			처리
			처리2
			if continue
			처리3 <= 처리하지 않고 생략
		}
	 */
		/*
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			System.out.println("for start");
			if(i>5) {
				continue;
			}
			System.out.println("for end");
		}
		*/
		
		//사용예시
		/*
		Scanner sc = new Scanner(System.in);
		int numArr[]  = new int[3];
		int n;
		
		for(int i = 0; i<numArr.length;i++) {
			System.out.print((i+1)+"번째 수 = ");
			n = sc.nextInt();
			if(n<0) {
				System.out.println("음수입니다");
				continue;
			}
			numArr[i] = n;
		}
		for(int i = 0; i<numArr.length; i++) {
			System.out.println("numArr["+i+"] = "+ numArr[i]);
		}
		*/
		//while 에서 continue는 그뒤에있는 모든 명령문을 스킵한다
		Scanner sc = new Scanner(System.in);
		int arrNum[]  = new int[3];
		int n;
		int w = 0;
		while(w<3) {
			System.out.print((w+1)+"번째 수 입력 = ");
			n = sc.nextInt();
			
			if(n<0) {
				System.out.println("음수입니다");
				continue;
			}
			arrNum[w] = n;
			w++;
		}
		for(int i = 0; i<arrNum.length; i++) {
			System.out.println("arrNum["+arrNum[i]+"] = "+arrNum[i]);
		}
		
		
		
	}

}
