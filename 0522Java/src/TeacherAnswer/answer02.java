package TeacherAnswer;

import java.util.Scanner;

public class answer02 {

	public static void main(String[] args) {
		/* 
		 	NumberBaseBall
			random number -> 3��		r1 != r2 != r3
			user number -> 3��
			
			��
			�޼������  N Strike / N Ball / N Out
			
			play again
		*/
		Scanner sc = new Scanner(System.in);
		int r_num[] = new int[3];
		int u_num[] = new int[3];
		boolean swit[] = new boolean[10];	//���������� ������ �°� �迭 ����
		boolean clear = false;
		
		for(int i = 0; i<swit.length; i++) 
			swit[i] = false;
		int r,w;
		w = 0;
		while(w < 3) {
			//¾��... ������ӿ��� �ַλ�� �迭�� ī�尹���� �ٲ㼭
			r = (int)(Math.random() * 10); //0~9
			if(swit[r] == false) {
				swit[r] = true;
				r_num[w] = r+1;				//1~10
				
				w++;
			}
		}
		//Debug != ����
		// 2����
			// 1. �ǽð����� ��¹��
			// 2. break pointer
		
		
		//r_num ���� �ޱ�
		/* ����� �����ϳ� ��ȿ����
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
					System.out.print((w2+1) + "��° �� = ");
					u_num[w2] = sc.nextInt();
					w2++;
				}
				// ���� ���ڰ� �ִ��� Ȯ��
				out: for(int i = 0; i<u_num.length; i++)
					for(int j = 0; j<u_num.length; j++)
						if(u_num[i] == u_num[j] && i != j) {
							check = true; //�Է��� ���� ���ڰ� �ֽ�
							break out;
						}
				
				if(check == false)
					break;
				System.out.println("�Է��� ���� �߿� �ߺ����� �ֽ��ϴ�. �ٽ� �Է��� �ּ���");
			}
			
			
			//process(��)
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
				//Ż��
			if(strike >2) {
				clear = true;
				break;				
			}	
			
			//�޼������
			System.out.println(strike+" ��Ʈ����ũ,"+ball+" �� �Դϴ�.");
			w1++;
		}
		if(clear) {
			System.out.println("Game Clear!!");
		}else {
			System.out.println("Game Lose!!");
		}
		
		
		
		
		
	}

}
