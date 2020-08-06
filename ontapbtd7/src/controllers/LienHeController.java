package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.LienHe;


@WebServlet("/LienHeController")
public class LienHeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ArrayList<LienHe> listAdd=new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LienHeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int phone = Integer.parseInt(request.getParameter("phone"));
		String mess = request.getParameter("mess");
		String sql = "insert into contact(name,email,phone,content) values (?,?,?,?)";
		listAdd.add(new LienHe(name, email, phone, mess));
		Connection connect = JDBCConnectionUtil.getConnection();
		try {
			PreparedStatement ps = connect.prepareStatement(sql);
			for(LienHe objLh : listAdd) {
				ps.setString(1, objLh.getName());ps.setString(2, objLh.getEmail());ps.setInt(3, objLh.getPhone());ps.setString(4, objLh.getMess());
				ps.executeUpdate();
			}
			out.print("<h3 style='color:green'> Thêm thành công vào cơ sở dữ liệu !!! </h3>");
			
			ps.close();
			JDBCConnectionUtil.close(connect);
		} catch (SQLException e) {
			out.print("<h3 style='color:red'> Có lỗi xảy ra!!! </h3>");
			e.printStackTrace();
		}
	}

}
