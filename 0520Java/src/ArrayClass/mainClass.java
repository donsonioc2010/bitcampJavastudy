package ArrayClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	Array : �迭
		 			������ Ȯ�� ���.
		 			������ �����ϰ� �ϱ� ���� ����
		 			�迭�� ���� : ���� �ڷ����� �����̴�
		 			
		 			������ ? : index ��ȣ�� ���Ͽ� �����ϴ°��� �ǹ���
		 			
		 			���� : 
		 				�ڷ��� �迭��(=������)[] = new �ڷ���[�ʿ��ѹ迭�ǰ���];
		 	
		 	������ �غ��϶��ϸ�...
		 	int num1...num2....num3....���
		 */
		
		       int Array[]     =    new int[10];
		//�������� �Ҵ�(stack)�� ��ġ       �������� ���(heap�� ��ġ
		//�޸𸮿��� 4���� ������ �ֽ�
		//stack/heap/static/system
		//java �� indexNumber �� 0������ �����Ͽ� �ʿ䰹�� -1�������� ���
		//�������� ������ �������� ����
		       
		int array[] = new int[3];
		//int []array = new int[3];
		//int[] array = new int[3];
		//3����� ����� �����ϴ�
		
		int num1,num2,num3;
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		//�����ʱ�ȭ
		int tag = 1;
		int arr[] =  {1,2,3};
		System.out.println("arr[0]="+arr[0]);
		System.out.println("arr[1]="+arr[1]);
		System.out.println("arr[2]="+arr[2]);
		
		char charArr[]= {'H','E','L','L','O'};
		System.out.println(charArr);
		System.out.println(charArr[0]);

		System.out.println((int)charArr[0]);//ASCII�ڵ�
		
		char charArr2[] = new char[5];
		charArr2[0] = 'H';
		charArr2[1] = 'e';
		charArr2[2] = 'l';
		charArr2[3] = 'l';
		charArr2[4] = 'o';
		System.out.println(charArr2);

		//System.out.println((int)charArr2);
		// ������ Heap ���ִ� charArr2�� �޸� �ּҰ� ���´�
	}

}
