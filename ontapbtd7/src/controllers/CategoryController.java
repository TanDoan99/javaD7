package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.FriendList;
import model.bean.Friends;
import model.dao.CatDAO;
import model.dao.FriendsDAO;
@WebServlet("/Category")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public CategoryController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		ArrayList<Friends> listFriendCat=FriendsDAO.getItemsByIdCat(id);
		FriendList fl = CatDAO.getItems(id);
		request.setAttribute("fl", fl);
		request.setAttribute("listFriendCat", listFriendCat);
		request.getRequestDispatcher("/danh-muc.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
