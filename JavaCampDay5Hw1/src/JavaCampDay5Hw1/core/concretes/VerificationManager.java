package JavaCampDay5Hw1.core.concretes;

import JavaCampDay5Hw1.core.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public void send() {
		System.out.println("Clicked on the link");
		
	}

}
