package homeWork;

import java.util.Scanner;

public class gwaje14 {

	public static void main(String[] args) {
		int num1=0,inputNum;						//num1 = 범위를 구해줄 숫자를 넣을예정 
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();					//inputNum 은 범위를 구할 숫자를 입력할 변수
		num1 = inputNum/10;							
		
		System.out.println("입력한 값은 "+(10*num1)+"이상이고"+(10*(num1+1))+"미만이다");
								//출력  조건문없이 10을 곱하여서 구하였다.
	}

}
