package homeWork;

import java.util.Scanner;

public class gwaje13_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ڰ��� : ");
		int wantNum = sc.nextInt();				//���ϴ� ��ŭ �迭�� ���� ���� ����
		int numberArray[] = new int[wantNum];	//�Է��� ���� ��ŭ ��������� ���� ����
		
		int sum  = 0;						// sum = �Է¹��� ������ ���հ� 
		double avg;							// avg = ����� ���� ����  sum/wantNum
		for(int i = 0; i<wantNum; i++) {	// 0�� �迭����� ���ڸ� �Է¹ޱ�
			System.out.print((i+1)+"��° ���� �Է��� �ֽʽÿ� : ");
			numberArray[i] = sc.nextInt();
			
			sum += numberArray[i];			//�迭�� ���ư��� �ٷιٷ� �հ踦 �־���
		}
		avg = (double)sum/wantNum;			//��� ���ϱ�
		
		System.out.println("�Է� ���� �� �հ� : "+sum + "�Է¹��� ���� ��� : "+avg);
		
	}

}
