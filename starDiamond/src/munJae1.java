
public class munJae1 {

	public static void main(String[] args) {
		//10�̸��� �ڿ������� 3�� 5�� ����� ���ϸ� 3,5,6,9�̴�. �̵��� ������ 23�̴�.
		//1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�.
		int sum=0;
		for(int i = 1; i<1000; i++) {
			if((i%3) == 0 || (i%5) == 0 ) {
				sum = sum +i;
				System.out.println(i+"�� ���մϴ�");
			}
		}
		System.out.print("���� �� : "+sum);
		
	}

}
