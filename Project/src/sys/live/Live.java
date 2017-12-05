package sys.live;

import java.util.Date;

/**
 * Live entity. @author MyEclipse Persistence Tools
 */

public class Live {

	// Fields

	private Integer liveId;
	private String liveName;
	private String liveAnchor;
	private String liveDesc;
	private String liveImage;
	private Date liveCreateTime;
	private Integer liveWeight;

	// Constructors

	/** default constructor */
	public Live() {
	}

	/** full constructor */
	public Live(String liveName, String liveAnchor, String liveDesc,
			String liveImage, Date liveCreateTime, Integer liveWeight) {
		this.liveName = liveName;
		this.liveAnchor = liveAnchor;
		this.liveDesc = liveDesc;
		this.liveImage = liveImage;
		this.liveCreateTime = liveCreateTime;
		this.liveWeight = liveWeight;
	}

	// Property accessors

	public Integer getLiveId() {
		return this.liveId;
	}

	public void setLiveId(Integer liveId) {
		this.liveId = liveId;
	}

	public String getLiveName() {
		return this.liveName;
	}

	public void setLiveName(String liveName) {
		this.liveName = liveName;
	}

	public String getLiveAnchor() {
		return this.liveAnchor;
	}

	public void setLiveAnchor(String liveAnchor) {
		this.liveAnchor = liveAnchor;
	}

	public String getLiveDesc() {
		return this.liveDesc;
	}

	public void setLiveDesc(String liveDesc) {
		this.liveDesc = liveDesc;
	}

	public String getLiveImage() {
		return this.liveImage;
	}

	public void setLiveImage(String liveImage) {
		this.liveImage = liveImage;
	}

	public Date getLiveCreateTime() {
		return this.liveCreateTime;
	}

	public void setLiveCreateTime(Date liveCreateTime) {
		this.liveCreateTime = liveCreateTime;
	}

	public Integer getLiveWeight() {
		return this.liveWeight;
	}

	public void setLiveWeight(Integer liveWeight) {
		this.liveWeight = liveWeight;
	}

}