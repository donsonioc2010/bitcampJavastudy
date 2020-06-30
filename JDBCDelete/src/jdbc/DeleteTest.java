package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBClose;
import db.DBConnection;

public class DeleteTest {
	
	public boolean Delete(String id) {
		String sql = "DELETE FROM USERTEST WHERE ID = '"+ id +"'";
		System.out.println(sql);
		
		Connection conn = DBConnection.getConnection();
		Statement stmt = null;
		
		int count = 0;
		try {
			stmt = conn.createStatement();
			count = stmt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBClose.close(stmt, conn, null);
		}
		return count >0? true:false;
	}
}
