package work8;

public class mainClass {

	public static void main(String[] args) {
		
		// 2 array -> 1 array
		/*		
			int arr2[][] = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
			}
			int array[] = new int[ ? ];
			1. 2차원 배열을 1차원 배열로 대입한다.
			
			2. fibonnaci 파보나치 수열
			0 1 1 2 3 5 8 13 21 34 
			
		*/	
		
		char array2[][] = {
				{ 'A', 'B', 'C' },	// [0][0] [0][1] [0][2]
				{ 'D', 'E', 'F' },	// [1][0]
				{ 'G', 'H', 'I' },
				{ 'J', 'K', 'L' },
		};
		
		char array1[] = new char[array2.length * array2[0].length];
		
		/*
			array2[0][0]	3 * 0 + 0	-> array1[0]
			array2[0][1]	3 * 0 + 1	-> array1[1]
			array2[0][2]	3 * 0 + 2	-> array1[2]
			
			array2[1][0]	3 * 1 + 0	-> array1[3]
			array2[1][1]	3 * 1 + 1	-> array1[4]
			array2[1][2]	3 * 1 + 2	-> array1[5]
		
				:
		*/
		
		int count = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[0].length; j++) {
			//	array1[array2[0].length * i + j] = array2[i][j];
				
				array1[count] = array2[i][j];
				count++;
			}
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println(i + ":" + array1[i]);
		}
		
		
		
		
		// 파보나치
		// 0 1 1 2 3 5 8 13 21 34   
		// a b c
		//	 a b c
		// loop 30회 
		
		long a, b, c;
		long arrNum[] = new long[30];
		
		int w = 0;
		
		// 초기 값
		a = 0;
		b = 1;
		
		arrNum[0] = a;
		arrNum[1] = b;
		
		while(w < 28) {
		
			c = a + b;
			arrNum[w + 2] = c;
			
			// 값을 갱신
			a = b;
			b = c;
			
			w++;		
		}
		
		for (int i = 0; i < arrNum.length; i++) {
			System.out.print(arrNum[i] + " ");
		}
		System.out.println();
		
	}

}



