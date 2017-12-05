package sys.product;

import java.util.Date;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product{

	// Fields

	private Integer PId;
	private String PName;
	private Integer ctgSecId;
	private Integer PNum;
	private String PDesc;
	private long PPrice;
	private Integer PWeight;
	private String PImage;
	private Date PUploadTime;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** full constructor */
	public Product(String PName, Integer ctgSecId, Integer PNum, String PDesc,
			long PPrice, Integer PWeight, String PImage, Date PUploadTime) {
		this.PName = PName;
		this.ctgSecId = ctgSecId;
		this.PNum = PNum;
		this.PDesc = PDesc;
		this.PPrice = PPrice;
		this.PWeight = PWeight;
		this.PImage = PImage;
		this.PUploadTime = PUploadTime;
	}

	// Property accessors

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public String getPName() {
		return this.PName;
	}

	public void setPName(String PName) {
		this.PName = PName;
	}

	public Integer getCtgSecId() {
		return this.ctgSecId;
	}

	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}

	public Integer getPNum() {
		return this.PNum;
	}

	public void setPNum(Integer PNum) {
		this.PNum = PNum;
	}

	public String getPDesc() {
		return this.PDesc;
	}

	public void setPDesc(String PDesc) {
		this.PDesc = PDesc;
	}

	public long getPPrice() {
		return this.PPrice;
	}

	public void setPPrice(long PPrice) {
		this.PPrice = PPrice;
	}

	public Integer getPWeight() {
		return this.PWeight;
	}

	public void setPWeight(Integer PWeight) {
		this.PWeight = PWeight;
	}

	public String getPImage() {
		return this.PImage;
	}

	public void setPImage(String PImage) {
		this.PImage = PImage;
	}

	public Date getPUploadTime() {
		return this.PUploadTime;
	}

	public void setPUploadTime(Date PUploadTime) {
		this.PUploadTime = PUploadTime;
	}

}