package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.dao.IUserDao;

@Service
public class UserService {

	private IUserDao userDao;

	public void printName() {
		System.out.println("userDao Obj :: " + userDao);
		String name = userDao.getName(100);
		System.out.println("Name :: " + name);
	}
}
