package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnect {
	public JDBCConnect() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Class.forName==Ŭ������ �ִ��� ������ Ȯ���ҋ� �����
			
			System.out.println("Driver Loading Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public Connection getConn() {
		Connection conn = null;
		try {
			conn  = DriverManager.getConnection("jdbc:oracle:thin:@192.168.7.91:1521:xe", "hr", "hr");
			//url == jdbc -�Ӽ� - driver�Ӽ� - URL
			
			System.out.println("Oracle Connection Success");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
