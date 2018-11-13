package controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet(urlPatterns = "/admin/all-user")

public class ListUserController extends HttpServlet {
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao dao= new UserDao();
		List<User> allUser = dao.getAllUser();
		req.setAttribute("userAll", allUser);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/list-user.jsp");
		dispatcher.forward(req, resp);
	}
}
