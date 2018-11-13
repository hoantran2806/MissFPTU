package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.AuthenService;
import util.Constant;
@WebServlet(urlPatterns="/signup")

public class SignUpController extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher(Constant.Path.REGISTER).forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        AuthenService service = new AuthenService();
        String alertMsg ="";

        if(service.checkExistEmail(email)){
            alertMsg = "Email already exist!";
            request.setAttribute("alert", alertMsg);
            request.getRequestDispatcher(Constant.Path.REGISTER).forward(request, response);
            return;
        }
        if(service.checkExistUsername(username)){
            alertMsg = "Username already exist!";
            request.setAttribute("alert", alertMsg);
            request.getRequestDispatcher(Constant.Path.REGISTER).forward(request, response); 
            return;
        }
        
        boolean isSuccess = service.register(username,password,email);
        
        
        
        if(isSuccess){
            request.setAttribute("alert", alertMsg);
            request.getRequestDispatcher(Constant.Path.HOME).forward(request, response);
        }else{
            alertMsg = "System error!";
            request.setAttribute("alert", alertMsg);
            request.getRequestDispatcher(Constant.Path.REGISTER).forward(request, response);
        }
    }

}
