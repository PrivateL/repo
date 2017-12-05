package sys.coupon;

import java.util.Date;

/**
 * Coupon entity. @author MyEclipse Persistence Tools
 */

public class Coupon{

	// Fields

	private Integer couponId;
	private String couponName;
	private String couponDesc;
	private Date couponStartTime;
	private Date couponEndTime;

	// Constructors

	/** default constructor */
	public Coupon() {
	}

	/** full constructor */
	public Coupon(String couponName, String couponDesc, Date couponStartTime,
			Date couponEndTime) {
		this.couponName = couponName;
		this.couponDesc = couponDesc;
		this.couponStartTime = couponStartTime;
		this.couponEndTime = couponEndTime;
	}

	// Property accessors

	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String getCouponName() {
		return this.couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponDesc() {
		return this.couponDesc;
	}

	public void setCouponDesc(String couponDesc) {
		this.couponDesc = couponDesc;
	}

	public Date getCouponStartTime() {
		return this.couponStartTime;
	}

	public void setCouponStartTime(Date couponStartTime) {
		this.couponStartTime = couponStartTime;
	}

	public Date getCouponEndTime() {
		return this.couponEndTime;
	}

	public void setCouponEndTime(Date couponEndTime) {
		this.couponEndTime = couponEndTime;
	}

}