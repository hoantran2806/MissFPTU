package service;

import dao.UserDao;
import model.User;

public class AuthenService {
	 private UserDao dao;

	    public AuthenService() {
	        dao = new UserDao();
	    }
	    
	    
	    public boolean login(String username, String password){
	        
	        User user = dao.getBy(username);
	        
	        if(user==null||!password.equals(user.getPassword())){
	            return false;
	        }
	        
	        return true;
	    }
	    
	    public boolean register(String username, String password, String email){
	        
	        if(dao.checkExistEmail(email)||dao.checkExistUsername(username)){
	            return false;
	        }
	        boolean isSuccess = dao.insert(new User(username, password, email));

	        return isSuccess;
	    }
	        
	    public boolean checkExistEmail(String email){
	        return dao.checkExistEmail(email);
	    }
	    
	    public boolean checkExistUsername(String username){
	        return dao.checkExistUsername(username);
	    }
}
