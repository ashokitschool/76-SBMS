package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.EmpDao;
import in.ashokit.entity.Employee;

@Service
public class EmpService {

	@Autowired
	private EmpDao empDao;

	public void saveEmployee(Employee emp) {
		empDao.saveEmp(emp);
	}
	
	public void saveOrUpdateEmployee(Employee emp) {
		empDao.saveOrUpdate(emp);
	}
	
	public void getEmps() {
		List<Employee> allEmployees = empDao.getAllEmployees();
		allEmployees.forEach(System.out::println);
	}
	
	public void getEmpById(Integer empId) {
		Employee empById = empDao.getEmpById(empId);
		System.out.println(empById);
	}
	
	public void getEmpsByName(String name) {
		List<Employee> allEmployees = empDao.getEmpsByName(name);
		allEmployees.forEach(System.out::println);
	}
	
}
