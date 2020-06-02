package work7;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		/*
			성적 통계 프로그램
			
			통계를 산출할 학생의 수?
			
			동적할당 -> student[학생의 수][4]
			홍길동 90 100 85
			일지매 100 95 90
			
			이름, 과목점수 입력
			>> 숫자로 입력
			>> 다시 입력해 주십시오
						  
			1 ~ 100사이의 숫자 
			>> 범위를 초과 했습니다
						
			국어, 수학, 영어 최고 점수
			
			국어, 수학, 영어 최저 점수
			
			모든 점수의 총합 
			
			학생 수에 따른 평균
			
		*/
		
		/*
		// 1차원 배열
		// 정의: 같은 자료형(변수)의 묶음.
		// 목적: 변수를 관리. 
		// 변수에 접근을 하기 위해서 사용하는 것은 
		// index number(번지). 0 ~ n-1				
		// 동적할당(1 ~ n개) 할당후 정적으로 사용(접근)
		int array[] = new int[5];	// new -> 동적할당
		//	stack		heap		// delete array	-> 가비지 콜렉터
		int array1, array2, array3, array4, array5;
		// stack
		int arrayTag[] = { 11, 22, 33, 44, 55 };
		//					0              4      : 총 5개 
		
		// 배열 참조(포인터)	: 속도. 주소만 접근하면 모든 데이터를 접근가능
		int pArray[] = arrayTag;	// int *pArray = arrayTag
		System.out.println(arrayTag);
		
		pArray[1] = 222;
		System.out.println(arrayTag[1]);
		
		int arrayNumberPosition[] = { 1, 2, 3 };
		int arrNumPos[] = arrayNumberPosition;
				
		
		// 2차원 배열 큰묶음, 큰묶음 안에 요소수
		int Array2[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8, 81 },
				{ 9, 10, 11, 12 },
		};
		
		// System.out.println(Array2[1][4]);
		
		for (int i = 0; i < Array2.length; i++) {
			for (int j = 0; j < Array2[i].length; j++) {
				System.out.print(Array2[i][j] + " ");
			}
			System.out.println();			
		}
		*/
		
		// memory 
		/* 
		 	Array2[0][0]
		 	Array2[0][1]
		 	Array2[0][2]
		 	Array2[0][3]
		
		
		*/
		
		Scanner sc = new Scanner(System.in);
		// 학생 성적 관리용 2차원 배열
		// String -> 이름, 숫자 -> parseInt	int -> 숫자
		//			  학생수, 이름 + 과목(국어, 영어, 수학)
		// 선언부
		String student[][] = null;
		int count;		// 학생수
		
		// 1. 학생 수를 입력
		System.out.print("학생수를 입력 = ");
		count = sc.nextInt();
		
		// 2. 동적할당
		student = new String[count][4];
		
		// 3. 입력: 이름, 국어, 영어, 수학
		for (int i = 0; i < student.length; i++) {
			System.out.println((i + 1) + "번째 학생 >>");			
			
			System.out.print("이름:");
			String name = sc.next();
			
			String lang = "";
			while(true) {
				System.out.print("국어:");
				lang = sc.next();	// 98 100 10a
				
				boolean check = false;
				for(int j = 0;j < lang.length(); j++) {
					char c = lang.charAt(j);
					if((int)c < 48 || (int)c > 57) {
						check = true;
						break;
					}
				}
				if(check == true) {
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주십시오");
					continue;
				}
				
				// 1 ~ 100사이의 숫자 
				// >> 범위를 초과 했습니다
				int numLang = Integer.parseInt(lang);
				if(numLang < 0 || numLang > 100) {
					System.out.println("범위를 초과한 점수입니다. 다시 입력해 주십시오");
					continue;
				}
				
				break;
			}
			
			// 영어
			System.out.print("영어:");
			String eng = sc.next();
			
			// 수학
			System.out.print("수학:");
			String math = sc.next();
			
			// 데이터를 배열에 대입
			student[i][0] = name;
			student[i][1] = lang;
			student[i][2] = eng;
			student[i][3] = math;			
		}	
		
		// 출력
		for (int j = 0; j < student.length; j++) {
			System.out.print(j + ":"); 
			for (int j2 = 0; j2 < student[0].length; j2++) {
				System.out.print(student[j][j2] + "\t");
			}
			System.out.println();			
		}		
		
		int studentCount[][] = new int[student.length][3];
		for (int j = 0; j < student.length; j++) {
			studentCount[j][0] = Integer.parseInt(student[j][1]); // 국어
			studentCount[j][1] = Integer.parseInt(student[j][2]); // 영어
			studentCount[j][2] = Integer.parseInt(student[j][3]); // 수학
		}
				
		// 4. 국어, 수학, 영어 최고 점수	max
		int max = studentCount[0][0];
		for (int j = 0; j < student.length; j++) {
			if(max < studentCount[j][0]) {
				max = studentCount[j][0];
			}
		}
		
		// 5. 국어, 수학, 영어 최저 점수	min
		int min = studentCount[0][1];
		for (int j = 0; j < student.length; j++) {
			if(min > studentCount[j][1]) {
				min = studentCount[j][1];
			}
		}
		
		// 6. 모든 점수의 총합 
		int sum = 0;
		for (int j = 0; j < studentCount.length; j++) {
			for (int j2 = 0; j2 < studentCount[0].length; j2++) {
				sum = sum + studentCount[j][j2];
			}
		}
		
		// 7. 학생 수에 따른 평균
		double avg = (double)sum / student.length;
		
		// 출력
		

	}

}










