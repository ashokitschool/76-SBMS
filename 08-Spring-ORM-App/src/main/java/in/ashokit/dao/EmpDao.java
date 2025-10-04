package in.ashokit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Employee;

@Repository
@Transactional
public class EmpDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveEmp(Employee emp) {
		hibernateTemplate.save(emp);
	}

	public void saveOrUpdate(Employee emp) {
		hibernateTemplate.saveOrUpdate(emp);
	}

	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	public Employee getEmpById(Integer empId) {
		return hibernateTemplate.get(Employee.class, empId);
	}

	public List<Employee> getEmpsByName(String name) {
		return (List<Employee>) hibernateTemplate.find("From Employee where empName=?0", name);
	}
}
