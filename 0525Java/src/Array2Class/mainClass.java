package Array2Class;

public class mainClass {

	public static void main(String[] args) {
		/* 
		 	1���� �迭
		 	Array : ���� �ڷ����� ����
		 			index number �� ������ �ȴ�
		 			0 ~ n-1 (n�� �迭�� �Ѽ�)
		 			
		 	�ٸ� �ڷ����� ���� :  C��� -> structure(����ü)
		 					Java -> class
		 					
		 	1���� �迭
			 	int array[] = new int[3];
			 	int array[] = {1,2,3};
		 	
		 	����ü
		 		MyStruct my = {'a',24,"ȫ�浿"};
		 		
		 	String member[] = {
		 		"ȫ�浿","24","�Ⱦ��"
		 	};
		 	
		 	2�����迭
		 		int array2[][] ={
		 			{1,2,3,4},
		 			{5,6,7,8},
		 			{9,10,11,12}
		 		};
		 		int array2[][] = new int[3][4];
		 		int []array2[] = new int[3][4];		 		
		 */
		
		int Array2[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				
		};
		for(int i = 0; i<Array2.length; i++) { //Array2.length -> 3
			for(int j = 0; j<Array2[0].length; j++) //Array2[0].length ->4
				System.out.println("array2["+i+"]["+j+"] = "+Array2[i][j]);
		
		}
	}

}
