package main;

import db.DBConnection;
import jdbc.UpdateTest;

public class mainClass {

	public static void main(String[] args) {
		
		DBConnection.initConnection();
		
		UpdateTest ut = new UpdateTest();
		String id = "abc";
		int age = 23;
		
		boolean b = ut.Update(id, age);
		if(b) 
			System.out.println("정상적으로 수정 되었습니다.");
		else
			System.out.println("수정 실패");
	}

}





