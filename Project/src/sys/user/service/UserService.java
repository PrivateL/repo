package sys.user.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import sys.user.dao.UserDao;
import sys.user.entity.User;
import sys.utils.UUIDUtil;

/**
 * 用户模块业务层
 * @author huangkai
 *
 */
@Transactional//继承事务的管理
public class UserService {
	/**
	 * 注入UserDao
	 */
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	/**
	 * 调用Dao中的方法
	 * @param username
	 * @return
	 */
	public User findByEmail(String email){
		return userDao.findByEmail(email);
	}

	public User findByPhone(String phone){
		return userDao.findByPhone(phone);
	}
	
	public void save(User user) throws ParseException {
		user.setState(1);//0 未激活 1 已激活
		String code = UUIDUtil.getUUID()+UUIDUtil.getUUID();//64Bytes
		user.setCode(code);
		//时间问题
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = sdf.parse(sdf.format(new Date()));
		user.setCreate_date(date);
		System.out.println(user.getCreate_date());
		userDao.save(user);
	}
//=============================================
	public User login(User user) {
		return userDao.login(user);
	}

	// 后台查询所有用户
	public List<User> findAll() {
		return userDao.findAll();
	}
}
