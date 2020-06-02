package function2;

import java.util.Scanner;

public class student {
static String[] indexName = {"이름","나이","영어","수학"};
	public static void main(String[] args) {
		/*
		 	학생 성적 관리
		 	String student[][];
		 	
		 	메뉴------
		 	1. 학생 정보 추가	insert	(예 : 홍길동,나이,영어,수학)
		 	2. 학생 정보 삭제	delete
		 	3. 학생 정보 검색	search
			4. 학생 정보 수정	update
			5. 학생 정보 모두 출력

			6. 과목의 총점
			7. 과목의 평균
			
			8. 성적순 소팅
		 */
		Scanner sc = new Scanner(System.in);
		String student[][] = new String[20][4];
		int choice;
		
		for(int i = 0; i<student.length; i++)
			for(int j = 0; j<student[i].length;j++)
				student[i][j]="";
		
		while(true) {
			System.out.println("-----------------------메뉴");
			System.out.println("1. 학생 정보 추가 | 2. 학생 정보 삭제        | 3. 학생 정보 검색");
			System.out.println("4. 학생 정보 수정 | 5. 학생 정보 모두 출력 | 6. 과목별 총점");
			System.out.println("7. 과목별 평균     | 8. 성적순 소팅");
			System.out.println("메뉴번호를 입력해 주십시오");
			System.out.print(">>>");
			choice = sc.nextInt();
			switch (choice) {
				case 1 :	//학생추가
					insertStudent(student);
					break;
				case 2 :
					deleteStudent(student);
					break;
				case 3 :
					searchStudent(student);
					break;
				case 4 :
					updateStudent(student);
					break;
				case 5:
					printStudent(student);
					break;
				case 6:
					sumSubject(student);
					break;
				case 7:
					avgSubject(student);
					break;
				default:	//case8
					sorting(student);
					break;
			}
		}
	}
	
