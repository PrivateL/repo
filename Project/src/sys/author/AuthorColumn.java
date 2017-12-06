package sys.author;

import java.util.Date;

import sys.category.Category;

// 作者专栏表
public class AuthorColumn {

	private Integer acId;
	private String authorName;// 作者姓名
	private String authorDesc;// 作者描述
	private String authorPhoto;// 作者照片
	private String columnName;// 专栏名字
	private Category category;// 分类
	private long coiumnPrice;// 专栏价格
	private Integer columnWeight;// 订阅数
	private String columnDesc;// 专栏描述
	private String columnImage;// 专栏图片
	private Date columnUploadTime;// 专栏上传时间

	public Integer getAcId() {
		return this.acId;
	}

	public void setAcId(Integer acId) {
		this.acId = acId;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorDesc() {
		return this.authorDesc;
	}

	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}

	public String getAuthorPhoto() {
		return this.authorPhoto;
	}

	public void setAuthorPhoto(String authorPhoto) {
		this.authorPhoto = authorPhoto;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public long getCoiumnPrice() {
		return this.coiumnPrice;
	}

	public void setCoiumnPrice(long coiumnPrice) {
		this.coiumnPrice = coiumnPrice;
	}

	public Integer getColumnWeight() {
		return this.columnWeight;
	}

	public void setColumnWeight(Integer columnWeight) {
		this.columnWeight = columnWeight;
	}

	public String getColumnDesc() {
		return this.columnDesc;
	}

	public void setColumnDesc(String columnDesc) {
		this.columnDesc = columnDesc;
	}

	public String getColumnImage() {
		return this.columnImage;
	}

	public void setColumnImage(String columnImage) {
		this.columnImage = columnImage;
	}

	public Date getColumnUploadTime() {
		return this.columnUploadTime;
	}

	public void setColumnUploadTime(Date columnUploadTime) {
		this.columnUploadTime = columnUploadTime;
	}

}