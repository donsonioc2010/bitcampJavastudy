package changeDiamond;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();  //줄갯수를 입력받기
		int star = 1; //별의 갯수세는 변수
		int spaceArea = line/2; // 공백수구하기
		boolean switchLine = true; //반을가면 뒤돌기
		int centerLine = spaceArea +1;
		for(int i = 1; i<=line; i++) {
			//위쪽
			if(switchLine == true) {
				//윗칸의 공백을 넣는 장소
				for(int j = i; j<=spaceArea; j++) {
					System.out.print("*");
				}
				//위쪽의 칸을 넣는 장소
				for(int j = 1; j<=star; j++ ) {
					System.out.print(" ");
				}
				for(int j = i; j<=spaceArea; j++) {
					System.out.print("*");
				}
				//한줄이끝날때마다 개행과 별증가	
				if(i==centerLine)
					switchLine=false;
				else {
					switchLine=true;
					star = star + 2;
					System.out.println();
				}
			}
			//아래칸
			else{
				star = star -2;	
				System.out.println();
				//공백
				for(int j = line-i+1; j<=spaceArea;j++) {
					System.out.print("*");
				}
				//별
				for(int j = 1; j<=star; j++) {
					System.out.print(" ");
				}
				for(int j = line-i+1; j<=spaceArea;j++) {
					System.out.print("*");
				}
			}
		}

	}

}
