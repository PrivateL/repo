package sys.audio;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class ProAudioDao extends HibernateDaoSupport{

	public String adminFindAll(){
		return null;
	}

	// 查询所有音频
	public Integer findCount() {
		List<Long> list = this.getHibernateTemplate().find("select count(*) from ProAudio ");
		return list.get(0).intValue();
	}

	// 根据页面查询音频
	public List<ProAudio> findByPage(Integer begin, Integer limit) {
		String hql = "from ProAudio order by audioUploadTime desc";
		List<ProAudio> list = this.getHibernateTemplate().executeFind(new sys.utils.PageHibernateCallback<ProAudio>(hql, null, begin, limit));
		return list;
	}

	public void save(ProAudio proAudio) {
		this.getHibernateTemplate().save(proAudio);
	}

	public ProAudio findById(Integer audioId) {
		return this.getHibernateTemplate().get(ProAudio.class, audioId);
	}

	public void update(ProAudio proAudio) {
		this.getHibernateTemplate().update(proAudio);
	}

	public void delete(ProAudio proAudio) {
		this.getHibernateTemplate().delete(proAudio);
	}
}
