package sys.audio;

import java.util.Date;

import sys.author.AuthorColumn;
import sys.category.Category;

/**
 * ProAudio entity. @author MyEclipse Persistence Tools
 */
// 音频
public class ProAudio{

	// Fields

	private Integer audioId;
	private String audioName;// 标题或对应的书名
	private Category category;// 所属分类的id
	private AuthorColumn authorColumn;// 说书人的id
	private String audioDesc;// 音频描述
	private String audioLong;// 时长
	private Integer audioWeight;// 权值，衡量是否最受欢迎或计算点击量等
	private String audioImage;// 封面图片地址
	private String audioUrl;// 音频存放地址
	private Date audioUploadTime;// 音频的上传时间
	private Integer pathId;// 所属学习路径的id

	public Integer getAudioId() {
		return this.audioId;
	}

	public void setAudioId(Integer audioId) {
		this.audioId = audioId;
	}

	public String getAudioName() {
		return this.audioName;
	}

	public void setAudioName(String audioName) {
		this.audioName = audioName;
	}



	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	
	public AuthorColumn getAuthorColumn() {
		return authorColumn;
	}

	public void setAuthorColumn(AuthorColumn authorColumn) {
		this.authorColumn = authorColumn;
	}

	public String getAudioDesc() {
		return this.audioDesc;
	}

	public void setAudioDesc(String audioDesc) {
		this.audioDesc = audioDesc;
	}

	public String getAudioLong() {
		return this.audioLong;
	}

	public void setAudioLong(String audioLong) {
		this.audioLong = audioLong;
	}

	public Integer getAudioWeight() {
		return this.audioWeight;
	}

	public void setAudioWeight(Integer audioWeight) {
		this.audioWeight = audioWeight;
	}

	public String getAudioImage() {
		return this.audioImage;
	}

	public void setAudioImage(String audioImage) {
		this.audioImage = audioImage;
	}

	public String getAudioUrl() {
		return this.audioUrl;
	}

	public void setAudioUrl(String audioUrl) {
		this.audioUrl = audioUrl;
	}

	public Date getAudioUploadTime() {
		return this.audioUploadTime;
	}

	public void setAudioUploadTime(Date audioUploadTime) {
		this.audioUploadTime = audioUploadTime;
	}

	public Integer getPathId() {
		return this.pathId;
	}

	public void setPathId(Integer pathId) {
		this.pathId = pathId;
	}

}