package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.ashokit.entity.UserInfo;
import in.ashokit.repo.UserInfoRepository;

@Service
public class UserService {

	@Autowired
	public UserInfoRepository userRepo;

	public void getUserswithSort() {

		Sort sort = Sort.by("age", "gender").descending();

		List<UserInfo> users = userRepo.findAll(sort);

		users.forEach(System.out::println);

	}

	public void getUserswithPagination() {

		Integer pageNum = 2; // we will get from UI
		Integer pageSize = 3; // it is fixed

		PageRequest pageReq = PageRequest.of(pageNum - 1, pageSize);

		Page<UserInfo> page = userRepo.findAll(pageReq);

		List<UserInfo> users = page.getContent();

		users.forEach(System.out::println);

	}

	public void qbe() {

		UserInfo user = new UserInfo();
		user.setGender("Male");
		user.setCountry("India");

		Example<UserInfo> of = Example.of(user);
		List<UserInfo> usersList = userRepo.findAll(of);

		usersList.forEach(System.out::println);
	}
}
