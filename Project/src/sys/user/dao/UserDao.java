package sys.user.dao;

import java.util.List;

import sys.user.entity.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * 用户模块持久层
 * @author huangkai
 *
 */
public class UserDao extends HibernateDaoSupport{//HibernateDaoSupport提供模板
	
	/**
	 * 按名称查询是否有用户
	 * @param username
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public User findByUsername(String username){
		String hql = "from User where username = ?";
		List<User> list = this.getHibernateTemplate().find(hql, username);
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
	public User login(User user) {
		String hql = "from User where username = ? and password = ? and state = ?";
		List<User> list = this.getHibernateTemplate().find(hql, user.getUsername(),user.getPassword(),1);
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}

}
