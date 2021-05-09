package JavaCampDay5Hw1.business.concretes;

import JavaCampDay5Hw1.business.abstracts.SignUpService;

public class SignUpWithGoogle implements SignUpService{

	@Override
	public void signUp(String email, String password) {
		System.out.println("User signed up with google account");
		
	}

}
