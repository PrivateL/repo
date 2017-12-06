package sys.admin;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AdminUserAction extends ActionSupport implements ModelDriven<AdminUser>{
	// 模型驱动接收数据使用
	private AdminUser adminUser = new AdminUser();
	// 注入Service
	private AdminUserService adminUserService ;
	public AdminUser getModel() {
		return adminUser;
	}
	
	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}


	/**
	 * 后台登陆的方法:
	 */
	public String login(){
		if(adminUser.getUsername() == "" || adminUser.getPassword() == ""){
			this.addActionError("用户名或密码不能为空!");
			return "error";
		}
		 AdminUser existAdminUser = adminUserService.login(adminUser);
		
		if(existAdminUser == null){
			// 登陆失败
			this.addActionError("用户名或密码错误!");
			return "error";
		}else{
			// 登陆成功
			ServletActionContext.getRequest().getSession().setAttribute("existAdminUser", existAdminUser);
			return "loginSuccess";
		}
	}


}
