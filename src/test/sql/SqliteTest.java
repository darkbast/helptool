package test.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqliteTest {
	
	public static void main(String[] args) {
		Connection conn = null;
		try{
			String url = "jdbc:sqlite:res/tool.db";
			conn = DriverManager.getConnection(url);
			PreparedStatement ps = null;
			
			// 삽입
			ps = conn.prepareStatement("SELECT MAX(ID) AS ID   FROM M_HELP");
			ResultSet rs = ps.executeQuery();
			Integer id = rs.getInt("ID")+1;
			
			
			ps = conn.prepareStatement("INSERT INTO M_HELP('ID','TAG','KBN1','CONTENTS') VALUES(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, "SQL");
			ps.setString(3, "MYSQL");
			ps.setString(4, "테스트1");

			int updCnt = ps.executeUpdate();
			System.out.println(updCnt);

			ps = conn.prepareStatement("SELECT * FROM M_HELP");
			rs = ps.executeQuery();
			while (rs.next()){
				System.out.println(rs.getInt("ID"));
				System.out.println(rs.getString("TAG"));
				System.out.println(rs.getString("KBN1"));
				System.out.println(rs.getString("CONTENTS"));
			}
			

		}catch(SQLException e){
			System.out.println(e.getMessage());
		}finally {
			try{
				if (null != conn){
					conn.close();
				}
			}catch(SQLException ex){
				System.out.println(ex.getMessage());
			}
		}
	}

}
