package org.sohaibkhan.challenge;

public class Person {
	
	private String name;
	private String number;
	private String email;
	
	public Person(String name, String number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	
	public Person(String name, String number, String email) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
	}


	@Override
	public String toString() {
		return  "Name: " + this.name +'\n'+
				"Number: " + this.number + '\n'+
				"e-mail: " + this.email;
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
