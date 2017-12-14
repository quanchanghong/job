package springmvc_qch_controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.qch.pojo.Department;
import springmvc.qch.service.DepartmentService;

@Controller
public class DepartmentController {
	
	private	DepartmentService departmentService;

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@RequestMapping("/department")
	public String addDepart(Model model){
		List<Department> departList = departmentService.getDepartmentList();
		model.addAttribute("departList", departList);
		return "department/departmentlist";
	}
}
