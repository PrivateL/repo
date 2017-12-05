package sys.order;

/**
 * OrderItem entity. @author MyEclipse Persistence Tools
 */

public class OrderItem{

	// Fields

	private Integer itemId;
	private Integer orderId;
	private Integer productId;
	private String productNum;
	private String itemTotal;

	// Constructors

	/** default constructor */
	public OrderItem() {
	}

	/** full constructor */
	public OrderItem(Integer orderId, Integer productId, String productNum,
			String itemTotal) {
		this.orderId = orderId;
		this.productId = productId;
		this.productNum = productNum;
		this.itemTotal = itemTotal;
	}

	// Property accessors

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductNum() {
		return this.productNum;
	}

	public void setProductNum(String productNum) {
		this.productNum = productNum;
	}

	public String getItemTotal() {
		return this.itemTotal;
	}

	public void setItemTotal(String itemTotal) {
		this.itemTotal = itemTotal;
	}

}