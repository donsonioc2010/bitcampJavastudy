package main;

import db.DBConnection;
import jdbc.DeleteTest;

public class mainClass {

	public static void main(String[] args) {
		
		DBConnection.initConnection();
		
		DeleteTest ut = new DeleteTest();
		String id = "abc";
		
		boolean b = ut.Delete(id);
		if(b) 
			System.out.println("정상적으로 삭제 되었습니다.");
		else
			System.out.println("삭제실패");
	}

}





