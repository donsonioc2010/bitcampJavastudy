package homeWork;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		// 3개의 숫자를 담을 배열
		int answerArr[] = new int[3];
		int inputArr[] = new int[3];
		boolean gameloop = true;
		Scanner sc = new Scanner(System.in);
		
		while(gameloop) {
			// 3개의 숫자를 뽑는과정
			for(int i = 0; i<answerArr.length; i++) {
				
				// Dice를 굴리는중
				answerArr[i] = (int)(Math.random()*9)+1;
				
				// 1번방 2번방 전수조사를 하는 부분 중복수를 제거하기 위함
				if(i>=1) 
					for(int j = 0; j<i; j++) 
						// 중복숫자가 있는경우 i값에서 1을 빼줘서 다시 주사위를 굴리게 함
						if(answerArr[i] == answerArr[j])
							i--;		
			}

			for(int i = 0; i<10; i++) {
				System.out.println(i+"번재 도전 숫자3개입력해주세요 (수-수-수)");
				String answer = sc.next().trim();
				String inNumStr[] = answer.split("-");
				//숫자입력받기
				for(int j = 0; j<inputArr.length; j++) {
					inputArr[j] = Integer.parseInt(inNumStr[j]);

					// 1번방 2번방 전수조사를 하는 부분 중복수를 제거하기 위함
					if(j>=1) {
						for(int x = 0; x<j; x++) {
							// 중복숫자가 있는경우 i값에서 1을 빼줘서 다시 주사위를 굴리게 함
							if(inputArr[j] == inputArr[x]) {
								System.out.println((j+1)+"번째 숫자가"+(x+1)+"번째 숫자와 겹쳤습니다 다시입력");
								i--;
							}
						}
					}//중복검사 끝괄호
				}//입력끝괄호
				
				System.out.print((i+1)+"번째 도전:");
				// 입력받은 수 확인하기
				System.out.print((i+1)+"번째 입력받은 수 : " );
				for(int j = 0; j<inputArr.length;j++) {
					System.out.print(inputArr[j]+" " );
				}
				System.out.println();
				
				//정답확인
				int ball=0,out=3,strike=0,tmp=0;
				for(int j = 0; j<inputArr.length; j++) {
					for(int x = 0; x<inputArr.length;x++) {
						if(inputArr[j] == answerArr[x]) {
							if(j==x)//j와x가 같은경우 스트라이크
								strike++;
							else	//같은 값은 있으나 자리가 틀린경우 증가
								ball++;
						}
					}
				}
				//몇아웃인지 구분
				tmp = ball+strike;
				if(tmp!= 3) out = out-tmp; //같은값이 아무것도 없으므로 3아웃
				System.out.println(strike+"Strike "+ ball + "Ball "+ out + "out");
				System.out.println();
				
				//정답으로 인한게임종료
				if(strike==3) {
					System.out.println("삼진아웃 게임종료");
					
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
				}//10번의 기회 괄호문
				
			}
		
		
		}//게임 무한루프 괄호
	}

}
