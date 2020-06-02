package oopwork;

import java.util.Scanner;

public class MyGame {
	int rand_num,user_num;
	boolean gameOver;
	
	public void init() {
		gameOver = false;
		
		setRandom();
	}
	public void setRandom() {
		rand_num = (int)(Math.random()*71)+30;
		System.out.println("rand_num="+rand_num);
	}
	public void userInput() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//숫자입력
			System.out.print("숫자를입력해주십시오(1~15)");
			user_num = sc.nextInt();
			//숫자범위 확인
			if(user_num<1||user_num>15) {
				System.out.println("범위를 벗어났습니다. 다시입력해주세요");
				continue;	//만약 범위를 벗어나면 다음작업은 break;를 실행하지 않는다
			}
			break;
		}
	}
	
	public void gamePlay() {
		//Loop
		while(true) {
			userInput();
			
			rand_num = rand_num - user_num;
			if(rand_num<=0) {
				gameOver = true;
				break;
			}
			System.out.println("continue Please...");
			
		}
	}
	
	public void result() {
		System.out.println("축하합니다.당신이 걸렸습니다!!");
	}
}
