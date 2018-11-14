package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import db.DbContext;
import model.Image;

public class ImageDao extends BaseDao<Image> {

	@Override
	public List<Image> getAll() {
		List<Image> listImage = new ArrayList<>();
		try {

			Connection conn = new DbContext().getConnection();

			Statement statement = conn.createStatement();

			String sql = "select * from IMAGE";

			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				listImage.add(new Image(rs.getString("img_url")));
			}

			statement.close();
			conn.close();
		} catch (Exception ex) {
		}

		return listImage;
	}

	@Override
	public boolean insert(Image t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Image t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
