package homeWork;

import java.util.Scanner;

public class gwaje16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean key= true;
		String num1 = null,num2=null;				//���ڸ� ���ڿ� �����ϱ� ���� ���ڿ��� �޴´�.
		char mark = 0;
		System.out.print("ù��° ���� �Է��ϼ���");		//ù��° ���ڸ� �Է�
		while(key) {
			num1 = sc.next();		//ù��° ���� ���ڿ��� �ޱ�
			for(int i = 0; i<num1.length();i++ ) {	// ���ڿ� �˻�
				char tmp = num1.charAt(i);			// ù��°������ i��° �濡 �ִ� �ܾ tmp�� ����
				if(!('0'<=tmp && tmp>'9')) {		// tmp���ִ� �ܾ �������� ��
					key = false;					// ���� �����̸� ���ѷ��� ��
				}else {								// ���ڰ� �ƴϸ� ���Է�
					System.out.println("���ڸ� �Է����ּ���");
				}
			}
		}
		key = true;
		while(key) {
			System.out.print("�����ڸ� �Է��ϼ���");			//����� ������ �Է�
			mark = sc.next().charAt(0);					//�����ڸ� char�� ����
			if(mark == '+'||mark == '-'||mark == '*'||mark == '/') //���������� ���ϱ�
				key = false;							//�������̸� ���� ����
			else										//�����ڰ� �ƴϸ� ���Է��ؾ��Ѵ�
				System.out.println("�߸��� �����Դϴ� �����ڸ� �ٽ��Է��ϼ���");
		}
		key = true;
		System.out.print("�ι�° ���� �Է��ϼ���");	
		while(key) {								//�ι�° ���ڸ� �ޱ����� ���ѷ���
			num2 = sc.next();						//�ι�° ���ڸ� �Է�	
			for(int i = 0; i<num2.length();i++ ) {	//���ڿ� ��
				char tmp = num2.charAt(i);			//tmp�� �ι�° ������ i��° �ܾ�(����)�� ����
				if(!('0'<=tmp && tmp>'9')) {		//���� ���� ��
					key = false;					//�����Ͻÿ��� ���� false�� ���ѷ��� ����
				}else {								//�����̸��繫�ѷ���
					System.out.println("���ڸ� �Է����ּ���");
				}
			}
		}
		
		//��깮��
		System.out.print(num1 + " " + mark + " "+ num2+" = ");
		int numb1 =  Integer.parseInt(num1),numb2 = Integer.parseInt(num2);
		//�Է¹����� ����ȯ
		switch (mark) {
			case '+':			//����
				System.out.print(numb1+numb2);
				break;
			case '-':			//����
				System.out.print(numb1-numb2);
				break;
			case '*':			//���ϱ�
				System.out.print(numb1*numb2);
				break;
			case '/':			//������
				System.out.print(numb1/numb2);
				break;
		}
	}

}
