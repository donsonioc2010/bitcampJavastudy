package main;

import java.util.Scanner;

public class areaClass {
	static double pi=3.14;
	double n[] = new double[2],area;
	
	public void init() {
		double area = 0;
		for (int i = 0; i < n.length; i++) 
			n[i] = 0;
	}
	
	public void select() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.원 / 2.사각형 >>");
		if(sc.nextInt()==1)	input(1);
		else		input(2);
	}
	public void input(int a) {
		Scanner sc = new Scanner(System.in);
		if(a==1) {
			System.out.print("반지름을 입력하세요 =>");
			n[0] = sc.nextInt();
			circleArea();
		}
		else {
			System.out.print("1.정사각형 / 2.직사각형");
			if(sc.nextInt()==1) {
				System.out.print("한변의 길이는? : ");
				n[0] = sc.nextInt();
				n[1] = n[0];
			}else {
				for(int i = 0; i<n.length;i++) {
					System.out.print((i+1)+"번째 길이는?");
					n[i] = sc.nextInt();
				}
			}
			qurdArea();
		}
	}
	public void circleArea() {
		area = n[0]*n[0]*pi;
		print();
	}
	public void qurdArea() {
		area = n[0]*n[1];
		print();
	}
	public void print() {
		System.out.println("구한 면적은 : "+area);
	}
}
