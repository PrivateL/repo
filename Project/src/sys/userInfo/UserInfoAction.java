package sys.userInfo;

import sys.user.entity.User;
import sys.user.service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserInfoAction extends ActionSupport implements ModelDriven<UserInfo>{

	private UserInfo userInfo = new UserInfo();
	public UserInfo getModel() {
		return userInfo;
	}
	
	private UserInfoService userInfoService;
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	private String username;
	public void setUsername(String username) {
		this.username = username;
	}
	
	private Integer _id;
	public void set_id(Integer _id) {
		this._id = _id;
	}
	
	private Integer userId;
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	// 显示某个用户详情
	public String show(){
		userInfo = userInfoService.findByUserId(_id);
		User user = userService.findById(_id);
		ActionContext.getContext().getValueStack().set("username", user.getUsername());
		return "showSuccess";
	}

	// 进入添加用户详情界面
	public String add(){
		//System.out.println(username);
		//ActionContext.getContext().getValueStack().set("username", username);
		return "addSuccess";
	}
	
	// 存储用户详情
	public String save(){
		User user = (User) ActionContext.getContext().getSession().get("user");
		userInfo.setUserId(user.getId());
		userInfo.setPhone(user.getPhone());
		userInfoService.save(userInfo);
		
		return "saveSuccess";
	}
	
	// 编辑用户详情
	public String edit(){
		Integer _id = (Integer) ActionContext.getContext().getSession().get("userId");
		userInfo = userInfoService.findByUserId(_id);
		
		return "editSuccess";
	}
	
	// 修改用户详情
	public String update(){
		System.out.println(userInfo.getUserId());
		
		userInfoService.update(userInfo);
		return "updateSuccess";
	}
	
}
