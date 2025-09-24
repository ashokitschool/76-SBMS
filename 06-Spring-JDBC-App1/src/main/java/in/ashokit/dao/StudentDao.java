package in.ashokit.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.ashokit.dto.Student;

@Repository
public class StudentDao {

	private JdbcTemplate jt;

	public StudentDao(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int save(Student s) {

		String sql = "INSERT INTO STUDENT (ID, NAME, CITY) VALUES (?,?,?)";

		int rowsEffected = jt.update(sql, s.getId(), s.getName(), s.getCity());

		return rowsEffected;
	}
}
