package in.ashokit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.UserInfo;
import in.ashokit.repo.UserInfoRepository;

@Service
public class UserService {

	@Autowired
	private UserInfoRepository userInfoRepo; //impl obj will come here

	public void test() {
		String impl = userInfoRepo.getClass().getName();
		System.out.println("Repo impl class name :: " + impl);
	}

	public void saveUser() {

		UserInfo u = new UserInfo();
		u.setUserId(102);
		u.setName("Ashok");
		u.setGender("Male");
		u.setCountry("INDIA");
		u.setAge(25);

		userInfoRepo.save(u);

		System.out.println("User Saved...");
	}
	
	public void getUserById(Integer uid) {
		Optional<UserInfo> byId = userInfoRepo.findById(uid);
		if(byId.isPresent()) {
			System.out.println(byId.get());
		}
	}
	
	public void getAllUsers() {
		
		Iterable<UserInfo> all = userInfoRepo.findAll();
		all.forEach(System.out::println);
		
	}

}
