package sys.audio;

import java.util.List;

import sys.admin.AdminUserDao;
import sys.utils.PageBean;

public class ProAudioService {

	private ProAudioDao proAudiorDao;
		
	public void setProAudioDao(ProAudioDao proAudiorDao) {
		this.proAudiorDao = proAudiorDao;
	}
	
	public String adminFindAll(){
		return null;
	}

	
	// 根据页面查询所有音频
		public PageBean<ProAudio> findByPage(Integer page) {
			PageBean<ProAudio> pageBean = new PageBean<ProAudio>();
			// 封装分页类的数据:
			// 设置当前页数
			pageBean.setPage(page);
			// 设置每页显示的记录数:
			Integer limit = 10;
			pageBean.setLimit(limit);
			// 设置总记录数:
			Integer totalCount = proAudiorDao.findCount();
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
			List<ProAudio> list = proAudiorDao.findByPage(begin,limit);
			pageBean.setList(list);
			return pageBean;
		}
		
		//热门音频
		public List<ProAudio> findHot(){
			return proAudiorDao.findHot();
		}
}
