package sys.ebook;

import java.util.Date;

/**
 * ProEbook entity. @author MyEclipse Persistence Tools
 */

public class ProEbook {

	// Fields

	private Integer ebookId;
	private String ebookName;
	private Integer ctgSecId;
	private String ebookDesc;
	private double ebookWeight;
	private Date ebookUploadTime;
	private String ebookImage;
	private String ebookAuthor;
	private long ebookPrice;
	private String ebookUrl;

	// Constructors

	/** default constructor */
	public ProEbook() {
	}

	/** full constructor */
	public ProEbook(String ebookName, Integer ctgSecId, String ebookDesc,
			double ebookWeight, Date ebookUploadTime, String ebookImage,
			String ebookAuthor, long ebookPrice, String ebookUrl) {
		this.ebookName = ebookName;
		this.ctgSecId = ctgSecId;
		this.ebookDesc = ebookDesc;
		this.ebookWeight = ebookWeight;
		this.ebookUploadTime = ebookUploadTime;
		this.ebookImage = ebookImage;
		this.ebookAuthor = ebookAuthor;
		this.ebookPrice = ebookPrice;
		this.ebookUrl = ebookUrl;
	}

	// Property accessors

	public Integer getEbookId() {
		return this.ebookId;
	}

	public void setEbookId(Integer ebookId) {
		this.ebookId = ebookId;
	}

	public String getEbookName() {
		return this.ebookName;
	}

	public void setEbookName(String ebookName) {
		this.ebookName = ebookName;
	}

	public Integer getCtgSecId() {
		return this.ctgSecId;
	}

	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}

	public String getEbookDesc() {
		return this.ebookDesc;
	}

	public void setEbookDesc(String ebookDesc) {
		this.ebookDesc = ebookDesc;
	}

	public double getEbookWeight() {
		return this.ebookWeight;
	}

	public void setEbookWeight(double ebookWeight) {
		this.ebookWeight = ebookWeight;
	}

	public Date getEbookUploadTime() {
		return this.ebookUploadTime;
	}

	public void setEbookUploadTime(Date ebookUploadTime) {
		this.ebookUploadTime = ebookUploadTime;
	}

	public String getEbookImage() {
		return this.ebookImage;
	}

	public void setEbookImage(String ebookImage) {
		this.ebookImage = ebookImage;
	}

	public String getEbookAuthor() {
		return this.ebookAuthor;
	}

	public void setEbookAuthor(String ebookAuthor) {
		this.ebookAuthor = ebookAuthor;
	}

	public long getEbookPrice() {
		return this.ebookPrice;
	}

	public void setEbookPrice(long ebookPrice) {
		this.ebookPrice = ebookPrice;
	}

	public String getEbookUrl() {
		return this.ebookUrl;
	}

	public void setEbookUrl(String ebookUrl) {
		this.ebookUrl = ebookUrl;
	}

}