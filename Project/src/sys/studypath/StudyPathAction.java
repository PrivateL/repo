package sys.studypath;

import java.util.Date;
import java.util.List;

import sys.category.Category;
import sys.category.CategoryService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudyPathAction extends ActionSupport implements ModelDriven<StudyPath>{

	private StudyPath studyPath = new StudyPath();
	public StudyPath getModel() {
		return this.studyPath;
	}
	
	private StudyPathService studyPathService;
	public void setStudyPathService(StudyPathService studyPathService) {
		this.studyPathService = studyPathService;
	}
	
	private CategoryService categoryService;
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	private Integer ctgSecId;
	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}
	public void setCtgSecId(String ctgSecId) {
		this.ctgSecId = Integer.valueOf(ctgSecId);
	}

	public String adminFindAll(){
		List<StudyPath> sList = studyPathService.findAll();
		ActionContext.getContext().getValueStack().set("sList", sList);
		return "findAll";
	}
	
	// 添加学习路径
	public String add(){
		List<Category> cList = categoryService.findAll();
		ActionContext.getContext().getValueStack().set("cList", cList);
		return "addSuccess";
	}
	
	// 存储学习路径
	public String save(){
		Category category = categoryService.findByid(ctgSecId);
		studyPath.setCategory(category);
		studyPath.setPathCreateTime(new Date());
		studyPath.setPathWeight(0);
		studyPathService.save(studyPath);
		return "saveSuccess";
	}
	
	// 编辑学习路径
	public String edit(){
		List<Category> cList = categoryService.findAll();
		ActionContext.getContext().getValueStack().set("cList", cList);
		studyPath = studyPathService.findById(studyPath.getPathId());
		return "editSuccess";
	}
	
	// 修改学习路径
	public String update(){
		studyPath.setCategory(categoryService.findByid(ctgSecId));
		studyPathService.update(studyPath);
		//System.out.println("sss");
		return "updateSuccess";
	}
	
	// 删除学习路径
	public String delete(){
		studyPathService.delete(studyPathService.findById(studyPath.getPathId()));
		return "deleteSuccess";
	}

}
