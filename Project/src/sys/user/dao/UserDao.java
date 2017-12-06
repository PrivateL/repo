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
	public User findByUsername(String email){
		String hql = "from User where email = ?";
		List<User> list = this.getHibernateTemplate().find(hql, email);
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
		System.out.println(user.getEmail()+";"+user.getPassword());
		String hql = "from User where email = ? and password = ?";
		List<User> list = this.getHibernateTemplate().find(hql, user.getEmail(),user.getPassword());
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}

}
