package work3;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
				//java1
		/*
		int number;
		number = 5;
		System.out.println("number : "+Integer.toBinaryString(number));
		number = number << 4;
		System.out.println("number : "+Integer.toBinaryString(number));
		number = number >> 5;
		System.out.println("number : "+Integer.toBinaryString(number));
		number = number >> 1;
		System.out.println("number : "+Integer.toBinaryString(number));
		*/
		//2번
		/*
		int num1,num2;
		num1 = 128;
		num2 = 56;
		
		num1 = (num1&num2) | (num1 & num2);
		System.out.printf("0x%x,0x%x\n",num1,num2);
		num2 = ~(num1 ^ num2);
		System.out.printf("0x%x",num2);
		*/
		
		//3번
		/*
		String str; 
		Scanner sc = new Scanner(System.in);
		System.out.print("수를입력하세요");
		str = (sc.nextInt()>=0) ? "양수입니다" : "음수입니다";
		System.out.print(str);
		*/
		
		//4번
		int dice;
		dice =(int)(Math.random()*100);
		System.out.println("1번 다이스 "+dice);
		
		dice =((int)(Math.random()*5))+11;
		System.out.println("2번 다이스 "+dice);
		
		System.out.print("3번 다이스 " );
		
		for(int i = 0; i<6;i++) {
			dice =((int)(Math.random()*44))+1;
			System.out.print(dice+" ");
		}
	}

}
