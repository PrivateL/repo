package sys.studyrecord;

/**
 * UserAudio entity. @author MyEclipse Persistence Tools
 */

public class UserAudio {

	// Fields

	private Integer uaId;
	private Integer userId;
	private Integer audioId;

	// Constructors

	/** default constructor */
	public UserAudio() {
	}

	/** full constructor */
	public UserAudio(Integer userId, Integer audioId) {
		this.userId = userId;
		this.audioId = audioId;
	}

	// Property accessors

	public Integer getUaId() {
		return this.uaId;
	}

	public void setUaId(Integer uaId) {
		this.uaId = uaId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAudioId() {
		return this.audioId;
	}

	public void setAudioId(Integer audioId) {
		this.audioId = audioId;
	}

}