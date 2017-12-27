package sys.userInfo;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserInfoDao extends HibernateDaoSupport{

	public void save(UserInfo userInfo) {
		this.getHibernateTemplate().save(userInfo);
	}

	public UserInfo findById(Integer id) {
		return this.getHibernateTemplate().get(UserInfo.class, id);
	}

	public void update(UserInfo userInfo) {
		this.getHibernateTemplate().update(userInfo);
	}

	public void delete(UserInfo userInfo) {
		this.getHibernateTemplate().delete(userInfo);
	}

	public UserInfo findByUserId(Integer _id) {
		List<UserInfo> list = this.getHibernateTemplate().find("from UserInfo where userId = ?", _id);
		if (list != null && list.size() != 0) {
			return list.get(0);
		}
		return null;
	}
}
