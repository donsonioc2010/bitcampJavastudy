package triangle;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();  //줄갯수를 입력받기
		int star = 1; //별의 갯수세는 변수
		
		for(int i = 0; i<line; i++) {
			//앞의 공백
			for(int j = 1; j<line-i; j++) {
				System.out.print(" ");
			}
			
			//별을 넣는 코드
			for(int j = 1; j<=star; j++ ) {
				System.out.print("*");
			}
			//한줄이끝날때마다 개행과 별증가
			star = star + 2;
			System.out.println();
		}
	}

}
