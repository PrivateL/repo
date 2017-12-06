package sys.audio;

import sys.admin.AdminUser;
import sys.admin.AdminUserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProAudioAction  extends ActionSupport implements ModelDriven<ProAudio>{

	// 模型驱动接收数据使用
	private ProAudio proAudio = new ProAudio();
	// 注入Service
	private ProAudioService proAudioService ;
	
	private Integer page;// 当前页面
	
	
	public void setPage(Integer page) {
		this.page = page;
	}

	public ProAudio getModel() {
		return proAudio;
	}
	
	public void setProAudioService(ProAudioService proAudioService) {
		this.proAudioService = proAudioService;
	}
	
	
	// 后台查询所有音频
	public String adminFindAll() {
		sys.utils.PageBean<ProAudio> pageBean = proAudioService.findByPage(page);
		// 将PageBean的数据保存到页面:
		ActionContext.getContext().getValueStack().set("pageBean", pageBean);
		return "findAll";
	}
	
	// 跳转到添加音频页面
	public String addPage(){
		
		
		return "addPageSuccess";
	}
}
