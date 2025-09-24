package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.dao.StudentDao;
import in.ashokit.dto.Student;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentDao dao = ctxt.getBean(StudentDao.class);

		Student s = new Student();
		s.setCity("Hyd");
		s.setName("Ashok");
		s.setId(101);

		int cnt = dao.save(s);

		System.out.println("Rows Effected :: " + cnt);
	}

}
