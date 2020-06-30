package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void initConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("Driver Loading Success");			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() { //개통 ANG		
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
}
