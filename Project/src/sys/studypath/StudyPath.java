package sys.studypath;

import java.util.Date;

import sys.category.Category;

/**
 * StudyPath entity. @author MyEclipse Persistence Tools
 */

// 学习路径

public class StudyPath{

	// Fields

	private Integer pathId;
	private String pathName;// 学习路径名
	private Category category;// 所属分类
	private Integer industryId;// 所属行业
	private String pathDesc;// 描述
	private Integer pathWeight;// 点击量
	private String pathImage;// 图片
	private Date pathCreateTime;// 上传时间

	public StudyPath() {
	}

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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