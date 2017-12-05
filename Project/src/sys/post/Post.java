package sys.post;

import java.util.Date;

/**
 * Post entity. @author MyEclipse Persistence Tools
 */

public class Post {

	// Fields

	private Integer postId;
	private Integer userId;
	private String postContent;
	private Date postCreateTime;
	private double postWeight;
	private Integer postDiscussNum;

	// Constructors

	/** default constructor */
	public Post() {
	}

	/** full constructor */
	public Post(Integer userId, String postContent, Date postCreateTime,
			double postWeight, Integer postDiscussNum) {
		this.userId = userId;
		this.postContent = postContent;
		this.postCreateTime = postCreateTime;
		this.postWeight = postWeight;
		this.postDiscussNum = postDiscussNum;
	}

	// Property accessors

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

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public Date getPostCreateTime() {
		return this.postCreateTime;
	}

	public void setPostCreateTime(Date postCreateTime) {
		this.postCreateTime = postCreateTime;
	}

	public double getPostWeight() {
		return this.postWeight;
	}

	public void setPostWeight(double postWeight) {
		this.postWeight = postWeight;
	}

	public Integer getPostDiscussNum() {
		return this.postDiscussNum;
	}

	public void setPostDiscussNum(Integer postDiscussNum) {
		this.postDiscussNum = postDiscussNum;
	}

}