package sys.audio;

import java.util.Date;
import java.util.List;

import sys.author.AuthorColumn;
import sys.author.AuthorColumnService;
import sys.category.Category;
import sys.category.CategoryService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProAudioAction  extends ActionSupport implements ModelDriven<ProAudio>{

	// 模型驱动接收数据使用
	private ProAudio proAudio = new ProAudio();
	// 注入Service
	private ProAudioService proAudioService ;
	private CategoryService categoryService;
	private AuthorColumnService authorColumnService;
	
	private Integer page;// 当前页面
	
	private Integer ctgSecId;// 分类Id
	private Integer acId;// 说书人Id
	
	public void setCtgSecId(Integer ctgSecId) {
		this.ctgSecId = ctgSecId;
	}
	public void setAcId(Integer acId) {
		this.acId = acId;
	}


	public void setPage(Integer page) {
		this.page = page;
	}

	public ProAudio getModel() {
		return proAudio;
	}
	
	public void setProAudioService(ProAudioService proAudioService) {
		this.proAudioService = proAudioService;
	}
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public void setAuthorColumnService(AuthorColumnService authorColumnService) {
		this.authorColumnService = authorColumnService;
	}

	// 后台查询所有音频
	public String adminFindAll() {
		sys.utils.PageBean<ProAudio> pageBean = proAudioService.findByPage(page);
		// 将PageBean的数据保存到页面:
		ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "findAll";
	}
	
	// 音频添加时的要查询分类 和 作者专栏
	public String addProAudio(){
		List<Category> cList = categoryService.findAll();
		ActionContext.getContext().getValueStack().set("cList", cList);
		List<AuthorColumn> aList = authorColumnService.findAll();
		ActionContext.getContext().getValueStack().set("aList", aList);
		return "addProAudio";
	}
	
	// 存储音频
	public String save(){
		// System.out.println(ctgSecId+" "+acId);
		proAudio.setCategory(categoryService.findByid(ctgSecId));
		proAudio.setAuthorColumn(authorColumnService.findById(acId));
		proAudio.setAudioUploadTime(new Date());
		proAudio.setAudioWeight(0);
		proAudioService.save(proAudio);
		return "saveSuccess";
	}
	
	// 编辑音频
	public String edit(){
		List<Category> cList = categoryService.findAll();
		List<AuthorColumn> aList = authorColumnService.findAll();
		ActionContext.getContext().getValueStack().set("cList", cList);
		ActionContext.getContext().getValueStack().set("aList", aList);
		proAudio = proAudioService.findById(proAudio.getAudioId());
		return "editSuccess";
	}
	
	// 修改音频
	public String update(){
		Category category = categoryService.findByid(ctgSecId);
		AuthorColumn authorColumn = authorColumnService.findById(acId);
		proAudio.setCategory(category);
		proAudio.setAuthorColumn(authorColumn);
		proAudioService.update(proAudio);
		return "updateSuccess";
	}
	
	// 删除音频
	public String delete(){
		proAudio = proAudioService.findById(proAudio.getAudioId());
		proAudioService.delete(proAudio);
		return "deleteSuccess";
	}
}
