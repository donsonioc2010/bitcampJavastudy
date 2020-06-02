package homeWork;

import java.util.Scanner;

public class gwaje13_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산숫자갯수 : ");
		int wantNum = sc.nextInt();				//원하는 만큼 배열의 방을 넣을 변수
		int numberArray[] = new int[wantNum];	//입력을 받은 만큼 만들어지는 방의 갯수
		
		int sum  = 0;						// sum = 입력받은 수들의 총합계 
		double avg;							// avg = 평균을 넣을 변수  sum/wantNum
		for(int i = 0; i<wantNum; i++) {	// 0번 배열방부터 숫자를 입력받기
			System.out.print((i+1)+"번째 숫자 입력해 주십시오 : ");
			numberArray[i] = sc.nextInt();
			
			sum += numberArray[i];			//배열이 돌아갈때 바로바로 합계를 넣어줌
		}
		avg = (double)sum/wantNum;			//평균 구하기
		
		System.out.println("입력 받은 총 합계 : "+sum + "입력받은 수의 평균 : "+avg);
		
	}

}
