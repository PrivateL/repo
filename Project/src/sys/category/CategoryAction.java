package sys.category;

import java.util.List;

import sys.audio.ProAudio;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CategoryAction extends ActionSupport implements ModelDriven<Category>{

	private Category category = new Category();
	public Category getModel() {
		return category;
	}
	
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	// 查询所有一级分类
	public String adminFindAll(){
		List<Category> cList = categoryService.findAll();
		// 压入值栈:
		ActionContext.getContext().getValueStack().set("cList", cList);
		return "findAll";
	}

	// 添加存储一级分类
	public String save(){
		categoryService.save(category);
		return "saveSuccess";
	}
	
	// 编辑一级分类
	public String edit(){
		category = categoryService.findByid(category.getCtgId());
		return "editSuccess";
	}
	
	// 修改一级分类
	public String update(){
		categoryService.update(category);
		return "updateSuccess";
	}
	
	// 删除一级分类
	public String delete(){
		categoryService.delete(category);
		return "deleteSuccess";
	}
}
