package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectionUsingUtil {
	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {

			conn = JDBCConnectionUtil.getConnection();
			st = conn.createStatement();
			// nhận kết quả trả về
			String sql = "SELECT * FROM friends";
			rs = st.executeQuery(sql);
			// in kết quả
			while (rs.next()) {
				System.out.println(rs.getString("fname"));
				System.out.println();
				System.out.println(rs.getInt("fid"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionUtil.close(rs, st, conn);
		}
	}
}
