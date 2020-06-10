package dao;

import java.util.Scanner;

import Singleton.Singleton;
import dto.*;


public class SelectClass {

	public SelectClass() {

		Singleton single = Singleton.getInstance();
		String name = new getName().name;
		int index = new search(name).index;
		
		if(index == -1) {
			System.out.println("선수 명단에 없습니다.");
		}else {
			printMember(single.h.get(index));
		}
	}

	public void printMember(Human h) {
		System.out.println("번호:" + h.getNumber());
		System.out.println("이름:" + h.getName());
		System.out.println("나이:" + h.getAge());
		System.out.println("신장:" + h.getHeight());
		
		if(h instanceof Pitcher) {
			System.out.println("승리:" + ((Pitcher)h).getWin() );
			System.out.println("패전:" + ((Pitcher)h).getLose() );
			System.out.println("방어율:" + ((Pitcher)h).getDefence() );
		}
		else if(h instanceof Batter) {
			System.out.println("타수:" + ((Batter)h).getBatcount() );
			System.out.println("안타수:" + ((Batter)h).getHit() );
			System.out.println("타율:" + ((Batter)h).getHitAvg() );
		}
	}
}
