package homeWork;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		// 3���� ���ڸ� ���� �迭
		int answerArr[] = new int[3];
		int inputArr[] = new int[3];
		boolean gameloop = true;
		Scanner sc = new Scanner(System.in);
		
		while(gameloop) {
			// 3���� ���ڸ� �̴°���
			for(int i = 0; i<answerArr.length; i++) {
				
				// Dice�� ��������
				answerArr[i] = (int)(Math.random()*9)+1;
				
				// 1���� 2���� �������縦 �ϴ� �κ� �ߺ����� �����ϱ� ����
				if(i>=1) 
					for(int j = 0; j<i; j++) 
						// �ߺ����ڰ� �ִ°�� i������ 1�� ���༭ �ٽ� �ֻ����� ������ ��
						if(answerArr[i] == answerArr[j])
							i--;		
			}

			for(int i = 0; i<10; i++) {
				System.out.println(i+"���� ���� ����3���Է����ּ��� (��-��-��)");
				String answer = sc.next().trim();
				String inNumStr[] = answer.split("-");
				//�����Է¹ޱ�
				for(int j = 0; j<inputArr.length; j++) {
					inputArr[j] = Integer.parseInt(inNumStr[j]);

					// 1���� 2���� �������縦 �ϴ� �κ� �ߺ����� �����ϱ� ����
					if(j>=1) {
						for(int x = 0; x<j; x++) {
							// �ߺ����ڰ� �ִ°�� i������ 1�� ���༭ �ٽ� �ֻ����� ������ ��
							if(inputArr[j] == inputArr[x]) {
								System.out.println((j+1)+"��° ���ڰ�"+(x+1)+"��° ���ڿ� ���ƽ��ϴ� �ٽ��Է�");
								i--;
							}
						}
					}//�ߺ��˻� ����ȣ
				}//�Է³���ȣ
				
				System.out.print((i+1)+"��° ����:");
				// �Է¹��� �� Ȯ���ϱ�
				System.out.print((i+1)+"��° �Է¹��� �� : " );
				for(int j = 0; j<inputArr.length;j++) {
					System.out.print(inputArr[j]+" " );
				}
				System.out.println();
				
				//����Ȯ��
				int ball=0,out=3,strike=0,tmp=0;
				for(int j = 0; j<inputArr.length; j++) {
					for(int x = 0; x<inputArr.length;x++) {
						if(inputArr[j] == answerArr[x]) {
							if(j==x)//j��x�� ������� ��Ʈ����ũ
								strike++;
							else	//���� ���� ������ �ڸ��� Ʋ����� ����
								ball++;
						}
					}
				}
				//��ƿ����� ����
				tmp = ball+strike;
				if(tmp!= 3) out = out-tmp; //�������� �ƹ��͵� �����Ƿ� 3�ƿ�
				System.out.println(strike+"Strike "+ ball + "Ball "+ out + "out");
				System.out.println();
				
				//�������� ���Ѱ�������
				if(strike==3) {
					System.out.println("�����ƿ� ��������");
					
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
				}//10���� ��ȸ ��ȣ��
				
			}
		
		
		}//���� ���ѷ��� ��ȣ
	}

}
