package springmvc_qch_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.qch.constant.CommonConstant;
import springmvc.qch.pojo.Major;
import springmvc.qch.pojo.Page;
import springmvc.qch.service.MajorService;

@Controller
@RequestMapping("/major")
public class MajorController {
	
	@Autowired
	private MajorService majorService;
	
	public void setMajorService(MajorService majorService) {
		this.majorService = majorService;
	}

	@RequestMapping("list")
	public String showMajorList(Page<Major> page, Model model) throws Exception{
		Page<Major> majorPage = majorService.getOnePage(Major.class, page.getCurrentPage(), CommonConstant.PAGE_SIZE);
		model.addAttribute("majorPage", majorPage);
		return "common/majorList";
	}
	
	@RequestMapping("/add")
	public String majorAdd(Major major,Model model) throws Exception{
		
		return "common/majorAdd";
	}
	
	@RequestMapping("/save")
	public String updateOrSave(Major major, Model model) throws Exception{
		majorService.updateOrSaveEntity(major);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(Major major, Model model) throws Exception{
		majorService.deleteEntity(major);
		return "redirect:list";
	}
	
	
	@RequestMapping("/edit")
	public String edit(@RequestParam String majorId, Model model) throws Exception{
		Major major = majorService.findEntityById(Major.class, Integer.valueOf(majorId));
		model.addAttribute("major", major);
		return "common/majorEdit";
	}

}
