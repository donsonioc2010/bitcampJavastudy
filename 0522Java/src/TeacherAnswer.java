import java.util.Scanner;

public class TeacherAnswer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// �����κ��� �Է� ���� ������ �հ�� ����� ���ϴ� ���α׷��� �ۼ��϶�

		// ����
		int numArr[]= null; 	// = int *numArr == ����  => null(0) != nul(����)
								// = 0xffffffff =>�ּҴ� 32bit 
		int sum;				//�հ踦 ���� ����
		double avg; 			//����� ���� ����
		int count;				//���ϴ¼��ڸ� �Է¹��� ����
		
		
		// �ʱ�ȭ
		sum = 0; //sum�� �ʱ�ȭ�ص���
		avg = 0.0;
		
		// �����ϰ� ���� ������ ������ �Է��� �޴´�
		System.out.print("�����ϰ� ���� ������ ���� = ");
		count = sc.nextInt();
		
		// �� ������ �°� �迭�� Ȯ���Ѵ�(�����Ҵ�)
		numArr = new int[count];
		
		// �հ踦 ������ ���ڵ��� �Է�
		for(int i = 0; i<numArr.length; i++) {
			System.out.print((i+1)+"��° ���� �Է��ϼ��� : ");
			numArr[i] = sc.nextInt();			
		}
		
		// �հ踦 ����
		for(int i = 0; i < numArr.length; i++) {
			sum += numArr[i];
		}
		
		// ����� ����
		avg = (double)sum / numArr.length;
		
		// ��� ���
		for(int i = 0 ; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
	}

}
