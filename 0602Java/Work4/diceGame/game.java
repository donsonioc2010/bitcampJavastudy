package diceGame;
import java.util.Scanner;

import dice.randomNumber;

public class game {
	int coin,diceSum,betCoin,udiceSum;
	int rnum[];
	boolean clear;
	
	//게임을 시작하게됨 코인20개 셋팅 및 무한루프 생성자에서함
	public game() {
		coin = 20;
		clear = true;
		System.out.println("게임을 시작합니다~");
		
		while(clear) {
			diceInit();
			coinInput();
			endgame();
			System.out.println();
		}
		
	}
	public void diceInit() {
		randomNumber rn = new randomNumber();
		rn.dice();
		
		//설정된 주사위를 가져옵니다
		rnum = rn.getR_num();
		diceSum = rn.getSum();
		
		
	}
	public void coinInput() {
		Scanner sc = new Scanner(System.in);
		//베팅할 코인입력
		System.out.print("배팅할 코인수를 입력하세요 >>");
		betCoin = sc.nextInt();
		
		//2와 12입력시 다시입력
		while(true) {
			System.out.print("두주사위의 합을 맞춰주세요 >>");
			udiceSum = sc.nextInt();
			if(udiceSum==2||udiceSum==12) {
				System.out.println("2와 12는 입력할수 없습니다 다시입력해주세요");
			}else {
				break;
			}
		}
		diceAnsPrint();
		
	}
	private void diceAnsPrint() {
		System.out.println("두 주사위의 합 : "+diceSum + " 유저의 다이스 합: "+udiceSum);
		calculcoin();
	}
	private void calculcoin() {
		if(udiceSum==diceSum) {
				if(udiceSum==3||udiceSum==11) {
					coin = coin+(betCoin*18);
				}else if(udiceSum==4||udiceSum==10) {
					coin = coin+(betCoin*12);
				}else if(udiceSum==5||udiceSum==9) {
					coin = coin+(betCoin*9);
				}else if(udiceSum==6||udiceSum==8) {
					coin = coin+(betCoin*7);
				}else if(udiceSum==7) {
					coin = coin+(betCoin*6);
			}
			System.out.println("유저의 코인수는 :"+coin+"개 입니다");
		}else {
			coin -=betCoin;
		}
	}
	private void endgame() {
		if(coin<=0) {
			clear = false;
		}
	}
}
