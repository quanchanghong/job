package springmvc_qch_controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.qch.constant.CommonConstant;
import springmvc.qch.pojo.Major;
import springmvc.qch.pojo.MajorSys;
import springmvc.qch.pojo.Page;
import springmvc.qch.service.MajorSysService;

@Controller
@RequestMapping("/majorSys")
public class MajorSysController {
	
	@Autowired
	private MajorSysService majorSysService;
	
	@RequestMapping("/list")
	public String showMajorSys(Page<MajorSys> page, Model model) throws Exception{
		Page<MajorSys> majorSysPage = majorSysService.getOnePage(MajorSys.class, page.getCurrentPage(), CommonConstant.PAGE_SIZE);
		model.addAttribute("majorSysPage", majorSysPage);
		return "common/majorSysList";
	}
	
	@RequestMapping("/add")
	public String add(Model model) throws Exception{
		List<Major> majorList = majorSysService.getAllEntitys(Major.class);
		model.addAttribute("majorList", majorList);
		//System.out.println(majorList);
		return "common/majorSysAdd";
	}
	
	@RequestMapping("/save")
	public String saveOrUpdate(MajorSys majorSys, Model model) throws Exception{
		majorSysService.updateOrSaveEntity(majorSys);
		return "redirect:list";
	}
	
	@RequestMapping("/edit")
	public String edit(@RequestParam String majorSysId, Model model) throws Exception{
		Map<String, Object> majorSysEditMap = majorSysService.getMajorSysEditMap(Integer.valueOf(majorSysId));
		model.addAttribute("majorSysEditMap", majorSysEditMap);
		System.out.println(majorSysEditMap);
		return "common/majorSysEdit";
	}
	
	@RequestMapping("/delete")
	public String delete(MajorSys majorSys, Model model) throws Exception{
		majorSysService.deleteEntity(majorSys);
		return "redirect:list";
	}

}