	static void insertStudent(String student[][]) {
		Scanner sc = new Scanner(System.in);
		int findIndex = -1;
		for(int i = 0; i<student.length;i++) {
			if(student[i][0].equals("")){
				findIndex = i;
				break;
			}
		}
		System.out.println("findIndex : "+findIndex);
		
		System.out.print("이름 : ");
		//String name = sc.next();
		student[findIndex][0] =sc.next();
		
		System.out.print("나이 : ");
		//String age = sc.next();
		student[findIndex][1] =sc.next();
		
		System.out.print("영어 : ");
		//String eng = sc.next();
		student[findIndex][2] =sc.next();
		
		System.out.print("수학 : ");
		//String math = sc.next();
		student[findIndex][3] =sc.next();
		
		//student[findIndex][0] = name;
		//student[findIndex][1] = age;
		//student[findIndex][2] = eng;
		//student[findIndex][3] = math;
	}
	static void deleteStudent(String student[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제를 원하는 학생의 이름을 적으십시오 : ");
		String name = sc.next();
		int indexNum = 0;
		out:for(int i = 0; i<student.length;i++) {
			if(name.equals(student[i][0])) {	//이름을 찾았을때
				if(student[i+1][0]=="") {	//다음값이 비었을경우
					for(int j = 0; j<student[i].length;j++)
						student[i][j] = "";
				}else {		//이름을 찾고 그 다음값에 데이터가  있을경우
					for(int j = i; j<student.length;j++) {
						if(student[j+1][0].equals("")) {	//다음값이 null값이면
							for(int x = 0; x<student[j].length;x++)
								student[j][x]="";
							break out;
						}else {								//다음에 데이터가 있는 경우
							for(int x = 0; x<student[j].length;x++) {
								student[j][x] = student[j+1][x];
							}
						}
					}
				}
			}
				
		}
	}
	static void searchStudent(String student[][]) {
		System.out.print("찾으려는 학생의 이름을 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		for(int i = 0; i<student.length; i++) {
			if(student[i][0].equals(name)) {
				System.out.println("찾으시는 데이터 입니다");
				for(int j = 0; j<student[i].length; j++)
					System.out.print(student[i][j]+" ");
			}
			System.out.println();
		}
	}
	static void updateStudent(String student[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정하려는 학생의 이름을 입력하세요 : ");
		String name = sc.next();
		for(int i = 0; i<student.length;i++) {
			if(student[i][0].equals(name)) {
				for(int j = 0; j<student[i].length;j++) {
					System.out.println(indexName[j] +" : ");
					student[i][j] = sc.next();
				}
				break;
			}
		}
		
	}
	static void printStudent(String student[][]) {
		System.out.print(" ");
		for(int i = 0; i<indexName.length;i++) {
			System.out.print(indexName[i] + "  ");
		}
		System.out.println();
		int indexNum = -1;
		for(int i = 0; i<student.length; i++) 
			if(student[i][0].equals(""))
				indexNum = i-1;
		
		for(int i = 0; i<indexNum; i++) {
			for(int j = 0; j<student[i].length;j++) {
				System.out.print(student[i][j]+"  ");
			}
			System.out.println();
		}
	}
	//과목의 총점
	static void sumSubject(String student[][]) {
		int sum[] = new int[2];
		for(int i = 0; i<sum.length; i++){
			sum[i] = 0;
		}
		for(int i = 0; i<sum.length;i++) {
			for(int j = 0; j<student.length;j++)
				if(student[j][0].equals("")) {//null값이면
					break ;
				}else {	//null값이 아니면
					int score = Integer.parseInt(student[j][i+2]);
					sum[i] +=score;
					System.out.println(score);
				}
		}
		for(int i = 0; i<sum.length; i++) {
			System.out.println(indexName[i+2] + " 과목 총점수 : "+ sum[i]);
		}
	}
	//과목의 평균
	static void avgSubject(String student[][]) {
		int sum[] = new int[2];
		double avg[] = new double[2];
		for(int i = 0; i<sum.length;i++) {
			for(int j = 0; j<student.length;j++) {
				if(student[j][0].equals("")) {//null값이면
					break ;
				}else {	//null값이 아니면
					int score = Integer.parseInt(student[j][i+2]);
					sum[i] +=score;
				}
			}
		}
		int count = 0;
		for(int i = 0; i<student.length;i++)
			if(student[i][0].equals("")) {
				count = i;
				System.out.println(count);
				break;
			}
		
		for(int i =0; i<sum.length;i++) {
			avg[i] = sum[i]/count;
		}
		for(int i = 0; i<sum.length; i++) {
			System.out.println(indexName[i+2] + " 과목별 평균 : "+ avg[i]);
		}
	}
	//과목별 성적순 소팅
	static void sorting(String student[][]) {
		int temp,n = 0;
		for(int i = 0; i<student.length;i++)
			if(student[i][0].equals("")) {
				n = i;
				break;
			}
		int subject[][] = new int[student[0].length-2][n];
		for(int i = 0;i<subject.length;i++)
			for(int j = 0; j<subject[i].length;j++)
				subject[i][j] = 0;
		for(int i = 2; i<student[0].length; i++) {
			for(int j = 0;j<student.length;j++) {
				if(student[j][0].equals("")) {
					break;
				}else {
					subject[i-2][j] = Integer.parseInt(student[j][i]);
				}
			}
		}
		
		for(int i = 0;i<subject.length;i++) {
			for(int j = 0; j<subject[i].length;j++) {
				for(int x = j; x<subject[i].length; x++) {
					if(subject[i][j]<subject[i][x]) {
						temp = subject[i][j];
						subject[i][j] = subject[i][x];
						subject[i][x] = temp;
					}
						
				}
			}
		}
		for(int i = 0; i<subject.length;i++) {
			System.out.print(indexName[i+2]+"과목의 소팅 : ");
			for(int j = 0;j<subject[i].length;j++) {
				System.out.print(subject[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
