package work2;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	편의점
		 		계산
		 			지불해야될 금액 : 4,230원 
		 			손님이 낸 금액   : 10,000원
		 			
		 			거스름돈 	:	출력
		 			
		 			5,000권 : ?장
		 			1,000권 : ?장
		 			500원 : ?개
		 			100원 : ?개
		 			50원 : ?개
		 			10원 : ?개
		 */
		int myMoney, priceMoney, resultMoney,mod;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("물품의 금액이 얼마입니까?:");
		priceMoney = sc.nextInt();
		System.out.print("지불할 금액이 얼마입니까?:");
		myMoney = sc.nextInt();
		resultMoney = myMoney - priceMoney;
		
		if(resultMoney<0) {
			System.out.println("금액이 부족합니다.");
		}else {
			System.out.println("거스름돈 : "+resultMoney);
			/*
			mod  = resultMoney/5000; //필요 5천원
			resultMoney = resultMoney % 5000 ;
			System.out.printf("5천원권 %d\t",mod);
			
			mod = resultMoney/1000; //천원권계산
			resultMoney = resultMoney % 1000 ;
			System.out.printf("천원권 %d\t",mod);
			
			mod = resultMoney/500;	//500원계산
			resultMoney = resultMoney % 500 ;
			System.out.printf("500원 %d\n",mod);
			
			mod = resultMoney/100;	//100원
			resultMoney = resultMoney % 100 ;
			System.out.printf("100원 %d\t",mod);
			
			mod = resultMoney/50;	//50
			resultMoney = resultMoney % 50 ;
			System.out.printf("50원 %d\t",mod);
			
			mod = resultMoney/10;	//10
			resultMoney = resultMoney % 10 ;
			System.out.printf("10원 %d\n",mod);
			
			System.out.print("감사합니다 또오세요~");
			*/
			int m5000 = resultMoney /5000;
			int m1000 = (resultMoney % 5000)/1000;
			int m500 = (resultMoney % 1000)/500;
			int m100 = (resultMoney % 500)/100;
			int m50 = (resultMoney % 100)/50;
			int m10 = (resultMoney % 50)/10;
			System.out.println("거스름돈:" + resultMoney);
			System.out.println("5000:"+m5000);
			System.out.println("1000:"+m1000);
			System.out.println("500:"+m500);
			System.out.println("100:"+m100);
			System.out.println("50:"+m50);
			System.out.println("10:"+m10);
		}
		
	}

}
