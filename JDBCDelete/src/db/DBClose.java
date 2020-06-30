package db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBClose {
	public static void close(Statement stmt, Connection conn, ResultSet rs) {
		try {
			if(stmt != null)
				stmt.close();
			if(conn != null)
				conn.close();
			if(rs != null)	//select절을 사용할때 필요하다
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
