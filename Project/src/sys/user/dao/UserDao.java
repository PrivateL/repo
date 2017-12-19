package sys.user.dao;

import java.util.List;
import java.util.regex.Pattern;

import sys.user.entity.User;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 用户模块持久层
 * @author huangkai
 *
 */
public class UserDao extends HibernateDaoSupport{//HibernateDaoSupport提供模板
	
	Logger logger = Logger.getLogger(UserDao.class);
	
	/**
	 * 按邮箱查询是否有用户
	 * @param username
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public User findByEmail(String email){
		String hql = "from User where email = ?";
		List<User> list = this.getHibernateTemplate().find(hql, email);
		
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	/**
	 * 按电话查用户
	 * @param phone
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public User findByPhone(String phone){
		String hql = "from User where phone = ?";
		List<User> list = this.getHibernateTemplate().find(hql, phone);
		
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	/**
	 * 用户注册数据存入数据库
	 * @param user
	 */
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}
	
	//====================================
	@SuppressWarnings("unchecked")
	public User login(User user) {//电话或邮箱登录
		logger.info(user.getEmail()+";"+user.getPassword());
		boolean isEmail = Pattern.matches("^[a-z0-9A-Z]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$", user.getEmail());
		logger.info(isEmail);
		String hql = "from User where email = ? and password = ?";
		if(!isEmail){//不是邮箱即为电话
			hql = "from User where phone = ? and password = ?";
		}
		List<User> list = this.getHibernateTemplate().find(hql, user.getEmail(),user.getPassword());
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	
	// 后台查询所有用户
	public List<User> findAll() {
		return this.getHibernateTemplate().find("from User");
	}

}
