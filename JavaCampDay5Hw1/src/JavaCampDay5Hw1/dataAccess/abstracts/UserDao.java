package JavaCampDay5Hw1.dataAccess.abstracts;

import java.util.List;

import JavaCampDay5Hw1.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	User get(String email);
	List<User> getAll();
	
}
