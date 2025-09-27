package in.ashokit.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.dao.StudentDao;
import in.ashokit.dto.Student;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDao dao = ctxt.getBean(StudentDao.class);

		/*
		 * Student s = new Student(); s.setCity("Pune"); s.setName("John");
		 * s.setId(102);
		 * 
		 * int cnt = dao.save(s);
		 * 
		 * System.out.println("Rows Effected :: " + cnt);
		 */
		
		List<Student> all = dao.findAll();
		all.forEach(System.out::println);
	}

}
