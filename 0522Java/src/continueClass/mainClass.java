package continueClass;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
		continue : skip(����)
					�״��� ó���� �����Ѵ�
					�������� ���� ���ȴ�
					
		loop{
			ó��
			ó��2
			if continue
			ó��3 <= ó������ �ʰ� ����
		}
	 */
		/*
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			System.out.println("for start");
			if(i>5) {
				continue;
			}
			System.out.println("for end");
		}
		*/
		
		//��뿹��
		/*
		Scanner sc = new Scanner(System.in);
		int numArr[]  = new int[3];
		int n;
		
		for(int i = 0; i<numArr.length;i++) {
			System.out.print((i+1)+"��° �� = ");
			n = sc.nextInt();
			if(n<0) {
				System.out.println("�����Դϴ�");
				continue;
			}
			numArr[i] = n;
		}
		for(int i = 0; i<numArr.length; i++) {
			System.out.println("numArr["+i+"] = "+ numArr[i]);
		}
		*/
		//while ���� continue�� �׵ڿ��ִ� ��� ���ɹ��� ��ŵ�Ѵ�
		Scanner sc = new Scanner(System.in);
		int arrNum[]  = new int[3];
		int n;
		int w = 0;
		while(w<3) {
			System.out.print((w+1)+"��° �� �Է� = ");
			n = sc.nextInt();
			
			if(n<0) {
				System.out.println("�����Դϴ�");
				continue;
			}
			arrNum[w] = n;
			w++;
		}
		for(int i = 0; i<arrNum.length; i++) {
			System.out.println("arrNum["+arrNum[i]+"] = "+arrNum[i]);
		}
		
		
		
	}

}