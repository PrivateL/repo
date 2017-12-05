package sys.studypath;

import java.util.Date;

/**
 * StudyPath entity. @author MyEclipse Persistence Tools
 */

public class StudyPath{

	// Fields

	private Integer pathId;
	private String pathName;
	private Integer ctgSecId;
	private Integer industryId;
	private String pathDesc;
	private Integer pathWeight;
	private String pathImage;
	private Date pathCreateTime;

	// Constructors

	/** default constructor */
	public StudyPath() {
	}

	/** full constructor */
	public StudyPath(String pathName, Integer ctgSecId, Integer industryId,
			String pathDesc, Integer pathWeight, String pathImage,
			Date pathCreateTime) {
		this.pathName = pathName;
		this.ctgSecId = ctgSecId;
		this.industryId = industryId;
		this.pathDesc = pathDesc;
		this.pathWeight = pathWeight;
		this.pathImage = pathImage;
		this.pathCreateTime = pathCreateTime;
	}

	// Property accessors

	public Integer getPathId() {
		return this.pathId;
	}

	public void setPathId(Integer pathId) {
		this.pathId = pathId;
	}

	public String getPathName() {
		return this.pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public Integer getCtgSecId() {
		return this.ctgSecId;
	}

	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}

	public Integer getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}

	public String getPathDesc() {
		return this.pathDesc;
	}

	public void setPathDesc(String pathDesc) {
		this.pathDesc = pathDesc;
	}

	public Integer getPathWeight() {
		return this.pathWeight;
	}

	public void setPathWeight(Integer pathWeight) {
		this.pathWeight = pathWeight;
	}

	public String getPathImage() {
		return this.pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}

	public Date getPathCreateTime() {
		return this.pathCreateTime;
	}

	public void setPathCreateTime(Date pathCreateTime) {
		this.pathCreateTime = pathCreateTime;
	}

}