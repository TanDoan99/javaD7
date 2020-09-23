package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnection {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3306/myfriends";
		String username = "root";
		String password = "";
		
		try {
			//Nạp driver
			Class.forName("com.mysql.jdbc.Driver");
			// Tạo connection
			conn = DriverManager.getConnection(url, username, password);
			// thực thi truy vấn
			st = conn.createStatement();
			// nhận kết quả trả về
			String sql = "SELECT * FROM friends";
			rs = st.executeQuery(sql);
			//in kết quả
			while(rs.next()) {
				System.out.println(rs.getString("fname"));
				System.out.println();
				System.out.println(rs.getInt("fid"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
