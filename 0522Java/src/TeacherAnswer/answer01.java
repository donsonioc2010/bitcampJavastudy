package TeacherAnswer;

import java.util.Scanner;

public class answer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Random Number ã��
		int r_num,u_num;
		boolean clear;
		while(true) {
		//////////////////////////////////////
		// �ʱ�ȭ
			clear = false;
		
		// 1 ~ 100 ������ Random Number
			r_num = (int)(Math.random()*100)+1;
		
		
		///////////////////////////////////// loop = 10
			int w = 0;
			while(0<10) {
		// User Input
				System.out.print("�����ȣ �Է� : ");
				u_num = sc.nextInt();
		
		// ��(����)
				int find = 0;
				if(u_num > r_num) find = 0;
				else if(u_num<r_num)find = 1;
				else {//������ 
					clear = true;
					break;
				}
		// �޼����� ���
				if(find == 0 ) System.out.println("�ʹ� Ů�ϴ�");
				else System.out.println("�ʹ� �۽��ϴ�");
			
				w++;
			}
		
		/////////////////////////////////////
		
		// ��� ���
			if(clear) {
				System.out.println("�����մϴ�. �����Դϴ�.");
			}else {
				System.out.println("�ƽ����ϴ�. �ٽ��ѹ� �����Ͻñ� �ٶ��ϴ�.");
			}
		
		// play again?
			String msg;
			System.out.print("�ٽ� �����Ͻðڽ��ϱ�(Y/N)? = ");
			msg = sc.next();
			
			if(msg.equals("y")||msg.contentEquals("Y")) {
				
			}else {
				System.out.println("�ȳ������ʽÿ�.");
				break;
			}
		}
	}

}
