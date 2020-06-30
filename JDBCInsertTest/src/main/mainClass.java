package main;

import db.DBConnection;
import jdbc.InsertTest;

public class mainClass {

	public static void main(String[] args) {
		DBConnection.initConnection();
		//InsertTest it = new InsertTest();
		
		int count = new InsertTest().insertData("abc", "홍길동", 24);
		if(count == 1) {
			System.out.println("데이터가 " + count + "개 추가 되었습니다");
		}
		

	}

}





