package changeDiamond;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();  //�ٰ����� �Է¹ޱ�
		int star = 1; //���� �������� ����
		int spaceArea = line/2; // ��������ϱ�
		boolean switchLine = true; //�������� �ڵ���
		int centerLine = spaceArea +1;
		for(int i = 1; i<=line; i++) {
			//����
			if(switchLine == true) {
				//��ĭ�� ������ �ִ� ���
				for(int j = i; j<=spaceArea; j++) {
					System.out.print("*");
				}
				//������ ĭ�� �ִ� ���
				for(int j = 1; j<=star; j++ ) {
					System.out.print(" ");
				}
				for(int j = i; j<=spaceArea; j++) {
					System.out.print("*");
				}
				//�����̳��������� ����� ������	
				if(i==centerLine)
					switchLine=false;
				else {
					switchLine=true;
					star = star + 2;
					System.out.println();
				}
			}
			//�Ʒ�ĭ
			else{
				star = star -2;	
				System.out.println();
				//����
				for(int j = line-i+1; j<=spaceArea;j++) {
					System.out.print("*");
				}
				//��
				for(int j = 1; j<=star; j++) {
					System.out.print(" ");
				}
				for(int j = line-i+1; j<=spaceArea;j++) {
					System.out.print("*");
				}
			}
		}

	}

}
