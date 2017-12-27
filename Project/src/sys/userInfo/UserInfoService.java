package sys.userInfo;

public class UserInfoService {

	private UserInfoDao userInfoDao;
	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}


	public void save(UserInfo userInfo) {
		userInfoDao.save(userInfo);
	}


	/*public UserInfo findById(Integer id) {
		return userInfoDao.findById(id);
	}*/


	public void update(UserInfo userInfo) {
		userInfoDao.update(userInfo);
	}


	public void delete(UserInfo userInfo) {
		userInfoDao.delete(userInfo);
	}


	public UserInfo findByUserId(Integer _id) {
		return userInfoDao.findByUserId(_id);
	}
}
