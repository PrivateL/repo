package sys.studypath;

import java.util.List;

public class StudyPathService {

	private StudyPathDao studyPathDao;

	public void setStudyPathDao(StudyPathDao studyPathDao) {
		this.studyPathDao = studyPathDao;
	}

	public List<StudyPath> findAll() {
		return studyPathDao.findAll();
	}

	public void save(StudyPath studyPath) {
		studyPathDao.save(studyPath);
	}

	public StudyPath findById(Integer pathId) {
		return studyPathDao.findById(pathId);
	}

	public void update(StudyPath studyPath) {
		studyPathDao.update(studyPath);
	}

	public void delete(StudyPath studyPath) {
		studyPathDao.delete(studyPath);
	}
	
}
