package JavaCampDay5Hw1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import JavaCampDay5Hw1.dataAccess.abstracts.UserDao;
import JavaCampDay5Hw1.entities.concretes.User;

public class HibernateDao implements UserDao{

	private List<User> users;
	private int userId;
	
	public HibernateDao() {
		users = new ArrayList<User>();
		userId = 0;
		
		
	}
	@Override
	public void add(User user) {
		user.setId(userId+1);
		users.add(user);
		userId++;
		System.out.println("User has been added : " + user.getFullName());
	}

	@Override
	public void update(User user) {
		int index = user.getId()-1;
		users.set(index, new User(user.getId(),user.getFirstName(), user.getLastName(), user.geteMail(), user.getPassword()));
        System.out.println("User has been updated : " + user.getFullName());
	}

	@Override
	public void delete(User user) {
		users.remove(user.getId()-1);
		userId--;
		System.out.println("User has been deleted "+user.getFullName());
		
	}

	@Override
	public User get(int id) {
		User user = null;
		for(User user1 : users  ) {
			if(user1.getId() == id) {
				user = user1;
			}
		}
		return user;
	}

	@Override
	public User get(String email) {
		User user = null;
		for(User user1 : users  ) {
			if(user1.geteMail().equals(email)) {
				user = user1;
			}
		}
		return user;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
