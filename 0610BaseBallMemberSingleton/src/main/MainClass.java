package main;

import java.util.Scanner;

import File.fileLoad;
import File.fileSave;
import dao.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// menu 구성	== front end -> View
		new fileLoad();
		// 1. 선수 추가
		while(true) {
			System.out.println("1. 선수등록");
			System.out.println("2. 선수삭제");
			System.out.println("3. 선수검색");
			System.out.println("4. 선수수정");
			System.out.println("5. 선수 모두 출력");
			System.out.println("6. 데이터저장");
			System.out.println("7. 타자타율소팅");
			System.out.println("8. 투수디펜스소팅");
			System.out.println("10. 프로그램종료 ");
			
			
			System.out.print("메뉴번호입력 >>>");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					new InsertClass();
					break;
				case 2:
					new DeleteClass();
					break;
				case 3:
					new SelectClass();
					break;
				case 4:
					new UpdateClass();
					break;
				case 5:
					new Allprint();
					break;
				case 7:
					new batterHitRanking();
					break;
				case 8:
					new pitcherDefenseRanking();
					break;
					
				case 6:
					new fileSave();
					break;
					
				case 10:
					System.exit(0);
					break;
	
				default:
					break;
			}
	
		}


	}

}
