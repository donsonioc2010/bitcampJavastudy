package function2;

import java.util.Scanner;

public class sortingFunc2 {

	public static void main(String[] args) {
		/*
	 	1. 입력 ( 숫자,오름/내림)
	 	
	 	2. 처리
	 	
	 	3. 출력
	 */
		Scanner sc = new Scanner(System.in);
		int []number = userInput(sc.next());
		boolean c = choice(sc.next());
		
	}
	static int[] userInput(String str) {
		String strsp[] = str.split(",");

		//입력수에맞게 배열입력
		int num[] = new int[strsp.length];
		//숫자대입
		for(int i = 0; i<strsp.length; i++) {
			num[i] = Integer.parseInt(strsp[i]);
		}
		return num;
	}
	static boolean choice(String c) {
		boolean b = false;
		if(c.charAt(0)=='y'||c.charAt(0)=='Y') {
			b = true;
		}else {
			b = false;
		}
		return b;
	}
	
	//처리
	static void sorting(int num[],boolean c) {
		//오름 : 작은->큰 내림 : 큰->작은
		int temp;
				int sort[] = new int[num.length];

				for(int i = 1; i<num.length;i++)
					sort[i] = num[i];

				for(int i = 0; i<sort.length;i++) {
					for(int j = i+1; j<sort.length;j++ ) {
						if(c==true) {//오름차순
							if(sort[i]>sort[j]) {
						//		swap(i,j,sort,true);
								temp = sort[i];
								sort[i] = sort[j];
								sort[j] = temp;
							}
						}else {//내림차순
							if(sort[i]<sort[j]) {
							//	swap(i,j,sort,false);
								temp = sort[i];
								sort[i] = sort[j];
								sort[j] = temp;
							}
						}
					}
				}
				
	}

}
