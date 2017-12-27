package sys.user.dao;

import java.util.List;
import java.util.regex.Pattern;

import sys.audio.ProAudio;
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
	
	// 后台储存用户
	public void adminSave(User user) {
		this.getHibernateTemplate().save(user);
	}
	
	// 根据id查找
	public User findById(Integer id) {
		return this.getHibernateTemplate().get(User.class, id);
	}
	
	// 根据用户名查找
	public User findByUsername(String username) {
		String hql = "from User where username = ?";
		List<User> list = this.getHibernateTemplate().find(hql, username);
		if(list != null && list.size() > 0)
			return list.get(0);
		else
			return null;
	}
	public void update(User user) {
		this.getHibernateTemplate().update(user);
	}
	public void delete(User user) {
		this.getHibernateTemplate().delete(user);
	}
	// 查询用户数量
	public Integer findCount() {
		List<Long> list = this.getHibernateTemplate().find("select count(*) from User ");
		return list.get(0).intValue();
	}
	// 根据页面查询用户
	public List<ProAudio> findByPage(Integer begin, Integer limit) {
		String hql = "from User order by create_date desc";
		List<ProAudio> list = this.getHibernateTemplate().executeFind(new sys.utils.PageHibernateCallback<ProAudio>(hql, null, begin, limit));
		return list;
	}


}
