package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBClose;
import db.DBConnection;

public class InsertTest {
	/*
	public InsertTest() {	//db를 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Driver Loading Success");			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() { //개통 ANG		
		Connection conn = null;		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.7.91:1521:xe", 
												"hr", "hr");			
			System.out.println("Oracle Connection Success!");
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		return conn;		
	}
	*/
	public int insertData(String id, String name, int age) {
		
		// Query -> String
		String sql = " INSERT INTO USERTEST(ID, NAME, AGE, JOINDATE) "
					+ " VALUES('" + id + "', '" + name + "', " + age + ", SYSDATE) ";
		System.out.println("sql:" + sql);
		
		//Connection conn = this.getConnection();
		Connection conn = DBConnection.getConnection();
		Statement stat = null;
		
		int count = 0;	// 몇개가 변경되었는지? 
		
		try {
			stat = conn.createStatement();			
			count = stat.executeUpdate(sql);
			
			System.out.println("성공적으로 추가 되었습니다");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { 
			DBClose.close(stat, conn, null);
		}
		return count;
	}
	
}








