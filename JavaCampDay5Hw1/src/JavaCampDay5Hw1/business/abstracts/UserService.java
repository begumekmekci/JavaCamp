package JavaCampDay5Hw1.business.abstracts;

import java.util.List;

import JavaCampDay5Hw1.entities.concretes.User;

public interface UserService {


	boolean add(User user);
	void update(User user);
	void delete(User user);
	User getId(int id);
	List<User> getall();
	User getEmail(String email);
	boolean mailCheck(String mail);
	boolean passwordCheck(String password);
	boolean firstNameCheck(String firstName);
	boolean lastNameCheck(String lastName);
}
