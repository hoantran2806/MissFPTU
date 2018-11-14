package model;

public class Image extends BaseModel {
	private int imgId;
	private String imgName;
	private int imgSize;
	private int cateId;
	private String imgUrl;
	private String imgDesc;
	public Image() {
		super();
	}
	
	public Image(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	
	public Image(int imgId, String imgName, int imgSize, int cateId, String imgUrl, String imgDesc) {
		super();
		this.imgId = imgId;
		this.imgName = imgName;
		this.imgSize = imgSize;
		this.cateId = cateId;
		this.imgUrl = imgUrl;
		this.imgDesc = imgDesc;
	}
	public int getImgId() {
		return imgId;
	}
	public void setImgId(int imgId) {
		this.imgId = imgId;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	public int getImgSize() {
		return imgSize;
	}
	public void setImgSize(int imgSize) {
		this.imgSize = imgSize;
	}
	public int getCateId() {
		return cateId;
	}
	public void setCateId(int cateId) {
		this.cateId = cateId;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getImgDesc() {
		return imgDesc;
	}
	public void setImgDesc(String imgDesc) {
		this.imgDesc = imgDesc;
	}
	
	

}
