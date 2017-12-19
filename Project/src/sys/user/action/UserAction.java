package sys.user.action;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;

import sys.user.entity.User;
import sys.user.service.UserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 用户模块Action类
 * 
 * @author huangkai
 * 
 */
@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User> {
	// 记录日志
	Logger logger = Logger.getLogger(UserAction.class);

	// 模型驱动使用的对象
	private User user = new User();

	public User getModel() {
		return user;// 可以获取到页面的数据
	}

	/**
	 * 接收验证码
	 */
	/*private String checkCode;

	public void setCheckcode(String checkCode) {
		this.checkCode = checkCode;
	}*/

	// 注入用户的Service
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 注册页面
	 */
	public String registerPage() {
		logger.info("run registerPage() methon");
		return "registPage";
	}

	/**
	 * 注册
	 * @throws ParseException 
	 */
	public String register() throws ParseException{
		logger.info("run register() methon");
		logger.info(user.getEmail()+";"+user.getUsername());
		// 该邮箱或手机号已注册
		if (((String) ServletActionContext.getRequest().getSession()
				.getAttribute("access")).equals("false")) {
			this.addActionError("该邮箱或手机号已注册");
			return "registPage";
		}
		// 判断验证码
		// 从session中获取正确的验证码
		/*String checkcode_1 = (String) ServletActionContext.getRequest()
				.getSession().getAttribute("checkcode");
		if (!checkCode.equalsIgnoreCase(checkcode_1)) {
			this.addActionError("验证码错误");
			return "registPage";
		}*/
		userService.save(user);
		return "registSuccess";
	}

	// ==========================================
	/**
	 * 登录页面
	 */
	public String loginPage() {
		logger.info("run loginPage() methon");
		return "loginPage";
	}

	/**
	 * 登录
	 */
	public String login() {
		logger.info("run login() methon");
		User existUser = userService.login(user);
		if (existUser == null) {
			// 用户不存在
			this.addActionError("密码或用户名错误");
			return "loginPage";
		} else {// 用户存在
			//已激活
			if(existUser.getState()==1){
				// 将用户信息存入session中
				ServletActionContext.getRequest().getSession()
						.setAttribute("existUser", existUser);
				// 页面跳转
				return "loginSuccess";
			}else{
				//未激活
				this.addActionError("该用户未激活");
				return "loginPage";
			}
			
		}
	}
	
	/**
	 * 异步校验邮箱、手机号
	 * 
	 * @throws IOException
	 */
	public String findByEmail() throws IOException {
		logger.info("run findByEmail() methon");
		// 调用service进行查询
		User existUser = userService.findByEmail(user.getEmail());// 返回数据库中存在的User对象
		// 获得response对象，设置编码，并向页面输出
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		// 判断
		if (user.getEmail() != null && !user.getEmail().trim().equals("")) {
			// 已存在
			if (existUser != null) {
				ServletActionContext.getRequest().getSession()
						.setAttribute("access", "false");
				response.getWriter().println("<font color='red'>邮箱已使用</font>");
			} else {// 不存在，邮箱可以使用
				ServletActionContext.getRequest().getSession()
						.setAttribute("access", "true");
				response.getWriter().println(""
				/* "<font color='green'>邮箱可用</font>" */);
			}
		} else {
			ServletActionContext.getRequest().getSession()
					.setAttribute("access", "false");
			response.getWriter().println("<font color='red'>邮箱不能为空</font>");
			logger.info("邮箱不能为空");
		}
		return NONE;
	}
	
	public String findByPhone() throws IOException {
		logger.info("run findByPhone() methon");
		// 调用service进行查询
		User existUser = userService.findByPhone(user.getPhone());// 返回数据库中存在的User对象
		// 获得response对象，设置编码，并向页面输出
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		// 判断
		if (user.getPhone() != null && !user.getPhone().trim().equals("")) {
			// 已存在
			if (existUser != null) {
				ServletActionContext.getRequest().getSession()
						.setAttribute("access", "false");
				response.getWriter().println("<font color='red'>手机号已使用</font>");
			} else {// 不存在，邮箱可以使用
				ServletActionContext.getRequest().getSession()
						.setAttribute("access", "true");
				response.getWriter().println(""
						/*"<font color='green'>手机号可用</font>"*/);
			}
		} else {
			ServletActionContext.getRequest().getSession()
					.setAttribute("access", "false");
			response.getWriter().println("<font color='red'>手机号不能为空</font>");
			logger.info("手机号不能为空");
		}
		return NONE;
	}

	// ===========================
	/**
	 * 退出
	 */
	public String quit() {
		logger.info("run quit() methon");
		// 销毁session
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
	
	
	// 后台查找所有用户
	public String adminFindAll(){
		List<User> uList = userService.findAll();
		return "findAll";
	}
}
