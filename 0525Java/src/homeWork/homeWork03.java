
  package homeWork;

import java.util.Scanner;

public class homeWork03 {

	public static void main(String[] args) {
		/*
		 	성적 통계 프로그램	
		 		통계를 산출할 학생의 수?
		 		동적할당 -> student[학생의수][4] 
		 			ex)	홍길동 국어 영어 수학
		 				일지매 국어 영어 수학
		 				
		 		이름,과목점수 입력
		 		>>과목점수 = 숫자로 입력
		 		>>숫자로 입력이 안되면 다시입력해주십시오 시옷시옷
		 		
		 		0~100사이의 숫자 외일경우 범위를 초과했다고 하고 다시입력
		 		
		 		
		 		과목1,과목2,과목3 최고점수 / 최저점수
		 		1,2,3과목의 모든 점수의 총합과 평균
		 */
		boolean stuTrue = false;
		Scanner sc = new Scanner(System.in);
		String strstuNum;
		String ScoreName[]= {"C언어","Java","Python"};
		
		//학생수 입력 받는 프로시져
		System.out.print("학생수를 입력해주세요");
		while(true) {
			strstuNum = sc.next();							//숫자입력
			for(int i = 0; i<strstuNum.length(); i++) {		//숫자열에 문자가있는지 검수
				char c = strstuNum.charAt(i);
				if((byte)c>=48 && (byte)c<=57) {			//숫자만있는지 검수
					stuTrue = true;
				}else {
					System.out.println("숫자만 기입해 주세요");	
					stuTrue = false;						//문자가 있는경우 바로종룐
					break;		
				}
			}
			if(stuTrue==true) {
				break;//숫자만있는경우 종료된다
			}else {
				System.out.println("다시입력하세요");
				stuTrue =false;
			}
		}
		//학생수 배열 입력
		int intstuNum = Integer.parseInt(strstuNum);
		String student[][] = new String[intstuNum][4];
		
		for(int i = 0; i<student.length; i++) {
			System.out.println("학생 정보를 입력해 주세요(이름,C언어,Java,Python) : ");
			String str = sc.next();	
			String tmp[] = str.split(",");
			student[i][0]=tmp[0];
			
			out:for(int j = 1; j<tmp.length; j++) {			//각 과목별 점수에 문자가 있는지 검수
				String search = tmp[j];					//검수하는 변수에 과목점수를 넣음
				
				for(int y = 0; y<search.length();y++) {	//과목점수를 한글자씩 따오기 위한 루프문
					char c = search.charAt(y);			//따옴따옴
					if((byte)c>=48 && (byte)c<=57) {	//숫자인경우
							int score = Integer.parseInt(tmp[j]);	//과목점수가 0~100의 숫자인지 검수
							if(score>100||score<0) {				//과목점수를 비교했을때 100점초과 0점 미만의 점수는 재입력
								i--;
								System.out.println("점수를 제대로 다시입력해주세요. 점수범위는 0~100사이입니다.");
								break out;
							}else {
								student[i][j]=tmp[j];
							}
					}else {								//문자인경우 재입력
						System.out.println("과목에는점수만입력해주세요");
						i--;
						break out;
					}
				}
			}
		}
		//학생들의 점수를 전부 출력하는 프로시져
		System.out.printf("이름\tC언어\tJAVA\tPython\n");
		for(int i = 0; i<student.length; i++) {
			for(int j = 0; j<student[0].length; j++) {
				System.out.print(student[i][j]);
				System.out.printf("\t");
			}
			System.out.println();
		}
		
		//과목별 최고점수 최저점수
		//모든점수의 총 합
		//모든점수총합/학생수
		
		//학생들의 최고점수와 최저점수를 구하는 장소
		int sum=0,avg,maxScore[]= {0,0,0};//최대점수의 초기시작은 0점으로한다
		int minScore[] = {100,100,100};	  //최저점수의 초기시작은 100점이다
		
		//학생들의 합계를 구하는 프로시져
		for(int i = 0; i<student.length;i++) {
			for(int j = 1; j<student[0].length;j++) {
				sum += Integer.parseInt(student[i][j]); 
			}
		}
		//과목별 최고점 최저점을 구하는장소 배열의 순서는 [학생번호][과목]에서 학생번호가 바뀌어야하므로 j값이 앞으로 간다
		for(int i = 1; i<student[0].length;i++) {
			for(int j = 0; j<student.length;j++) {
				if(maxScore[i-1] <=Integer.parseInt(student[j][i]))		//i-1은 저배열의 시작점은 0이나 i는 1이기때문
					maxScore[i-1] = Integer.parseInt(student[j][i]);
				if(minScore[i-1]>=Integer.parseInt(student[j][i]))
					minScore[i-1] = Integer.parseInt(student[j][i]);
			}
		}
		
		//평균값을 구하는 프로시져
		avg = sum/student.length;
		System.out.println("============================================================");
		System.out.println("총 합계 : "+sum + "과목 평균 : "+avg);
		for(int i = 0; i<minScore.length; i++)
			System.out.println(ScoreName[i] + "과목 최고점수 : " +maxScore[i] + "최저점수 :"+minScore[i]);
	}

}
