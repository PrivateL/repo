package sys.audio;

import java.util.Date;

/**
 * ProAudio entity. @author MyEclipse Persistence Tools
 */

public class ProAudio{

	// Fields

	private Integer audioId;
	private String audioName;
	private Integer ctgSecId;
	private String authorId;
	private String audioDesc;
	private String audioLong;
	private Integer audioWeight;
	private String audioImage;
	private String audioUrl;
	private Date audioUploadTime;
	private Integer pathId;

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