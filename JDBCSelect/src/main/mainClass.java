package main;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.UserDto;
import jdbc.SelectTest;

public class mainClass {

	public static void main(String[] args) {
		
		DBConnection.initConnection();
		SelectTest st = new SelectTest();
		String id = "abc";
		UserDto dto = st.onesearch(id);
		id = "abc";
		dto = st.Select(id);
		if(id != null) {
			System.out.println(dto.toString());
		}else {
			System.out.println("등록되어 있지 않습니다.");
		}
		
		List<UserDto> list = st.getUserList();
		for (UserDto user : list) {
			System.out.println(user.toString());
		}
	}

}





