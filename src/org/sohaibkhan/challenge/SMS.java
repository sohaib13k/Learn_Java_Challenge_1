package org.sohaibkhan.challenge;

public class SMS extends Directory {
	private Person sender;
	private Person reciever;
	private String body;
	
	public SMS(Person sender, Person reciever, String body) {	
		this.sender = sender;
		this.reciever = reciever;
		this.body = body;
		super.add(sender);
		super.add(reciever);
	}
	
	@Override
	public String toString() {
		return "Sender: " + sender.getName() + '\n' +
				"Reciever: " + reciever.getName() + '\n' + 
				"Body: " + body ;
	}


	public Person getSender() {
		return sender;
	}

	public void setSender(Person sender) {
		this.sender = sender;
	}

	public Person getReciever() {
		return reciever;
	}

	public void setReciever(Person reciever) {
		this.reciever = reciever;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
