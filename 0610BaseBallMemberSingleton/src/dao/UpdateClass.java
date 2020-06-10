package dao;

import java.util.Scanner;

import Singleton.Singleton;
import dto.*;

public class UpdateClass {
	int a,b;
	double c;
	public UpdateClass() {

		Singleton single = Singleton.getInstance();
		String name = new getName().name;
		//선수명 입력
		
		int index = new search(name).index;
		if(index == -1) {
			System.out.println("선수 명단에 없습니다");
			return;
		}
		else {
			Human h = single.h.get(index);
			if(h instanceof Pitcher) {
				input(true);
				
				Pitcher pit = (Pitcher)single.h.get(index);
				pit.setWin(a);
				pit.setLose(b);
				pit.setDefence(c);			
			}
			else if(h instanceof Batter) {
				input(false);
				
				Batter bat = (Batter)single.h.get(index);
				bat.setBatcount(a);
				bat.setHit(b);
				bat.setHitAvg(c);			
			}		
		}
	}
	public void input(boolean key) {
		Scanner sc = new Scanner(System.in);
		if(key) {//투수
			System.out.print("승 = ");
			a = sc.nextInt();
			
			System.out.print("패 = ");
			b = sc.nextInt();
			
			System.out.print("방어율 = ");
			c = sc.nextDouble();
			
		}else{//타자
			System.out.print("타수 = ");
			a = sc.nextInt();
			
			System.out.print("안타수 = ");
			b = sc.nextInt();
			
			System.out.print("타율 = ");
			c = sc.nextDouble();
			
		}
	}
}
