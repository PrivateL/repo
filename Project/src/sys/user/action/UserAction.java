package sys.user.action;

import java.io.IOException;

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
	private String checkCode;

	public void setCheckcode(String checkCode) {
		this.checkCode = checkCode;
	}

	// 注入用户的Service
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * 注册页面
	 */
	public String registPage() {
		return "registPage";
	}

	/**
	 * 异步校验用户名
	 * 
	 * @throws IOException
	 */
	public String findByUsername() throws IOException {
		// 调用service进行查询
		User existUser = userService.findByUsername(user.getUsername());// 返回数据库中存在的User对象
		// 获得response对象，设置编码，并向页面输出
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");
		// 判断
		if (user.getUsername() != null && !user.getUsername().trim().equals("")) {
			// 已存在
			if (existUser != null) {
				ServletActionContext.getRequest().getSession()
						.setAttribute("access", "false");
				response.getWriter().println("<font color='red'>用户名已存在</font>");
			} else {// 不存在，用户名可以使用
				ServletActionContext.getRequest().getSession()
						.setAttribute("access", "true");
				response.getWriter().println(
						"<font color='green'>用户名可以使用</font>");
			}
		} else {
			ServletActionContext.getRequest().getSession()
					.setAttribute("access", "false");
			response.getWriter().println("<font color='red'>用户名不能为空</font>");
			logger.info("用户名不能为空");
		}
		return NONE;
	}

	/**
	 * 注册
	 */
	public String regist() {
		// 用户名已存在
		if (((String) ServletActionContext.getRequest().getSession()
				.getAttribute("access")).equals("false")) {
			this.addActionError("用户名已存在");
			return "registPage";
		}
		// 判断验证码
		// 从session中获取正确的验证码
		String checkcode_1 = (String) ServletActionContext.getRequest()
				.getSession().getAttribute("checkcode");
		if (!checkCode.equalsIgnoreCase(checkcode_1)) {
			this.addActionError("验证码错误");
			return "registPage";
		}

		userService.save(user);
		return "registSuccess";
	}

	// ==========================================
	/**
	 * 登录页面
	 */
	public String loginPage() {
		return "loginPage";
	}

	/**
	 * 登录
	 */
	public String login() {
		User existUser = userService.login(user);
		if (existUser == null) {
			// 登录失败
			this.addActionError("登录失败，密码或用户名错误");
			return "loginPage";
		} else {
			// 登录成功
			// 将用户信息存入session中
			ServletActionContext.getRequest().getSession()
					.setAttribute("existUser", existUser);
			// 页面跳转
			return "loginSuccess";
		}
	}

	// ===========================
	/**
	 * 退出
	 */
	public String quit() {
		// 销毁session
		ServletActionContext.getRequest().getSession().invalidate();
		return "quit";
	}
}
