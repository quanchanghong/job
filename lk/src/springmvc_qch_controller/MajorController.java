package springmvc_qch_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping("")
	public String showMajorList(Model model) throws Exception{
		Page<Major> majorPage = majorService.getOnePage(Major.class, 1, CommonConstant.PAGE_SIZE);
		model.addAttribute("majorPage", majorPage);
		return "common/majorList";
	}

}
