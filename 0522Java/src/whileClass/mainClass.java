package whileClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	��ȯ��
		 		while
		 		do while
		 		
		 	����:
		 	 	while�� : 
			 		���� ����
			 		���� �ʱ�ȭ
			 		while(����){
			 			ó��
			 			��������
			 		}
		 		
		 		do while�� : 
		 			���� ����
		 			���� �ʱ�ȭ
		 			do{
		 				ó��
		 				���� ����
		 			}while(����);
		 */
		int w;
		w = 0;
		while(w<10) {
			System.out.println("w = "+w);
			w++;
		}
		System.out.println();
		w = 10;
		do {
			System.out.println("w = "+w);
			w++;
		}while(w<10);
		
		for(int i =  0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<5; j++) {
				System.out.println("    j = "+j);
			}
		}
		int w1 = 0,w2 = 0;
		while(w1<10) {
			System.out.println("w1 = "+w1);
			while(w2<5) {
				System.out.println("  w2 = "+w2);
				w2 ++;
			}
			w1++;
			w2 = 0;
		}
		
		/*
		 	���ø����̼��� ���� 
		 	1.initialize (�ʱ�ȭ)(init)
		 	
		 	2.loop(��ȯ)
		 	while(true){
		 		Ż��
		 		1.�Է�
		 		2.���
		 	}
		 	
		 	3.release(�ع�)
		 */
	}

}
