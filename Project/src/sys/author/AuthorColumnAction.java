package sys.author;

import java.util.Date;
import java.util.List;

import sys.category.Category;
import sys.category.CategoryService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AuthorColumnAction extends ActionSupport implements ModelDriven<AuthorColumn>{

	private AuthorColumn authorColumn = new AuthorColumn();
	public AuthorColumn getModel() {
		return authorColumn;
	}
	
	AuthorColumnService authorColumnService;
	public void setAuthorColumnService(AuthorColumnService authorColumnService) {
		this.authorColumnService = authorColumnService;
	}

	private Integer ctgSecId;
	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}


	CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	// 查询所有作者专栏
	public String adminFindAll(){
		List<AuthorColumn> authorList = authorColumnService.findAll();
		// 压入值栈:
		ActionContext.getContext().getValueStack().set("authorList", authorList);
		return "findAll";
	}
	
	// 储存作者专栏
	public String save(){
		System.out.println(ctgSecId);
		Category category = categoryService.findByid(ctgSecId);
		authorColumn.setCategory(category);
		authorColumn.setColumnUploadTime(new Date());
		authorColumn.setColumnWeight(0);
		authorColumnService.save(authorColumn);
		return "saveSuccess";
	}
	
}
