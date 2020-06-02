package main;

import java.util.Scanner;

public class sorting {
	// 변수(멤버변수)(두가지 이상 처리(메소드)에서 접근해야 하는 경우)
	int number[];
	boolean updown;
	
	// 처리
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정렬할 갯수 = ");
		int count = sc.nextInt();
		number = new int[count];
		
		for(int i =0; i<number.length;i++) {
			System.out.print((i+1)+"번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		System.out.print("오름(1) / 내림(2)");
		int ud = sc.nextInt();
		if(ud ==1)	updown = true;
		else		updown = false;
	}
	public void sorting() {
		for (int i = 0; i < number.length; i++) {
			for (int j = i+1; j < number.length; j++) {
				if(updown) {
					if(number[i]>number[j])
						swap(i,j);
				}else {
					if(number[i]<number[j])
						swap(i,j);
				}
			}
		}
	}
	public void swap(int i, int j) {
		int temp = number[i];
		number[i] = number[j];
		number[j] = temp;
	}
	public void result() {
		for(int i = 0; i<number.length; i++)
			System.out.println((i+1)+ " : "+number[i]);
	}
	
}
