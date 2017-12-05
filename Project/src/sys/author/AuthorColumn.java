package sys.author;

import java.util.Date;

/**
 * AuthorColumn entity. @author MyEclipse Persistence Tools
 */

public class AuthorColumn {

	// Fields

	private Integer acId;
	private String authorName;
	private String authorDesc;
	private String authorPhoto;
	private String columnName;
	private Integer ctgSecId;
	private long coiumnPrice;
	private Integer columnWeight;
	private String columnDesc;
	private String columnImage;
	private Date columnUploadTime;

	// Constructors

	/** default constructor */
	public AuthorColumn() {
	}

	/** full constructor */
	public AuthorColumn(String authorName, String authorDesc,
			String authorPhoto, String columnName, Integer ctgSecId,
			long coiumnPrice, Integer columnWeight, String columnDesc,
			String columnImage, Date columnUploadTime) {
		this.authorName = authorName;
		this.authorDesc = authorDesc;
		this.authorPhoto = authorPhoto;
		this.columnName = columnName;
		this.ctgSecId = ctgSecId;
		this.coiumnPrice = coiumnPrice;
		this.columnWeight = columnWeight;
		this.columnDesc = columnDesc;
		this.columnImage = columnImage;
		this.columnUploadTime = columnUploadTime;
	}

	// Property accessors

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

	public Integer getCtgSecId() {
		return this.ctgSecId;
	}

	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
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