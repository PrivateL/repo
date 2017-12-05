package sys.order;

import java.util.Date;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order{

	// Fields

	private Integer orderId;
	private double orderTotal;
	private Date orderCreateTime;
	private Integer orderState;
	private Integer userId;
	private String userName;
	private String userAddr;
	private String userPhone;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** full constructor */
	public Order(double orderTotal, Date orderCreateTime, Integer orderState,
			Integer userId, String userName, String userAddr, String userPhone) {
		this.orderTotal = orderTotal;
		this.orderCreateTime = orderCreateTime;
		this.orderState = orderState;
		this.userId = userId;
		this.userName = userName;
		this.userAddr = userAddr;
		this.userPhone = userPhone;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public double getOrderTotal() {
		return this.orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Date getOrderCreateTime() {
		return this.orderCreateTime;
	}

	public void setOrderCreateTime(Date orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public Integer getOrderState() {
		return this.orderState;
	}

	public void setOrderState(Integer orderState) {
		this.orderState = orderState;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserAddr() {
		return this.userAddr;
	}

	public void setUserAddr(String userAddr) {
		this.userAddr = userAddr;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}