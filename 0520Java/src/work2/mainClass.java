package work2;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	������
		 		���
		 			�����ؾߵ� �ݾ� : 4,230�� 
		 			�մ��� �� �ݾ�   : 10,000��
		 			
		 			�Ž����� 	:	���
		 			
		 			5,000�� : ?��
		 			1,000�� : ?��
		 			500�� : ?��
		 			100�� : ?��
		 			50�� : ?��
		 			10�� : ?��
		 */
		int myMoney, priceMoney, resultMoney,mod;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ǰ�� �ݾ��� ���Դϱ�?:");
		priceMoney = sc.nextInt();
		System.out.print("������ �ݾ��� ���Դϱ�?:");
		myMoney = sc.nextInt();
		resultMoney = myMoney - priceMoney;
		
		if(resultMoney<0) {
			System.out.println("�ݾ��� �����մϴ�.");
		}else {
			System.out.println("�Ž����� : "+resultMoney);
			/*
			mod  = resultMoney/5000; //�ʿ� 5õ��
			resultMoney = resultMoney % 5000 ;
			System.out.printf("5õ���� %d\t",mod);
			
			mod = resultMoney/1000; //õ���ǰ��
			resultMoney = resultMoney % 1000 ;
			System.out.printf("õ���� %d\t",mod);
			
			mod = resultMoney/500;	//500�����
			resultMoney = resultMoney % 500 ;
			System.out.printf("500�� %d\n",mod);
			
			mod = resultMoney/100;	//100��
			resultMoney = resultMoney % 100 ;
			System.out.printf("100�� %d\t",mod);
			
			mod = resultMoney/50;	//50
			resultMoney = resultMoney % 50 ;
			System.out.printf("50�� %d\t",mod);
			
			mod = resultMoney/10;	//10
			resultMoney = resultMoney % 10 ;
			System.out.printf("10�� %d\n",mod);
			
			System.out.print("�����մϴ� �ǿ�����~");
			*/
			int m5000 = resultMoney /5000;
			int m1000 = (resultMoney % 5000)/1000;
			int m500 = (resultMoney % 1000)/500;
			int m100 = (resultMoney % 500)/100;
			int m50 = (resultMoney % 100)/50;
			int m10 = (resultMoney % 50)/10;
			System.out.println("�Ž�����:" + resultMoney);
			System.out.println("5000:"+m5000);
			System.out.println("1000:"+m1000);
			System.out.println("500:"+m500);
			System.out.println("100:"+m100);
			System.out.println("50:"+m50);
			System.out.println("10:"+m10);
		}
		
	}

}
