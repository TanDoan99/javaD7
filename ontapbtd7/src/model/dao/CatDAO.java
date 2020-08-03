package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controllers.JDBCConnectionUtil;
import model.bean.FriendList;

public class CatDAO {
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	private static PreparedStatement pst;

	public static ArrayList<FriendList> getItems() {
		ArrayList<FriendList> listItems = new ArrayList<>();
		conn = JDBCConnectionUtil.getConnection();
		String sql = "SELECT * FROM friend_list";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("fl_id");
				String name = rs.getString("flname");
				FriendList objFriend =new FriendList(id, name);
				listItems.add(objFriend);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCConnectionUtil.close(rs, st, conn);
		}
		return listItems;
	}
	
	public static FriendList getItems(int idCat) {
		FriendList objFriend = null;
		conn = JDBCConnectionUtil.getConnection();
		String sql = "SELECT * FROM friend_list WHERE fl_id = ?";
		try {
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idCat);
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("fl_id");
				String name = rs.getString("flname");
				objFriend =new FriendList(id, name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCConnectionUtil.close(rs, st, conn);
		}
		return objFriend;
	}
}
