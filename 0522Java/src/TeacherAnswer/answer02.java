package TeacherAnswer;

import java.util.Scanner;

public class answer02 {

	public static void main(String[] args) {
		/* 
		 	NumberBaseBall
			random number -> 3개		r1 != r2 != r3
			user number -> 3개
			
			비교
			메세지출력  N Strike / N Ball / N Out
			
			play again
		*/
		Scanner sc = new Scanner(System.in);
		int r_num[] = new int[3];
		int u_num[] = new int[3];
		boolean swit[] = new boolean[10];	//랜덤숫자의 갯수에 맞게 배열 설정
		boolean clear = false;
		
		for(int i = 0; i<swit.length; i++) 
			swit[i] = false;
		int r,w;
		w = 0;
		while(w < 3) {
			//쩐당... 보드게임에서 주로사용 배열이 카드갯수로 바꿔서
			r = (int)(Math.random() * 10); //0~9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r+1;				//1~10
				
				w++;
			}
		}
		//Debug != 에러
		// 2가지
			// 1. 실시간으로 잡는방법
			// 2. break pointer
		
		
		//r_num 숫자 받기
		/* 사용은 가능하나 비효율적
		while(true) {
	//		r_num[0] = (int)(Math.random() *10)+1;
	//		r_num[1] = (int)(Math.random() *10)+1;
	//		r_num[2] = (int)(Math.random() *10)+1;
			for(int i = 0; i<3; i++)
				r_num[i] = (int)(Math.random() * 10)+1;
			
			if(r_num[0] != r_num[1] && r_num[0] != r_num[2] && r_num[1] != r_num[2]) break;
		}
		 */
		
		
		//////////////loop = 10
		int w1 = 0;
		int strike,ball;
		while(w1<10) {
			
			//user input   u1 != u2 != u3
			boolean check;
			int w2;
			while(true) {
				check = false;
				w2 = 0;
				while(w2 < 3) {
					System.out.print((w2+1) + "번째 수 = ");
					u_num[w2] = sc.nextInt();
					w2++;
				}
				// 같은 숫자가 있는지 확인
				out: for(int i = 0; i<u_num.length; i++)
					for(int j = 0; j<u_num.length; j++)
						if(u_num[i] == u_num[j] && i != j) {
							check = true; //입력한 같은 숫자가 있슴
							break out;
						}
				
				if(check == false)
					break;
				System.out.println("입력한 숫자 중에 중복수가 있습니다. 다시 입력해 주세요");
			}
			
			
			//process(비교)
			strike = ball = 0;
				//ball
			for( int i = 0; i<u_num.length; i++)
				for(int j = 0; j<u_num.length; j++) {
					if(u_num[i] == r_num[j] && i != j)
						ball++;
				}
				//strike
			for(int i = 0; i<u_num.length; i++)
				if(u_num[i] == r_num[i])
					strike++;
				//탈출
			if(strike >2) {
				clear = true;
				break;				
			}	
			
			//메세지출력
			System.out.println(strike+" 스트라이크,"+ball+" 볼 입니다.");
			w1++;
		}
		if(clear) {
			System.out.println("Game Clear!!");
		}else {
			System.out.println("Game Lose!!");
		}
		
		
		
		
		
	}

}
