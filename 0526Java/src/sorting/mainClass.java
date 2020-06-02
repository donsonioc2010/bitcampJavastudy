package sorting;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			Sorting : 정렬
					  숫자의 크기에 따라서 순번대로 배치하는 처리.
					  오름(큰값이 뒤로), 내림차순(큰값이 앞으로) 정렬이 있다 	
					  입사순위			연봉순위
					  선택, 버블, 합병, 퀵
					 
		*/
		
		/*
		int number[] = { 1, 5, 2, 4, 3 };
		int temp;	// swap용 변수
		
		for(int i = 0;i < number.length - 1; i++) {		
															// i = 0            1         2       3
			for (int j = i + 1; j < number.length; j++) {	// j = 1 2 3 4 	j = 2 3 4 j = 3 4 j = 4       
				
				if(number[i] < number[j]) {	// > 오름
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}				
			}				
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println("number[" + i + "] = " + number[i]);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int number[] = null;
		int count;
		boolean updown = false;
				
		// 정렬할 갯수?
		System.out.print("정렬할 갯수는 = ");
		count = sc.nextInt();
		// 1보다 커야 함	
		
		// 정렬할 숫자를 동적할당
		number = new int[count];
		
		// 정렬할 숫자를 입력 
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 오름(1)/내림(2)
		System.out.print("오름(1)/내림(2) = ");
		int ud = sc.nextInt();
		updown = (ud == 1)?true:false;
				
		
		
		// 정렬
		int temp;
		for (int i = 0; i < number.length - 1; i++) {			
			for (int j = i + 1; j < number.length; j++) {
				
				if(updown) {	// 오름
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}					
				}else {			// 내림
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;
					}
				}				
			}			
		}		
		
		
		
		
		// 결과
		String msg = "";
		if(updown) 	msg = "오름";
		else		msg = "내림";
		System.out.println(msg + "차순으로 정렬하였으며,");
		for (int i = 0; i < number.length; i++) {
			System.out.println(i + ":" + number[i]);
		}
		

	}

}
