package in.ashokit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.ashokit.entity.Student;

@Repository
@Transactional
public class StudentDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void saveStudent(Student student) {
		hibernateTemplate.save(student);
	}

	public List<Student> getAllStudents() {
		return hibernateTemplate.loadAll(Student.class);
	}
}