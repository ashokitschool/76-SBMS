package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.entity.Employee;
import in.ashokit.service.EmpService;

public class MainApp {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpId(103);
		e.setEmpName("Charan");
		e.setEmpSalary(35000.00);

		ApplicationContext ctxt = 
				new AnnotationConfigApplicationContext(AppConfig.class);

		EmpService es = ctxt.getBean(EmpService.class);

		// es.saveEmployee(e);

		// es.saveOrUpdateEmployee(e);

		// es.getEmps();

		// es.getEmpById(101);
		
		es.getEmpsByName("Ashok");
	}

}
