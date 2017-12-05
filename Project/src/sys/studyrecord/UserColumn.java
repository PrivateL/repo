package sys.studyrecord;

/**
 * UserColumn entity. @author MyEclipse Persistence Tools
 */

public class UserColumn{

	// Fields

	private Integer ucId;
	private Integer userId;
	private Integer columnId;

	// Constructors

	/** default constructor */
	public UserColumn() {
	}

	/** full constructor */
	public UserColumn(Integer userId, Integer columnId) {
		this.userId = userId;
		this.columnId = columnId;
	}

	// Property accessors

	public Integer getUcId() {
		return this.ucId;
	}

	public void setUcId(Integer ucId) {
		this.ucId = ucId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getColumnId() {
		return this.columnId;
	}

	public void setColumnId(Integer columnId) {
		this.columnId = columnId;
	}

}