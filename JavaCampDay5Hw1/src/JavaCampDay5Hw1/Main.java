package JavaCampDay5Hw1;


import JavaCampDay5Hw1.business.abstracts.SignUpService;
import JavaCampDay5Hw1.business.abstracts.UserService;
import JavaCampDay5Hw1.business.concretes.SignUpWithGoogle;
import JavaCampDay5Hw1.business.concretes.UserManager;
import JavaCampDay5Hw1.core.abstracts.SignInService;
import JavaCampDay5Hw1.core.concretes.SignInManager;
import JavaCampDay5Hw1.dataAccess.concretes.HibernateDao;
import JavaCampDay5Hw1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1, "Begüm", "Ekmekçi", "begum@gmail.com", "123456");
		UserService userService = new UserManager(new HibernateDao()); 
		
			userService.add(user);
			
		SignUpService signUpService = new SignUpWithGoogle();
		signUpService.signUp("begum@gmail.com", "123456");
			
	    SignInService signInService = new SignInManager(user);
	    signInService.signIn("begum@gmail.com", "123456");
			
		}

}
