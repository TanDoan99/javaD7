package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controllers.JDBCConnectionUtil;
import model.bean.News;

public class NewsDAO {

	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	private static PreparedStatement pst;

	public static ArrayList<News> getItems() {
		ArrayList<News> listItems = new ArrayList<>();
		conn = JDBCConnectionUtil.getConnection();
		try {
			String sql = "SELECT * FROM tintuc";
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("ID_TinTuc");
				String name = rs.getString("TenTinTuc");
				String moTa = rs.getString("MoTa");
				String chiTiet = rs.getString("ChiTiet");

				News objItem = new News(id, name, moTa, chiTiet);
				listItems.add(objItem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionUtil.close(rs, st, conn);
		}
		return listItems;
	}

	public static ArrayList<News> getItemsByIdCat(int idCat) {
		ArrayList<News> listItems = new ArrayList<>();
		conn = JDBCConnectionUtil.getConnection();
		try {
			String sql = "SELECT * FROM tintuc WHERE ID_DanhMucTin= ?" ;
			pst = conn.prepareStatement(sql);
			pst.setInt(1, idCat);
			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("ID_TinTuc");
				String name = rs.getString("TenTinTuc");
				String moTa = rs.getString("MoTa");
				String chiTiet = rs.getString("ChiTiet");

				News objItem = new News(id, name, moTa, chiTiet);
				listItems.add(objItem);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionUtil.close(rs, pst, conn);
		}
		return listItems;
	}

	public static News getItemsById(int idNews) {
		News item = null;
		conn = JDBCConnectionUtil.getConnection();
		try {
			String sql = "SELECT * FROM tintuc WHERE ID_TinTuc = ?";
			pst = conn.prepareStatement(sql);//Cần truyền vào câu lệnh sql 1 hoặc nhiều giá trị
			pst.setInt(1, idNews);
			
			rs = pst.executeQuery();
			if (rs.next()) {
				int id = rs.getInt("ID_TinTuc");
				String name = rs.getString("TenTinTuc");
				String moTa = rs.getString("MoTa");
				String chiTiet = rs.getString("ChiTiet");
				item = new News(id, name, moTa, chiTiet);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCConnectionUtil.close(rs, pst, conn);
		}
		return item;
	}


}
