package function2;

import java.util.Scanner;

public class sortingAnswer {

	public static void main(String[] args) {
		
		/* 	1. 입력(숫자들,오름/내림)
		  	
		  	2. 정렬처리
		  		swap()
		  		
		  	3. 출력
		 */
		int number[] = null;
		boolean updown[] = new boolean[1];  //address에 의한 할당을 위함
		//////////////////////////////////////1.입력		
		number = userInput(updown);
		sorting(number,updown[0]);
		result(number, updown[0]);
		

	}
	static int[] userInput(boolean ud[]) {
		Scanner sc = new Scanner(System.in);
		
		// 정렬할 갯수?
		System.out.print("정렬할 갯수는 = ");
		int count = sc.nextInt();
		// 1보다 커야 함	
		
		// 정렬할 숫자를 동적할당
		int []number = new int[count];
		
		// 정렬할 숫자를 입력 
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 오름(1)/내림(2)
		System.out.print("오름(1)/내림(2) = ");
		int updown = sc.nextInt();
		ud[0] = (updown == 1)?true:false;
		
		return number;
	}
	
	static void sorting(int number[],boolean updown) {
		// 정렬
		for (int i = 0; i < number.length - 1; i++) {			
			for (int j = i + 1; j < number.length; j++) {
				
				if(updown) {	// 오름
					if(number[i] > number[j]) {
						swap(number,i,j);
					}					
				}else {			// 내림
					if(number[i] < number[j]) {
						swap(number,i,j);
					}
				}				
			}			
		}	
	}
	static void swap(int number[],int i,int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
		
	}
	static void result(int number[], boolean updown) {
		// 결과
		String msg = "";
		if(updown) 	msg = "오름";
		else		msg = "내림";
		System.out.println(msg + "차순으로 정렬하였으며,");
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}
	}

}
