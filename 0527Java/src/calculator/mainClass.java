package calculator;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		
		// ����
		int num1, num2;
		String oper;
		int result = 0;
		
		String strNum1, strNum2;
		
		// TODO: �Է�
		strNum1 = numberInput("ù��° ��");
		/*
		while(true) {
			System.out.print("ù��° �� = ");
			strNum1 = sc.next();
			boolean b = numberOk(strNum1);
			if(b == true) {
				System.out.println("���ڰ� �ƴմϴ�. �ٽ� �Է��� �ֽʽÿ�");
				continue;
			}
			break;
		}*/
		
		//System.out.print("(+, -, *, /) = ");
		//oper = sc.next();
		oper = operatorInput();
				
		//System.out.print("�ι�° �� = ");
		//num2 = sc.nextInt();
		strNum2 = numberInput("�ι�° ��");
						
		// ���ڿ� -> ����
		num1 = Integer.parseInt(strNum1);
		num2 = Integer.parseInt(strNum2);
		
		// TODO: ���
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
		
		// TODO: ���
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
			System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��� �ֽʽÿ�.");
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
				System.out.println("���ڰ� �ƴմϴ�. �ٽ� �Է��� �ֽʽÿ�");
				continue;
			}
			break;
		}
		return strNum1;
	}
	
	// ����: ���ڿ� �߿� ���ڸ� �Ǻ��ϴ� �Լ�
	// return: true(���ڰ� �ƴ�) false(��� ����) 
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







