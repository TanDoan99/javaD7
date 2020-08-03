package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controllers.JDBCConnectionUtil;
import model.bean.Friends;

public class FriendsDAO {
	private static Connection conn;
	private static Statement st;
	private static PreparedStatement pst;
	private static ResultSet rs;
	public static ArrayList<Friends> getItems() {
		ArrayList<Friends> listItems = new ArrayList<>();
		conn = JDBCConnectionUtil.getConnection();
		try {
			String sql = "SELECT * FROM friends";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int fid = rs.getInt("fid");
				String fname = rs.getString("fname");
				String preview = rs.getString("preview");
				String detail = rs.getString("detail");
				Date date_create = rs.getDate("date_create");
				int fl_id=rs.getInt("fl_id");
				int count_number=rs.getInt("count_number");
				String picture=rs.getString("picture");

				Friends objItem = new Friends(fid, fname, preview, detail, date_create, fl_id, count_number, picture);
				listItems.add(objItem);
			}
			 	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionUtil.close(rs, st, conn);
		}
		return listItems;
	}
	
	public static ArrayList<Friends> getItemsByIdCat(int idCat) {
		ArrayList<Friends> listItems = new ArrayList<>();
		conn = JDBCConnectionUtil.getConnection();
		try {
			String sql = "SELECT * FROM friends WHERE fl_id= ?";
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idCat);
			rs = pst.executeQuery();
			while (rs.next()) {
				int fid = rs.getInt("fid");
				String fname = rs.getString("fname");
				String preview = rs.getString("preview");
				String detail = rs.getString("detail");
				Date date_create = rs.getDate("date_create");
				int fl_id=rs.getInt("fl_id");
				int count_number=rs.getInt("count_number");
				String picture=rs.getString("picture");
				
				Friends objItems=new Friends(fid, fname, preview, detail, date_create, fl_id, count_number, picture);
				listItems.add(objItems);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionUtil.close(rs, st, conn);
		}
		return listItems;
	}
	
	public static Friends getItemsById(int fid) {
		Friends objFr = null;
		conn = JDBCConnectionUtil.getConnection();
		String sql = "SELECT * FROM friends WHERE fid = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, fid);
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("fid");
				String fname = rs.getString("fname");
				String preview = rs.getString("preview");
				String detail = rs.getString("detail");
				Date date_create = rs.getDate("date_create");
				int fl_id=rs.getInt("fl_id");
				int count_number=rs.getInt("count_number");
				String picture=rs.getString("picture");
				objFr = new Friends(id, fname, preview, detail, date_create, fl_id, count_number, picture);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionUtil.close(rs, st, conn);
		}
		return objFr;
	}
}
