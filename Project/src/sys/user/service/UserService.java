package sys.user.service;

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
	public User findByUsername(String username){
		return userDao.findByUsername(username);
	}

	public void save(User user) {
		System.out.println(user.getAddr());
		user.setState(1);//0 未激活 1 已激活
		String code = UUIDUtil.getUUID()+UUIDUtil.getUUID();//64Bytes
		user.setCode(code);
		userDao.save(user);
	}
//=============================================
	public User login(User user) {
		return userDao.login(user);
	}
}
