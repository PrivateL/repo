package sys.category;

/**
 * 分类
 * @author huangkai
 *
 */
public class Category{

	private Integer ctgSecId;
	private String ctgName;

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** full constructor */
	public Category(String ctgName) {
		this.ctgName = ctgName;
	}

	
	public Integer getCtgSecId() {
		return ctgSecId;
	}

	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}

	public String getCtgName() {
		return this.ctgName;
	}

	public void setCtgName(String ctgName) {
		this.ctgName = ctgName;
	}

}