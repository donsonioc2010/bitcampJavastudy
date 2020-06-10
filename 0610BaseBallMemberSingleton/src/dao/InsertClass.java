package dao;

import java.util.Scanner;

import Singleton.Singleton;
import dto.*;

public class InsertClass {
	Scanner sc = new Scanner(System.in);
	//Singleton 객체 받기 해당클래스에서 사용할 스캐너 정의
	
	Human h = null;		//singleton에 데이터를 보낼 객체
	int pos,age,a,b;	//a,b == batter/pitcher 첫번째 두번째 항목을 담기위함
	double height,c;	//c == batter/pitcher의 double형 항목을 담기 위함
	String name;
	
	public InsertClass() {
		Singleton single = Singleton.getInstance();
		getInfo();
		int memNum = single.memNum;
		if(pos==1)
			h = new Pitcher(memNum, name, age, height, a, b, c);
		else
			h = new Batter(memNum, name, age, height, a, b, c);
		single.memNum++;
		single.h.add(h);
	}
	public void getInfo() {
		//select position
		System.out.print("투수(1)/타자(2) = ");
		pos = sc.nextInt();
		
		// human
		System.out.print("이름 = ");
		name = sc.next();
		
		System.out.print("나이 = ");
		age = sc.nextInt();
		
		System.out.print("신장 = ");
		height = sc.nextDouble();
		if(pos==1)
			getPit();
		else
			getBat();
	}
	//pos 1(투수선택시)
	public void getPit() {
		// win
		System.out.print("승 = ");
		a = sc.nextInt();
		
		// lose
		System.out.print("패 = ");
		b = sc.nextInt();
		
		// defense
		System.out.print("방어율 = ");
		c = sc.nextDouble();
	}
	
	//pos 2(타자 선택시)
	public void getBat() {
		System.out.print("타수 = ");
		a = sc.nextInt();
		
		// lose
		System.out.print("안타수 = ");
		b = sc.nextInt();
		
		// defense
		System.out.print("타율 = ");
		c = sc.nextDouble();
	}
	
	
	
	
}
