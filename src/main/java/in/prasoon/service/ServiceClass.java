package in.prasoon.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.prasoon.bo.CustomerBo;
import in.prasoon.bo.ManagerBo;
import in.prasoon.bo.ProjectBo;
import in.prasoon.repository.CustomerRepository;
import in.prasoon.repository.ManagerRepository;
import in.prasoon.repository.ProjectRepository;
import in.prasoon.vo.ProjectVo;

@Service
public class ServiceClass
{
	@Autowired
	ProjectRepository projectRepository;
	@Autowired
	ManagerRepository managerRepository;
	@Autowired
	CustomerRepository customerRepository;

	public List<CustomerBo> findAllCustomer()
	{

		return customerRepository.findAll();

	}
	public List<ManagerBo> findAllManager() {

		return managerRepository.findAll();
	}
	public Boolean save(ProjectVo p)
	{
		try {
			ProjectBo projectBo = new ProjectBo();
			CustomerBo customerBo = new CustomerBo();
			ManagerBo managerBo = new ManagerBo();

			BeanUtils.copyProperties(p,projectBo);
			BeanUtils.copyProperties(p,customerBo);
			BeanUtils.copyProperties(p,managerBo);

//			projectBo.setCustomerBo(customerBo);
//			projectBo.setProjectBo(projectBo);
			
			//CustomerBo save2 = customerRepository.save(customerBo);

			ProjectBo save = projectRepository.save(projectBo);
			return true;
		}
		catch (Exception ex)
		{
			ex.printStackTrace();

			return false;
		}		
	}
}
