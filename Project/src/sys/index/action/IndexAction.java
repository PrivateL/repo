package sys.index.action;

import java.util.List;

import sys.audio.ProAudio;
import sys.audio.ProAudioService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class IndexAction extends ActionSupport{
	
	private ProAudioService proAudioService;
	public void setProAudioService(ProAudioService proAudioService) {
		this.proAudioService = proAudioService;
	}


	@Override
	public String execute() throws Exception {
		//热门音频存入值栈
		List<ProAudio> hotAudioList = proAudioService.findHot();
		ActionContext.getContext().getValueStack().set("hotAudioList", hotAudioList);
		return "index";
	}
}
