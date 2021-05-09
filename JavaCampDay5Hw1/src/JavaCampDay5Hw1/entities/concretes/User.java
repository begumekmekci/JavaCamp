package JavaCampDay5Hw1.entities.concretes;

import JavaCampDay5Hw1.entities.abstacts.Entity;

public class User implements Entity{

	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	public User() {
		super();
	}
	
	public User(int id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String geteMail() {
		return email;
	}

	public void seteMail(String eMail) {
		this.email = eMail;
	}

	public String getFullName() {
		return this.firstName +" "+ this.lastName;
	}
	
	
	
	
}
