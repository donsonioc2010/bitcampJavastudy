package homeWork;

import java.util.Scanner;

public class gwaje16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.println(num1+"단");
		for(int i = 1; i<10; i++)
			System.out.println(num1 + " * "+ i + " = " + num1*i);
	}

}
