package gameAnswer;

import java.util.Scanner;

import DiceAnswer.DiceAnswer;

public class GampePlay {
	/*
	 	2,12 : 제시X
	 	3,11 : 18배
	 	4,10 : 12배
	 	5,9 : 12배
	 	6,8 : 7배
	 	7 : 6배
	 	
	 	주사위 2개
	 */
	private int coin;
	private int batting;
	private int inputNumber;
	
	DiceAnswer dice1 = new DiceAnswer();
	DiceAnswer dice2 = new DiceAnswer();
	
	public void init() {
		coin = 20;
		
		dice1.diceRandom();
		dice2.diceRandom();
		
		System.out.println("주사위1 : "+dice1.getNumber());

		System.out.println("주사위2 : "+dice2.getNumber());
	}
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		
		//베팅금액
		System.out.print("베팅금액을 입력하세요 >>");
		batting = sc.nextInt();
		coin -= batting;
		
		System.out.print("두개의 주사위의 합 = ");
		inputNumber = sc.nextInt();
	}
	public void finding() {
		int d_num1 = dice1.getNumber();
		int d_num2 = dice2.getNumber();
		
		int diceSum = d_num1+d_num2;
		
		if(inputNumber == diceSum) {
			if(diceSum ==3 || diceSum == 11) {
				batting = batting * 18;
			}
			else if(diceSum ==4 || diceSum == 10) {
				batting = batting * 12;
			}
			else if(diceSum ==5 || diceSum == 9) {
				batting = batting * 9;
			}
			else if(diceSum ==6 || diceSum == 8) {
				batting = batting * 7;
			}
			else if(diceSum ==7) {
				batting = batting * 6;
			}
			System.out.println("축하합니다");
			coin += batting;
		}
		else {
			System.out.println("아쉽습니다. 다시도전하십시오");
		}
	}
	public void result() {
		System.out.println("주사위1 : "+ dice1.getNumber());
		System.out.println("주사위2 : "+ dice2.getNumber());
		System.out.println("합계 : "+(dice1.getNumber()+dice2.getNumber()));
		System.out.println("현재 Coin : "+ coin);
	}
	public void GamePlay() {
		init();
		userInput();
		finding();
		result();
	}
	public GampePlay() {
		GamePlay();
	}
}
