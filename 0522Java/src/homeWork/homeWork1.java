package homeWork;

import java.awt.SystemTray;
import java.util.Scanner;

import org.omg.CORBA.SystemException;

public class homeWork1 {

	public static void main(String[] args) {
		//���ѷ����� ���� Ű
		boolean gameloop = true;
		Scanner sc = new Scanner(System.in);
		
		//������ ���������� �����Ű�� �κ�
		while(gameloop) {
			
			// 1~100������ ���ڸ� �������� ���
			int answer = (int)(Math.random()*100)+1;
			// ���ڸ� �Է¹��� ���� ����
			int inNum = 0;
			
			// ���ӽ���
			System.out.println("������ �����մϴ�");
			for(int i = 0; i<10; i++) {
				// ���ڹ����� �Է¹ޱ����� Ű
				boolean inputkey = true;
				System.out.println((i+1)+"��° ���� (0~100)");
				
				
				// ���� �Է� �ޱ�
				while(inputkey) {
					inNum = sc.nextInt();
					if(inNum>100 || inNum<0)
						System.out.println("���ڸ� ����� �Է����ּ���");
					else
						inputkey = false;
				}
				
				//������߱�
				if(answer == inNum) {	//���� ������
					System.out.println(inNum+"�� �����Դϴ�!");
					
					//������ �������� ������� ���
					System.out.println("������ �����Ͻðڽ��ϱ�?(Y/N)");
					char ans = sc.next().charAt(0);
					
					//���Ḧ �ϰԵɰ��
					if(ans == 'Y' || ans=='y') {
						gameloop = false;
						break;
					}
					//���Ḧ ���Ұ��
					else {
						break;
					}
				}else if(answer>inNum) {
					System.out.println("�� ū��ġ�� �Է��ؾ� �մϴ�!");
					System.out.println();
				}else if(answer<inNum) {
					System.out.println("������ġ�� �Է��ϼž� �մϴ�!");
					System.out.println();
				}
				
				//10���� ��ȸ�� �پ� ���
				if(i==9) {
					System.out.println("10���� ��ȸ�� �� ����Ͽ����ϴ�.");
					System.out.println("������ �����Ͻðڽ��ϱ�?(Y/N)");
					char ans = sc.next().charAt(0);
					
					//���Ḧ �ϰԵɰ��
					if(ans == 'Y' || ans=='y') {
						gameloop = false;
					}
				}
				
			}
			//ȭ�����
			if(gameloop==true) {
				for(int j = 0; j<50; j++)
					System.out.println();
			}
			
			
		}
		
		
		
	}

}
