package springmvc.qch.serviceImpl;

import java.io.Serializable;
import java.util.List;

import springmvc.qch.dao.ProjectDao;
import springmvc.qch.pojo.Page;
import springmvc.qch.pojo.Project;
import springmvc.qch.service.ProjectService;

public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService {

	private ProjectDao projectDao;

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

}
