package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

import service.AuthenService;
import util.Constant;

@WebServlet(urlPatterns="/login")
public class LoginController extends HttpServlet {
	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        //Check auto login
	        //Check session 
	        
	        HttpSession session = request.getSession(false);
	        
	        if(session!=null&&session.getAttribute("username")!=null){
	            request.getRequestDispatcher(Constant.Path.DASHBOARD)
	                    .forward(request, response);
	            return;
	        }
	        
	        
	        //Check cookie
	        Cookie [] cookies = request.getCookies();
	        
	        if(cookies!=null){
	            for (Cookie cookie : cookies) {
	                if (cookie.getName().equals("username")) {
	                    
	                    session = request.getSession(true);
	                    session.setAttribute("username", cookie.getValue());
	                    
	                    request.getRequestDispatcher(Constant.Path.DASHBOARD)
	                            .forward(request, response);
	                    return;
	                }
	            }
	       
	        }
	        
	        request.getRequestDispatcher(Constant.Path.LOGIN).forward(request, response);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        
	        String username = request.getParameter("username");
	        
	        String password = request.getParameter("password");
	        
	        boolean isRememberMe = false;
	        String remember = request.getParameter("remember");
	        
	        if("on".equals(remember)){
	            isRememberMe = true;
	        }
	        String alertMsg="";
	        
	        if(username.isEmpty() || password.isEmpty()){
	            alertMsg = "Username and password can't be empty!";
	            request.setAttribute("alert", alertMsg);
	            request.getRequestDispatcher(Constant.Path.LOGIN).forward(request, response);
	            return;
	        }
	      
	        AuthenService service = new AuthenService();
	        
	        User user = service.login(username, password);
	        

	        if(user!=null){
	            HttpSession session = request.getSession(true);
	            session.setAttribute(Constant.SESSION_USERNAME, user);
	            

	            if(isRememberMe){
	                saveRemeberMe(response, username);
	            }
	            response.sendRedirect("./admin");	
	            
	        }else{
	            alertMsg = "Username or password isn't correct";
	            request.setAttribute("alert", alertMsg);
	            request.getRequestDispatcher(Constant.Path.LOGIN).forward(request, response);
	        }
	    }
	    
	    private void saveRemeberMe(HttpServletResponse response, String username){
	        Cookie cookie = new Cookie(Constant.COOKIE_REMEMBER, username);
	        cookie.setMaxAge(30*60);
	        response.addCookie(cookie);
	    }

}
