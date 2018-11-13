package dao;

import java.util.List;

import model.BaseModel;

public abstract class BaseDao <T extends BaseModel> {
		abstract List<T> getAll();
	    
	    abstract boolean insert(T t);
	    
	    abstract boolean update(T t);
	    
	    abstract boolean delete(String id);
}
