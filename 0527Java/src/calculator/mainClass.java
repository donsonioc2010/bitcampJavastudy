package calculator;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		
		// 계산기
		int num1, num2;
		String oper;
		int result = 0;
		
		String strNum1, strNum2;
		
		// TODO: 입력
		strNum1 = numberInput("첫번째 수");
		/*
		while(true) {
			System.out.print("첫번째 수 = ");
			strNum1 = sc.next();
			boolean b = numberOk(strNum1);
			if(b == true) {
				System.out.println("숫자가 아닙니다. 다시 입력해 주십시오");
				continue;
			}
			break;
		}*/
		
		//System.out.print("(+, -, *, /) = ");
		//oper = sc.next();
		oper = operatorInput();
				
		//System.out.print("두번째 수 = ");
		//num2 = sc.nextInt();
		strNum2 = numberInput("두번째 수");
						
		// 문자열 -> 숫자
		num1 = Integer.parseInt(strNum1);
		num2 = Integer.parseInt(strNum2);
		
		// TODO: 계산
		result = calProcess(num1, num2, oper);
		/*
		switch (oper) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;	
			case "*":
				result = num1 * num2;
				break;	
			case "/":
				result = num1 / num2;
				break;	
		}
		*/
		
		// TODO: 결과
		System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
		
	}	
	
	static String operatorInput() {
		Scanner sc = new Scanner(System.in);
		String oper;
		while(true) {
			System.out.print("(+, -, *, /) = ");
			oper = sc.next();
			if(oper.equals("+") || oper.equals("-") == true ||
				oper.equals("*") == true|| oper.equals("/") == true) {
				break;
			}
			System.out.println("잘못입력하셨습니다. 다시 입력해 주십시오.");
		}
		return oper;
	}
	
	static String numberInput(String num12) {
		Scanner sc = new Scanner(System.in);
		String strNum1;
		while(true) {
			System.out.print(num12 + " = ");
			strNum1 = sc.next();
			boolean b = numberOk(strNum1);
			if(b == true) {
				System.out.println("숫자가 아닙니다. 다시 입력해 주십시오");
				continue;
			}
			break;
		}
		return strNum1;
	}
	
	// 목적: 문자열 중에 숫자를 판별하는 함수
	// return: true(숫자가 아님) false(모두 숫자) 
	static boolean numberOk(String snum) {
		boolean noNumber = false;
		for (int i = 0; i < snum.length(); i++) {
			char c = snum.charAt(i);
			if((int)c < 48 || (int)c > 57) {
				noNumber = true;
				break;
			}
		}
		return noNumber;
	}
	
	static int calProcess(int n1, int n2, String oper) {	
		int r = 0;
		switch (oper) {
			case "+":
				r = n1 + n2;
				break;
			case "-":
				r = n1 - n2;
				break;	
			case "*":
				r = n1 * n2;
				break;	
			case "/":
				r = n1 / n2;
				break;	
		}
		return r;
	}
	

}







