package springmvc_qch_controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.qch.pojo.Department;
import springmvc.qch.service.DepartmentService;

@Controller
@RequestMapping("/department")
public class DepartmentController {
	
	private	DepartmentService departmentService;

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@RequestMapping("/list")
	public String addDepart(Model model){
		List<Department> departList = departmentService.getDepartmentList();
		model.addAttribute("departList", departList);
		return "department/departmentlist";
	}
	
	@RequestMapping("/edit")
	public String editDepart(@RequestParam String departmentId,Model model){
		Department department = departmentService.getDepartByDepartId(Integer.parseInt(departmentId));
		model.addAttribute("department", department);
		return "department/departmentedit";
	}
	
	@RequestMapping(value="/update")
	public String updateDepart(Department department, Model model){
		System.out.println(department);
		return null;
	}
	
	
}
