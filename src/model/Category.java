package model;

public class Category extends BaseModel {
	private int cateId;
	private String cateName;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int cateId, String cateName) {
		super();
		this.cateId = cateId;
		this.cateName = cateName;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	

}
