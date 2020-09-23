package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.News;
import model.dao.NewsDAO;
@WebServlet("/ChiTiet")
public class DetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public DetailController() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id=0;
		try {
			 id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			request.getRequestDispatcher("/PageNotFound.jsp").forward(request, response);
			return;
		}
		News item = NewsDAO.getItemsById(id);
		request.setAttribute("item", item);
		request.getRequestDispatcher("/detail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
