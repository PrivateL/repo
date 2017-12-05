package sys.studyrecord;

/**
 * UserEbook entity. @author MyEclipse Persistence Tools
 */

public class UserEbook{

	// Fields

	private Integer ueId;
	private Integer userId;
	private Integer ebookId;

	// Constructors

	/** default constructor */
	public UserEbook() {
	}

	/** full constructor */
	public UserEbook(Integer userId, Integer ebookId) {
		this.userId = userId;
		this.ebookId = ebookId;
	}

	// Property accessors

	public Integer getUeId() {
		return this.ueId;
	}

	public void setUeId(Integer ueId) {
		this.ueId = ueId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getEbookId() {
		return this.ebookId;
	}

	public void setEbookId(Integer ebookId) {
		this.ebookId = ebookId;
	}

}