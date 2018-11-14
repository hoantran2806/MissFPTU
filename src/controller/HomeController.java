package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import util.Constant;
@WebServlet(urlPatterns="/home")
public class HomeController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session= req.getSession();
		if(session==null) {
			resp.sendRedirect("/login");
			
		}else {
			User u = (User) session.getAttribute(Constant.SESSION_USERNAME);
			if(u!=null) {
				if(u.getRoleId()==1) {
					resp.sendRedirect("/admin");
				}else if (u.getRoleId()==2) {
					resp.sendRedirect("./");					
				}
			}
		}
		
	}
	

}
