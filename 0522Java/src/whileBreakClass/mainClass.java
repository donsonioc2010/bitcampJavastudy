package whileBreakClass;

public class mainClass {

	public static void main(String[] args) {
		/*
		 	break : Ż��(loop������ Ż���� �ǹ� : for, while, do~while)
		 	    (==return)
		 	    
		 	�ܵ����� ����� �Ұ��� �ϰ� ��ȯ��,switch���� ���� ����Ҽ� �ִ�
		 	switch(num){
		 		case 100:
		 			ó��
		 			break;
		 	}
		 	
		 	for(int i = 0; i<10; i++){
		 		if(i == 5){
		 			break;
		 		}
		 	}
		 */
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			if(i==4) {
				break;
			}
		}
		System.out.println("Ż����");
		
		char charArr[] = {'A','B','C','D','E'};
		for(int i = 0; i<charArr.length; i++) {
			if(charArr[i] == 'C') {
				System.out.println("C�� ã�Ҵ�;");
				break;
			}
		}
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<10; j++) {
				System.out.print("   j = "+j);
				if(i == 4 && j==3) {
					break; //for�� �Ѱ��� Ż���Ѵ�.
				}
			}
		}
		//�ΰ��� ������� 
		//1.Ż��� : loop�� ������ �°� break�� �����Ѵ�
		boolean b = false;
		for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<5; j++) {
				System.out.println("   j = "+j);
				if(i == 4 && j==3) {
					b = true;
				}
				if(b == true) {
					break;
				}
			}
			if(b == true) {
				break;
			}
		}
		
		//2.Ż���:Ű���带 ����ϴ� ���(goto)
		nubNub:for(int i = 0; i<10; i++) {
			System.out.println("i = "+i);
			for(int j = 0; j<10; j++) {
				System.out.println("   j = "+j);
				if(i == 2 && j==1) {
					break nubNub; 
				}
			}
		}
		
		
	}

}
