package TeacherAnswer;

import java.util.Scanner;

public class answer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Random Number 찾기
		int r_num,u_num;
		boolean clear;
		while(true) {
		//////////////////////////////////////
		// 초기화
			clear = false;
		
		// 1 ~ 100 사이의 Random Number
			r_num = (int)(Math.random()*100)+1;
		
		
		///////////////////////////////////// loop = 10
			int w = 0;
			while(0<10) {
		// User Input
				System.out.print("예상번호 입력 : ");
				u_num = sc.nextInt();
		
		// 비교(판정)
				int find = 0;
				if(u_num > r_num) find = 0;
				else if(u_num<r_num)find = 1;
				else {//맞춘경우 
					clear = true;
					break;
				}
		// 메세지를 출력
				if(find == 0 ) System.out.println("너무 큽니다");
				else System.out.println("너무 작습니다");
			
				w++;
			}
		
		/////////////////////////////////////
		
		// 결과 출력
			if(clear) {
				System.out.println("축하합니다. 정답입니다.");
			}else {
				System.out.println("아쉽습니다. 다시한번 도전하시기 바랍니다.");
			}
		
		// play again?
			String msg;
			System.out.print("다시 시작하시겠습니까(Y/N)? = ");
			msg = sc.next();
			
			if(msg.equals("y")||msg.contentEquals("Y")) {
				
			}else {
				System.out.println("안녕히가십시오.");
				break;
			}
		}
	}

}
