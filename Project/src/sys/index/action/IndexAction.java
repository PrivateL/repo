package sys.index.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class IndexAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		return "index";
	}
}
