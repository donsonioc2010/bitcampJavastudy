package homeWork;

import java.util.Scanner;

public class gwaje14 {

	public static void main(String[] args) {
		int num1=0,inputNum;						//num1 = ������ ������ ���ڸ� �������� 
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();					//inputNum �� ������ ���� ���ڸ� �Է��� ����
		num1 = inputNum/10;							
		
		System.out.println("�Է��� ���� "+(10*num1)+"�̻��̰�"+(10*(num1+1))+"�̸��̴�");
								//���  ���ǹ����� 10�� ���Ͽ��� ���Ͽ���.
	}

}
