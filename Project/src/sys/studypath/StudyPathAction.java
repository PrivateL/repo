package sys.studypath;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class StudyPathAction extends ActionSupport implements ModelDriven<StudyPath>{

	private StudyPath studyPath = new StudyPath();
	public StudyPath getModel() {
		return this.studyPath;
	}
	
	private StudyPathService studyPathService;
	public void setStudyPathService(StudyPathService studyPathService) {
		this.studyPathService = studyPathService;
	}
	

}
