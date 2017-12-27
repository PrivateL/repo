package sys.user.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import sys.audio.ProAudio;
import sys.user.dao.UserDao;
import sys.user.entity.User;
import sys.utils.PageBean;
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
	
	// 根据id查找用户
	public User findById(Integer id){
		return userDao.findById(id);
	}

	// 后台查询所有用户
	public List<User> findAll() {
		return userDao.findAll();
	}

	// 后台存储用户
	public void adminSave(User user) {
		userDao.adminSave(user);
	}

	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

	public void update(User user) {
		userDao.update(user);
	}

	public void delete(User user) {
		userDao.delete(user);
	}

	// 根据页面查询所有用户
	public PageBean<ProAudio> findByPage(Integer page) {
		PageBean<ProAudio> pageBean = new PageBean<ProAudio>();
		// 封装分页类的数据:
		// 设置当前页数
		pageBean.setPage(page);
		// 设置每页显示的记录数:
		Integer limit = 10;
		pageBean.setLimit(limit);
		// 设置总记录数:
		Integer totalCount = userDao.findCount();
		pageBean.setTotalCount(totalCount);
		// 设置总页数:
		Integer totalPage = 0;
		if(totalCount % limit == 0){
			totalPage = totalCount / limit;
		}else{
			totalPage = totalCount / limit+1;
		}
		pageBean.setTotalPage(totalPage);
		// 设置每页显示的数据:
		Integer begin = (page - 1) * limit;
		List<ProAudio> list = userDao.findByPage(begin,limit);
		pageBean.setList(list);
		return pageBean;
	}
}
