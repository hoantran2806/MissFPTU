package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DbContext;
import model.User;

public class UserDao extends BaseDao<User> {

	@Override
	List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insert(User user) {
		Connection conn = DbContext.getConnection();
        int result =0;
         try {  
            String query = "insert into [user] values(?,?,?)";
            
            PreparedStatement psmt = conn.prepareStatement(query);
            
            psmt.setString(1, user.getUsername());
            psmt.setString(2, user.getEmail());
            psmt.setString(3, user.getPassword());
            
            result = psmt.executeUpdate();
            System.err.println("Result "+result);

            psmt.close();
            conn.close();
          
        } catch (SQLException ex) {
        }
         return result == 1;
 
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	public User getBy(String username){
        User user = null;
        Connection conn = DbContext.getConnection();
        try {  
            String query = "select * from [user] where username = ?";
            
            PreparedStatement psmt = conn.prepareStatement(query);
            
            psmt.setString(1, username);
            
            ResultSet resultSet = psmt.executeQuery();
            
            
            if(resultSet.next()){
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                user = new User(username, password,email);
            }
            psmt.close();
            conn.close();
        } catch (SQLException ex) {
        }
      
        return user;
        
    }

    public boolean checkExistEmail(String email){
            boolean duplicate = false;
            Connection conn = DbContext.getConnection();
            try {  
                String query = "select * from [user] where email = ?";

                PreparedStatement psmt = conn.prepareStatement(query);

                psmt.setString(1, email);

                ResultSet resultSet = psmt.executeQuery();


                if(resultSet.next()){
                   duplicate = true;
                }
                psmt.close();
                conn.close();
            } catch (SQLException ex) {
        }
        return duplicate;
    }
    
    public boolean checkExistUsername(String username){
        boolean duplicate = false;
        Connection conn = DbContext.getConnection();
        try {  
            String query = "select * from [user] where username = ?";

            PreparedStatement psmt = conn.prepareStatement(query);

            psmt.setString(1, username);

            ResultSet resultSet = psmt.executeQuery();


            if(resultSet.next()){
               duplicate = true;
            }
            psmt.close();
            conn.close();
        } catch (SQLException ex) {
        }
     return duplicate;
 }

}
