package switchClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	switch : ���ǹ�������, ���� ��Ȯ�ؾ� �Ѵ�
		 	
		 	switch(����){
		 		case ������1:
		 			ó��
		 			break;
		 		case ������2:
		 			ó��
		 			break;
		 		default:			(else)
		 			break;
		 	}
		 */
		//default ������ �����ϸ�  break���� �������ÿ��� break�� ã�������� ��������
		// ������ȣ�� ����Ҽ��� ����.(>,<,>=,<=,!)
		// double�� ����� �������� ���ڴ� �����ϴ�
		// c�� �ȵǳ� java�� switch���� string�� ����� �񱳰� �����ϴ�
		// ����ϰ� �ڵ带 ©�� ������ ������ ����
		int number = 1;
		switch (number) {
			case 1:
				System.out.println("number = 1");
				break;
			
			case 2:
				System.out.println("number = 2");
				break;
			default:
				System.out.println("number != 1, number !=2");
				break;
		}
		
		char c=  '��';
		switch (c) {
			case '��':
				System.out.println("c = ��");
				break;

		default:
			break;
		}
		String str = "ABC";
		switch(str) {
			case "ABC":
				System.out.println("str = ABC");
				break;
		}
		
		/*
		 * 	�ǹ����� ���̴� ���
		 	switch(process){
		 		case CREATE:
		 			break;
		 		case PRINT:
		 			break;
		 		case RELEASE:
		 			break;
		 	}
		 */
		
	}

}
