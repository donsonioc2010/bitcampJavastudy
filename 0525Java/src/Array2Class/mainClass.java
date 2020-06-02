package Array2Class;

public class mainClass {

	public static void main(String[] args) {
		/* 
		 	1차원 배열
		 	Array : 같은 자료형의 묶음
		 			index number 로 관리가 된다
		 			0 ~ n-1 (n은 배열의 총수)
		 			
		 	다른 자료형의 묶음 :  C언어 -> structure(구조체)
		 					Java -> class
		 					
		 	1차원 배열
			 	int array[] = new int[3];
			 	int array[] = {1,2,3};
		 	
		 	구조체
		 		MyStruct my = {'a',24,"홍길동"};
		 		
		 	String member[] = {
		 		"홍길동","24","안양시"
		 	};
		 	
		 	2차원배열
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
