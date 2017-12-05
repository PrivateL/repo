package sys.audio;

import java.util.Date;

/**
 * ProAudio entity. @author MyEclipse Persistence Tools
 */
// 音频
public class ProAudio{

	// Fields

	private Integer audioId;
	private String audioName;// 标题或对应的书名
	private Integer ctgSecId;// 所属二级分类的id
	private String authorId;// 作者
	private String audioDesc;// 音频描述
	private String audioLong;// 时长
	private Integer audioWeight;// 权值，衡量是否最受欢迎或计算点击量等
	private String audioImage;// 封面图片地址
	private String audioUrl;// 音频存放地址
	private Date audioUploadTime;// 音频的上传时间
	private Integer pathId;// 所属学习路径的id

	// Constructors

	/** default constructor */
	public ProAudio() {
	}

	/** minimal constructor */
	public ProAudio(String authorId, String audioDesc) {
		this.authorId = authorId;
		this.audioDesc = audioDesc;
	}

	/** full constructor */
	public ProAudio(String audioName, Integer ctgSecId, String authorId,
			String audioDesc, String audioLong, Integer audioWeight,
			String audioImage, String audioUrl, Date audioUploadTime,
			Integer pathId) {
		this.audioName = audioName;
		this.ctgSecId = ctgSecId;
		this.authorId = authorId;
		this.audioDesc = audioDesc;
		this.audioLong = audioLong;
		this.audioWeight = audioWeight;
		this.audioImage = audioImage;
		this.audioUrl = audioUrl;
		this.audioUploadTime = audioUploadTime;
		this.pathId = pathId;
	}

	// Property accessors

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

	public Integer getCtgSecId() {
		return this.ctgSecId;
	}

	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}

	public String getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
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