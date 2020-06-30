package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DBClose;
import db.DBConnection;
import dto.UserDto;

public class SelectTest {
	public List<UserDto> getUserList(){
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		
		List<UserDto> list = new ArrayList<UserDto>();
		
		String sql = "SELECT EMPLOYEE_ID,LAST_NAME,DEPARTMENT_ID,JOB_ID FROM EMPLOYEES";
		try {
			psmt = conn.prepareStatement(sql);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("EMPLOYEE_ID");
				String name = rs.getString("LAST_NAME");
				int age = rs.getInt("DEPARTMENT_ID");
				String joindate = rs.getString("JOB_ID");
				
				list.add(new UserDto(id, name, age, joindate));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, rs);
		}
		
		return list;
	}
	//다른방법의 데이터한개
	public UserDto Select(String id) {
		String sql = "SELECT ID,NAME,AGE,JOINDATE "+
				" FROM USERTEST "+"WHERE ID = ? ";
		Connection conn = DBConnection.getConnection();
		PreparedStatement psmt = null;
		ResultSet rs = null;
		UserDto dto = null;
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			//=="SELECT ID,NAME,AGE,JOINDATE "+" FROM USERTEST "+"WHERE ID = +'" +id +"'";\
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				dto = new UserDto();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setJoindate(rs.getString("joindate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(psmt, conn, rs);
			//psmt==stmt 해당됨
		}
		return dto;
	}
	
	//1개의 data만 취득하는경우
	public UserDto onesearch(String id) {
		String sql = "SELECT ID,NAME,AGE,JOINDATE "+
					" FROM USERTEST "+"WHERE ID = '"+id + "'";
		System.out.println(sql);
		Connection conn = DBConnection.getConnection();
		Statement stmt = null; 
		ResultSet rs = null;
		
		UserDto dto = null;
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) { //데이터가 있는경우
				String _id = rs.getString("id");
				String _name = rs.getString("name");
				int _age = rs.getInt("age");
				String _joindate = rs.getString("joindate");
				
				dto = new UserDto(_id, _name, _age, _joindate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBClose.close(stmt, conn, rs);;
		}
		return dto;
	}
}
