package main;

import java.util.Scanner;

public class desertGame {
	int r_num;
	int u_num;
	boolean key = true;
	
	public void randomDice() {
		r_num = (int)(Math.random()*71)+30;

		System.out.println("모래성의 크기가 정해졌습니다"+r_num);
	}
	
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("훔쳐올 모래량을 기입(1~15)");
		while(true) {
			u_num = sc.nextInt();
			if(u_num>0 && u_num<16)
				break;
			System.out.println("1~15사이의 수를 입력하세요.");
		}
	}
	
	public void calcul() {
		r_num -=u_num;
		if(r_num>0) 
			System.out.println("모래성이 남아있습니다");
		else if(r_num==0) {
			System.out.println("게임 Clear");
			key = false;
		}
		else if(r_num<0){
			System.out.println("모래성이 쓰러졌습니다.패배");
			key = false;
		}
	}
	public void gameset() {
		randomDice();
		while(true) {
			init();
			userInput();
			calcul();
			if(!key)
				break;			
		}
	}
	public void init() {
		u_num = 0;
		
	}
}
