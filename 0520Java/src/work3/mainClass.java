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
		//2��
		/*
		int num1,num2;
		num1 = 128;
		num2 = 56;
		
		num1 = (num1&num2) | (num1 & num2);
		System.out.printf("0x%x,0x%x\n",num1,num2);
		num2 = ~(num1 ^ num2);
		System.out.printf("0x%x",num2);
		*/
		
		//3��
		/*
		String str; 
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է��ϼ���");
		str = (sc.nextInt()>=0) ? "����Դϴ�" : "�����Դϴ�";
		System.out.print(str);
		*/
		
		//4��
		int dice;
		dice =(int)(Math.random()*100);
		System.out.println("1�� ���̽� "+dice);
		
		dice =((int)(Math.random()*5))+11;
		System.out.println("2�� ���̽� "+dice);
		
		System.out.print("3�� ���̽� " );
		
		for(int i = 0; i<6;i++) {
			dice =((int)(Math.random()*44))+1;
			System.out.print(dice+" ");
		}
	}

}
