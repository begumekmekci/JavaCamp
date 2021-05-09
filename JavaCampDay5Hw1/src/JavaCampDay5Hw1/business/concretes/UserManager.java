package JavaCampDay5Hw1.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import JavaCampDay5Hw1.business.abstracts.UserService;
import JavaCampDay5Hw1.dataAccess.abstracts.UserDao;
import JavaCampDay5Hw1.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean add(User user) {
		if(mailCheck(user.geteMail()) ) {
		         if(passwordCheck(user.getPassword())) {
		        	 if(firstNameCheck(user.getFirstName()) && lastNameCheck(user.getLastName())) {
		        		
		        		 this.userDao.add(user);
		        		 return true;
		        	 }
		        	 else {
		        		 return false;
		        	 }
		        	 
		         }
		         else {
		        	 return false;
		         }
		
		}
		else {
			return false;
		}
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public User getId(int id) {
		return this.userDao.get(id);
	}

	@Override
	public List<User> getall() {
		
		return this.userDao.getAll();	
				}

	@Override
	public User getEmail(String email) {
		return this.userDao.get(email);
	}
	@Override
	public boolean mailCheck(String mail) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mail);
		if(matcher.matches()) {
			return true;
		}
		else {
			System.out.println("Your email is invalid");
			return false;
		}
	}
	
	@Override
	public boolean passwordCheck(String password) {
		if(password.length() < 6) {
			System.out.println("Your password must be at least 6 characters!");
		return false;
		}
		else {
			return true;
		}
	}
	
	public boolean firstNameCheck(String firstName) {
		if(firstName.length()>=2) {
			return true;
		}
		else {
			System.out.println("Your first name must be longer than 2 characters");
		    return false;
		}
	}


	public boolean lastNameCheck(String lastName) {
		if(lastName.length()>=2) {
			return true;
		}
		else {
			System.out.println("Your last name must be longer than 2 characters");
		    return false;
		}
	}

}
