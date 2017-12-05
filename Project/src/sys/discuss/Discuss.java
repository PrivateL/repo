package sys.discuss;

import java.util.Date;

/**
 * Discuss entity. @author MyEclipse Persistence Tools
 */

public class Discuss {

	// Fields

	private Integer discussId;
	private Integer postId;
	private Integer userId;
	private String discussContent;
	private Date discussCreateTime;

	// Constructors

	/** default constructor */
	public Discuss() {
	}

	/** full constructor */
	public Discuss(Integer postId, Integer userId, String discussContent,
			Date discussCreateTime) {
		this.postId = postId;
		this.userId = userId;
		this.discussContent = discussContent;
		this.discussCreateTime = discussCreateTime;
	}

	// Property accessors

	public Integer getDiscussId() {
		return this.discussId;
	}

	public void setDiscussId(Integer discussId) {
		this.discussId = discussId;
	}

	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getDiscussContent() {
		return this.discussContent;
	}

	public void setDiscussContent(String discussContent) {
		this.discussContent = discussContent;
	}

	public Date getDiscussCreateTime() {
		return this.discussCreateTime;
	}

	public void setDiscussCreateTime(Date discussCreateTime) {
		this.discussCreateTime = discussCreateTime;
	}

}