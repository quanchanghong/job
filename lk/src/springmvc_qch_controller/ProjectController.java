package springmvc_qch_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.qch.constant.CommonConstant;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.Project;
import springmvc.qch.service.ProjectService;

@Controller
@RequestMapping("/proj")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@RequestMapping("/add")
	public String addProj(Model model){
		return "common/projAdd";
	}
	
	@RequestMapping("/list")
	public String listProj(Page<Project> page,Model model) throws Exception{
		Page<Project> projPage = projectService.getOnePage(Project.class, page.getCurrentPage(), CommonConstant.PAGE_SIZE);
		model.addAttribute("projPage", projPage);
		return "common/projList";
	}

}
