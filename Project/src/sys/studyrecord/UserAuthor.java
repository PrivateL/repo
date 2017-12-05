package sys.studyrecord;

/**
 * UserAuthor entity. @author MyEclipse Persistence Tools
 */

public class UserAuthor{

	// Fields

	private Integer uaId;
	private Integer userId;
	private Integer authorId;

	// Constructors

	/** default constructor */
	public UserAuthor() {
	}

	/** full constructor */
	public UserAuthor(Integer userId, Integer authorId) {
		this.userId = userId;
		this.authorId = authorId;
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

	public Integer getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}

}