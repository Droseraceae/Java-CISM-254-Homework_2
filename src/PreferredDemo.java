/*
 * 
 * @Author Josh Alcoba
 * 
 * Demonstrating inheritance 
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class PreferredDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name, address, phoneNum, custNum;
		boolean mailList;
		double purchases;

		System.out.println("Hello and thank you for choosing our services. Let's start with your name: ");
		name = keyboard.nextLine();
		
		System.out.println("Always liked that name. Now, here do you live? ");
		address = keyboard.nextLine();
		
		System.out.println("Hey, my cousin lives on that street. Phone number please!");
		phoneNum = keyboard.nextLine();
		
		System.out.println("Score! Ok so management says it makes the customer feel \n"
				+ "better to pick their own 'customer number' something about \n" + "\"not feeling like a number "
				+ "instead of a person\" so...go ahead:");
		custNum = keyboard.nextLine();
		
		System.out.println("Ok so, that brings us to our last question, do you want to be on our mailing list? "
				+ "\nPlease say YES! I mean you CAN say NO...but please say YES!");
		if (keyboard.nextLine().toUpperCase().equals("YES")) {
			mailList = true;
		} else {
			mailList = false;
		}

		System.out.println("Ok well we've reached the end. Here's the information you gave.\n");
		
		System.out.println("Great, this is going very smoothly. What is your total?");
		purchases = keyboard.nextDouble();

		PreferredCustomer pref = new PreferredCustomer(name, address, phoneNum, custNum, mailList, purchases);
		pref.setDiscountLevel(purchases); // set discount

		System.out.println("Name: " + pref.getName());
		System.out.println("Address: " + pref.getAddress());
		System.out.println("Telephone: " + pref.getPhone());
		System.out.println("Customer Number: " + pref.getCustomerNumber());
		if (pref.getMailingList() == true) {
			System.out.println("Mailing List: YES");
		} else {
			System.out.println("Mailing List: NO");
		}
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		System.out.println("Purchases: $" + dollar.format(pref.getPurchases()));
		System.out.println("Discount level: " + pref.getDiscountLevel());
	}

}
