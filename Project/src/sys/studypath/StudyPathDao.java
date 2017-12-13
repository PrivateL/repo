package sys.studypath;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class StudyPathDao extends HibernateDaoSupport{

	public List<StudyPath> findAll() {
		return this.getHibernateTemplate().find("from StudyPath");
	}

	public void save(StudyPath studyPath) {
		this.getHibernateTemplate().save(studyPath);
	}

	public StudyPath findById(Integer pathId) {
		return this.getHibernateTemplate().get(StudyPath.class, pathId);
	}

	public void update(StudyPath studyPath) {
		this.getHibernateTemplate().update(studyPath);
	}

	public void delete(StudyPath studyPath) {
		this.getHibernateTemplate().delete(studyPath);
	}

}
