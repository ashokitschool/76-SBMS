package in.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

	public UserDaoImpl() {
		System.out.println("UserDaoImpl :: Constructor");
	}

	@Override
	public String getName(int id) {
		return "John";
	}
}
