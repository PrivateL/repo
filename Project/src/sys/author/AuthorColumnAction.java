package sys.author;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

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
	
	private AuthorColumnService authorColumnService;
	public void setAuthorColumnService(AuthorColumnService authorColumnService) {
		this.authorColumnService = authorColumnService;
	}

	private Integer ctgSecId;
	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}
	public void setCtgSecId(String ctgSecId){
		System.out.println(ctgSecId);
		this.ctgSecId = Integer.valueOf(ctgSecId);
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
	
	// 作者专栏添加时的分类
	public String addAuthor(){
		List<Category> cList = categoryService.findAll();
		// 压入值栈:
		ActionContext.getContext().getValueStack().set("cList", cList);
		return "addAuthor";
	}
	
	// 储存作者专栏
	public String save(){
		HttpServletRequest request = ServletActionContext.getRequest();
		
		System.out.println(request.getParameter("authorPhoto"));
		Category category = categoryService.findByid(ctgSecId);
		authorColumn.setCategory(category);
		authorColumn.setColumnUploadTime(new Date());
		authorColumn.setColumnWeight(0);
		authorColumnService.save(authorColumn);
		return "saveSuccess";
	}
	
	// 编辑作者专栏
	public String edit(){
		authorColumn = authorColumnService.adminFindById(authorColumn.getAcId());
		List<Category> cList = categoryService.findAll();
		ActionContext.getContext().getValueStack().set("cList", cList);
		return "editSuccess";
	}
	
	// 修改作者专栏
	public String update(){
		//System.out.println(ctgSecId);
		authorColumn.setCategory(categoryService.findByid(ctgSecId));
		authorColumnService.update(authorColumn);
		return "updateSuccess";
	}
	
	// 删除作者专栏
	public String delete(){
		authorColumnService.delete(authorColumn);
		return "deleteSuccess";
	}
	
}
