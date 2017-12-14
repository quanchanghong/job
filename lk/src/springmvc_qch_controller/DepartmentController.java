package springmvc_qch_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DepartmentController {
	
	@RequestMapping("/department")
	public String addDepart(){
		
		return "department/adddepartment";
	}
}
