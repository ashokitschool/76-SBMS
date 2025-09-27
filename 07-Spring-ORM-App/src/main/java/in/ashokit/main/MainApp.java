package in.ashokit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.entity.Student;
import in.ashokit.service.StudentService;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		StudentService service = context.getBean(StudentService.class);

		// Save student
		service.addStudent(new Student(103, "Kumar", "Delhi"));
		service.addStudent(new Student(104, "Pragathi", "Chennai"));

		// Fetch students
		service.listStudents().forEach(s -> System.out.println(s.getId() + " " + s.getName() + " " + s.getCity()));

		context.close();
	}
}
