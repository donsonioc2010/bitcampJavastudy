package main;

import java.io.File;
import java.lang.reflect.Member;
import java.util.Scanner;

import dao.MemberDao;

public class MainClass {

	public static void main(String[] args) {
		MemberDao memdao ;
		//메뉴구성 == 사용자가 보는구성Front
		Scanner sc = new Scanner(System.in);
		java.io.File file = new java.io.File("d:/tmp/baseinfo.txt");
		if(file.exists()) {
			FileIO.File dload = new FileIO.File();
			memdao = dload.dataLoad();
		}else {
			memdao = new MemberDao();
		}
		boolean loopEnd = true;
		//추가,삭제,검색,수정,출력
		while(loopEnd) {
			System.out.println("\t\t   Menu");
			System.out.println("=========================================");
			System.out.println("1. 선수추가\t2. 선수삭제\t3. 선수검색");
			System.out.println("4. 정보수정\t5. 전체출력");
			System.out.println("=========================================");
			System.out.println("원하는메뉴를 입력하세요 >>");
			int a = sc.nextInt();
			
			switch (a) {
				case 1:
					memdao.insert();
					break;
				case 2:
					memdao.delete();
					break;
				case 3:
					memdao.select();
					break;
				case 4:
					memdao.update();
					break;
				case 5:
					memdao.allprint();
					break;
				default:
					loopEnd = false;
					break;
			}
		}
		
	}

}
