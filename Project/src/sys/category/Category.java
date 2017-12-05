package sys.category;

/**
 * 一级分类
 * @author huangkai
 *
 */
public class Category{

	private Integer ctgId;
	private String ctgName;

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** full constructor */
	public Category(String ctgName) {
		this.ctgName = ctgName;
	}

	// Property accessors

	public Integer getCtgId() {
		return this.ctgId;
	}

	public void setCtgId(Integer ctgId) {
		this.ctgId = ctgId;
	}

	public String getCtgName() {
		return this.ctgName;
	}

	public void setCtgName(String ctgName) {
		this.ctgName = ctgName;
	}

}