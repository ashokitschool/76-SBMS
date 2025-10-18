package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.ashokit.entity.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {

	// select * from user_info where country=?
	public List<UserInfo> findByCountry(String country);

	// select * from user_info where gender=?
	public List<UserInfo> findByGender(String gender);

	// select * from user_info where country=? and gender=?
	public List<UserInfo> findByCountryAndGender(String country, String gender);

	// select * from user_info where age >= 40
	public List<UserInfo> findByAgeGreaterThanEqual(Integer age);

	// select * from user_info where country=? and age >= ?
	public List<UserInfo> findByCountryAndAgeGreaterThanEqual(String country, Integer age);

	@Query(value = "select * from user_info", nativeQuery = true)
	public List<UserInfo> m1();
	
	@Query("From UserInfo")
	public List<UserInfo> m2();

}
