package sorting;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			Sorting : ����
					  ������ ũ�⿡ ���� ������� ��ġ�ϴ� ó��.
					  ����(ū���� �ڷ�), ��������(ū���� ������) ������ �ִ� 	
					  �Ի����			��������
					  ����, ����, �պ�, ��
					 
		*/
		
		/*
		int number[] = { 1, 5, 2, 4, 3 };
		int temp;	// swap�� ����
		
		for(int i = 0;i < number.length - 1; i++) {		
															// i = 0            1         2       3
			for (int j = i + 1; j < number.length; j++) {	// j = 1 2 3 4 	j = 2 3 4 j = 3 4 j = 4       
				
				if(number[i] < number[j]) {	// > ����
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}				
			}				
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number[" + i + "] = " + number[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int number[] = null;
		int count;
		boolean updown = false;
				
		// ������ ����?
		System.out.print("������ ������ = ");
		count = sc.nextInt();
		// 1���� Ŀ�� ��	
		
		// ������ ���ڸ� �����Ҵ�
		number = new int[count];
		
		// ������ ���ڸ� �Է� 
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "��° �� = ");
			number[i] = sc.nextInt();
		}
		
		// ����(1)/����(2)
		System.out.print("����(1)/����(2) = ");
		int ud = sc.nextInt();
		updown = (ud == 1)?true:false;
				
		
		
		// ����
		int temp;
		for (int i = 0; i < number.length - 1; i++) {			
			for (int j = i + 1; j < number.length; j++) {
				
				if(updown) {	// ����
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}					
				}else {			// ����
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}				
			}			
		}		
		
		
		
		
		// ���
		String msg = "";
		if(updown) 	msg = "����";
		else		msg = "����";
		System.out.println(msg + "�������� �����Ͽ�����,");
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}
		

	}

}
