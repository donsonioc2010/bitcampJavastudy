package homeWork;

import java.util.Scanner;

public class homeWork02 {

	public static void main(String[] args) {
		/*
		 	�Է� : ��� ���ڷ� �Ǿ��ִ��� Ȯ���ϴ� �ڵ�
		 		-> String 	"���ڿ��� �Է��� �ޱ�" , "12345","123e5"
		 		��� ���ڷ� �Ǿ������� 
		 			"���ڷ� �Ǿ��ֽ��ϴ�" 		-> ���ڷ� ��ȯ
				�ƴϸ�
					"���ڷ� �Ǿ� ���� �ʽ��ϴ�."
				
				
				HINT => ASCII���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ��� : ");
		String inNum1 = sc.next();
		
		int answer= 0;	//�������� �������� �����ϴ� ����
		for(int i = 0; i<inNum1.length(); i++) {
			char point = inNum1.charAt(i);	//���ڿ��� �ѹ��ھ� ��������
			byte num = (byte)point;	//����->asciiȮ���� ���� ����ȭ
			if(num>=48 &&num<=57) {	//ascii�� �ٲ㼭 �����Ͻÿ��� 
				answer = 1;
			}	
		}
		if(answer == 1) {	//�����ϰ�쿡 �����ϰ� ���ڰ� �ƴϸ� �ؿ��� (answer�� boolean�����ص���)
			int j = Integer.parseInt(inNum1);
			System.out.println("���ڷ� �Ǿ��ֽ��ϴ�");
			System.out.println("�Է¹��� ���ڴ�"+j +"�Դϴ�");
		}else {//���ڰ��ƴѰ��
			System.out.println("���ڷ� �Ǿ����� �ʽ��ϴ�");
		}
		
		/*
		 	�Է� : �������� �Ǽ����� �Ǻ��� �ڵ带 �ۼ�	(���ڷ� �����ҽ�)
		 		->String	"123.456", "123456"
		 		�Ǽ��� �Ǽ��Դϴ� ������ �����Դϴ�.
		 		
		 		'.'
		 */
		System.out.println();
		inNum1 = "";
		System.out.println("���ڸ� �Է����ּ��� : ");
		inNum1 = sc.next();		//�����Է¹ޱ�
		answer = 0;		//answer�� �ʱ�ȭ
		for(int i = 0; i<inNum1.length();i++) {	
			char point = inNum1.charAt(i);	//�Է¹��� ���ڿ� �ѹ��ھ� ����
			byte num = (byte)point;			//������ ���ڸ� ������ ��ȯ
			if(num == 46) {					//�Է¹��� ���ڿ� �Ҽ������ִ°��
				answer = 1;
				break;
			}else if(num>=48 &&num<=57){	//���ڸ��ִ°��
				answer = 2;
			}else {							//���ڰ� ���ԵȰ��
				break;						//answer = 0(��������),1(�Ҽ�/�Ǽ�),2(�ڿ���,����)
			}
		}
		if(answer==1) {						//�´� answer���� �°� ǥ��
			double j = Double.parseDouble(inNum1);
			System.out.println("�Ǽ��Դϴ�. �Է¹��� ���ڴ� : "+j+ " �Դϴ�.");
		}
		else if(answer==2) {
			int j = Integer.parseInt(inNum1);
			System.out.println("�����Դϴ�. �Է¹��� ���ڴ� : "+j +" �Դϴ�.");
		}
		else
			System.out.println("���ڴ»��ּ���");
		
		// �빮�ڷ� �Է� -> �ҹ��ڷ� ��ȯ�ؼ� ��µǵ���....
		// toLowerCase ����������� ����
	}

}
