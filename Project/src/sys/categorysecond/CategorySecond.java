package sys.categorysecond;

/**
 * CategorySecond entity. @author MyEclipse Persistence Tools
 */

public class CategorySecond{

	// Fields

	private Integer ctgSecId;
	private String ctgSecName;
	private Integer ctgId;

	// Constructors

	/** default constructor */
	public CategorySecond() {
	}

	/** full constructor */
	public CategorySecond(String ctgSecName, Integer ctgId) {
		this.ctgSecName = ctgSecName;
		this.ctgId = ctgId;
	}

	// Property accessors

	public Integer getCtgSecId() {
		return this.ctgSecId;
	}

	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}

	public String getCtgSecName() {
		return this.ctgSecName;
	}

	public void setCtgSecName(String ctgSecName) {
		this.ctgSecName = ctgSecName;
	}

	public Integer getCtgId() {
		return this.ctgId;
	}

	public void setCtgId(Integer ctgId) {
		this.ctgId = ctgId;
	}

}