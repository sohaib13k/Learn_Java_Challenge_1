package org.sohaibkhan.challenge;

import java.util.Scanner;


public class Main {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Directory d1 = Directory.getInstance();
		Inbox inbox = new Inbox();
		int choice = 0;

		System.out.println("Hello User! Kindly select from the options below:");
		while (choice != 3) {
			System.out.println("1. Manage contacts" + '\t' + "2. Messages" + '\t' + "3. Quit");
			choice = input.nextInt();
			input.nextLine();
			switch (choice) {
			case 1:
				contacts(d1);
				break;
			case 2:
				messages(inbox);
			default:
				continue;
			}
		}
		input.close();

	}

	public static void messages(Inbox inbox) {
//		Scanner input = new Scanner(System.in);

		System.out.println("1. Show Inbox");
		System.out.println("2. Send a new text");
		System.out.println("3. Go back to the previous menu");

		int choice = input.nextInt();
		input.nextLine();

		switch (choice) {
		case 1:
			if(inbox.isEmpty())
				System.out.println("Inbox empty!");
			else
				System.out.println(inbox);
			break;
		case 2:
			System.out.println("Enter sender name and mobile(saperated by a comma): ");
			String[] sender = input.nextLine().split(",");
			System.out.println("Enter reciever name and mobile(saperated by a comma): ");
			String[] reciever = input.nextLine().split(",");
			System.out.println("Enter your message: ");
			String message = input.nextLine();
			inbox.send(new SMS(new Person(sender[0], sender[1]), new Person(reciever[0], reciever[1]), message));
		default:
			break;
		}
//		input.close();
	}

	public static void contacts(Directory d) {
//		Scanner input = new Scanner(System.in);

		System.out.println("1. Show all contacts");
		System.out.println("2. Add new contacts");
		System.out.println("3. Search for a contact");
		System.out.println("4. Delete a contact");
		System.out.println("5. Go back to the previous menu");

		int choice = input.nextInt();
		input.nextLine();
		
		switch (choice) {
		case 1:
			if (d.isEmpty())
				System.out.println("Directory empty.");
			else
				System.out.println(d);
			break;
		case 2:
			System.out.print("*Enter name: ");
			String name = input.nextLine();
			System.out.print("*Enter number: ");
			String number = input.nextLine();
			System.out.print("Enter e-mail: ");
			String email = input.nextLine();
			d.add(new Person(name, number, email));
			System.out.println("Contact Saved!");
			break;
		case 3:
			System.out.println();
			if (!d.search(input.nextLine())) {
				System.out.println("Not found!");
			}
			break;
		case 4:
			System.out.println("Enter name");
			if (!d.remove(input.nextLine())) {
				System.out.println("Not found!");
			}
			break;
		default:
//			input.close();
			return;
		}
	}
}