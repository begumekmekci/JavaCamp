package JavaCampDay5Hw1.core.concretes;

import JavaCampDay5Hw1.core.abstracts.SignInService;
import JavaCampDay5Hw1.entities.concretes.User;

public class SignInManager implements SignInService{

	private User user;
	
	
	public SignInManager(User user) {
		super();
		this.user = user;
	}


	@Override
	public void signIn(String email, String password) {
		if(user.geteMail().equals(email) && user.getPassword().equals(password)) {
			System.out.println("Logged in");
		}
		else {
			System.out.println("Login failed");
		}
	}

}
