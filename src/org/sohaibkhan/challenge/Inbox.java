package org.sohaibkhan.challenge;

import java.util.ArrayList;

public class Inbox{
	private ArrayList<SMS> inbox = new ArrayList<SMS>();
	
	
	public boolean send(SMS s) {
		boolean status = false;
		inbox.add(s);
		return !status;
	}

	@Override
	public String toString() {
		for (SMS sms : inbox) {
			System.out.println(sms);
			System.out.println('\n');
		}
		return "";
	}
	
	public boolean isEmpty() {
		return inbox.isEmpty();
	}
}