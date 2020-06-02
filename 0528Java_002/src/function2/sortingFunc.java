package function2;

import java.util.Scanner;

public class sortingFunc {

	public static void main(String[] args) {
		/*
		 	1. 입력 ( 숫자,오름/내림)
		 	
		 	2. 처리
		 	
		 	3. 출력
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1.오름차순 / 2.내림차순,(숫자입력)");
		userInput(sc.next());
	}
	
	static void userInput(String str) {

		String strsp[] = str.split(",");

		//입력수에맞게 배열입력
		int num[] = new int[strsp.length];
		//숫자대입
		for(int i = 0; i<strsp.length; i++) {
			num[i] = Integer.parseInt(strsp[i]);
		}
		sorting(num);
		
	}
	static void sorting(int num[]) {
		//오름 : 작은->큰 내림 : 큰->작은
		int sort[] = new int[num.length-1];

		for(int i = 1; i<num.length;i++)
			sort[i-1] = num[i];

		for(int i = 0; i<sort.length;i++) {
			for(int j = i+1; j<sort.length;j++ ) {
				if(num[0]==1) {//오름차순
					if(sort[i]>sort[j]) {
						swap(i,j,sort,true);
	//					temp = sort[i];
	//					sort[i] = sort[j];
	//					sort[j] = temp;
					}
				}else {//내림차순
					if(sort[i]<sort[j]) {
						swap(i,j,sort,false);
	//					temp = sort[i];
	//					sort[i] = sort[j];
	//					sort[j] = temp;
					}
				}
			}
		}
		printing(num, sort);
		
	}
	static void swap(int i, int j,int num[],boolean t) {
		if(t) {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}else {
			int temp = num[i];
			num[i] = num[j];
			num[j] = temp;
		}
	}
	static void printing(int num[], int num2[]) {
		System.out.println("소팅전 입력한 수 : ");
		for(int i = 1; i<num.length;i++) {
		System.out.print(num[i]+" ");	
		}
		System.out.println();
		if(num[0]==1) {
			System.out.println("오름차순에 의해 정렬되었습니다.");
		}else {
			System.out.println("내림차순에 의해 정렬되었습니다.");
		}
		for(int i = 0; i<num2.length;i++) {
		System.out.print(num2[i]+" ");	
		}
		
	}
}
