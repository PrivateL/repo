package sys.account;

/**
 * Account entity. @author MyEclipse Persistence Tools
 */

public class Account {

	// Fields

	private Integer accountId;
	private Integer userId;
	private double accountMoney;

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** full constructor */
	public Account(Integer userId, double accountMoney) {
		this.userId = userId;
		this.accountMoney = accountMoney;
	}

	// Property accessors

	public Integer getAccountId() {
		return this.accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public double getAccountMoney() {
		return this.accountMoney;
	}

	public void setAccountMoney(double accountMoney) {
		this.accountMoney = accountMoney;
	}

}