package triangle;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();  //�ٰ����� �Է¹ޱ�
		int star = 1; //���� �������� ����
		
		for(int i = 0; i<line; i++) {
			//���� ����
			for(int j = 1; j<line-i; j++) {
				System.out.print(" ");
			}
			
			//���� �ִ� �ڵ�
			for(int j = 1; j<=star; j++ ) {
				System.out.print("*");
			}
			//�����̳��������� ����� ������
			star = star + 2;
			System.out.println();
		}
	}

}
