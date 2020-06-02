package homeWork;

import java.awt.SystemTray;
import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class homeWork1 {

	public static void main(String[] args) {
		//무한루프를 위한 키
		boolean gameloop = true;
		Scanner sc = new Scanner(System.in);
		
		//게임을 지속적으로 실행시키는 부분
		while(gameloop) {
			
			// 1~100사이의 숫자를 무작위로 잡기
			int answer = (int)(Math.random()*100)+1;
			// 숫자를 입력받을 변수 선언
			int inNum = 0;
			
			// 게임시작
			System.out.println("게임을 시작합니다");
			for(int i = 0; i<10; i++) {
				// 숫자범위만 입력받기위한 키
				boolean inputkey = true;
				System.out.println((i+1)+"번째 도전 (0~100)");
				
				
				// 숫자 입력 받기
				while(inputkey) {
					inNum = sc.nextInt();
					if(inNum>100 || inNum<0)
						System.out.println("숫자를 제대로 입력해주세요");
					else
						inputkey = false;
				}
				
				//정답맞추기
				if(answer == inNum) {	//답을 맞춘경우
					System.out.println(inNum+"번 정답입니다!");
					
					//게임을 종료할지 계속할지 물어봄
					System.out.println("게임을 종료하시겠습니까?(Y/N)");
					char ans = sc.next().charAt(0);
					
					//종료를 하게될경우
					if(ans == 'Y' || ans=='y') {
						gameloop = false;
						break;
					}
					//종료를 안할경우
					else {
						break;
					}
				}else if(answer>inNum) {
					System.out.println("더 큰수치를 입력해야 합니다!");
					System.out.println();
				}else if(answer<inNum) {
					System.out.println("작은수치를 입력하셔야 합니다!");
					System.out.println();
				}
				
				//10번의 기회를 다쓴 경우
				if(i==9) {
					System.out.println("10번의 기회를 다 사용하였습니다.");
					System.out.println("게임을 종료하시겠습니까?(Y/N)");
					char ans = sc.next().charAt(0);
					
					//종료를 하게될경우
					if(ans == 'Y' || ans=='y') {
						gameloop = false;
					}
				}
				
			}
			//화면비우기
			if(gameloop==true) {
				for(int j = 0; j<50; j++)
					System.out.println();
			}
			
			
		}
		
		
		
	}

}
