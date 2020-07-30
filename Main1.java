package assignment5;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int foodOpt;
		int feed = 0;
		double price = 0.0;
		double taxrate = 0.07;
		double tipRate = 0.15;

		Scanner input = new Scanner(System.in);
		TakeOut1 obj = new TakeOut1();

		TakeOut1.displayMainMenu();
		int inp = input.nextInt();

		switch (inp) {
		case 1:
			TakeOut1.displayItalianFoodMenu();
			break;
		case 2:
			TakeOut1.displayChineseFoodMenu();
			break;

		case 3:
			TakeOut1.displayAmericanFoodMenu();
			break;

		default:
			System.out.println("Invalid option.");
			break;
		}

		foodOpt = input.nextInt();

		if (inp == 1 && foodOpt == 1) {
			feed = 5;
			price = 17.99;
		} else if (inp == 1 && foodOpt == 2) {
			feed = 7;
			price = 15.99;
		} else if (inp == 1 && foodOpt == 3) {
			feed = 4;
			price = 12.99;
		} else if (inp == 2 && foodOpt == 1) {
			feed = 7;
			price = 18.99;
		} else if (inp == 2 && foodOpt == 2) {
			feed = 7;
			price = 18.99;
		} else if (inp == 2 && foodOpt == 3) {
			feed = 5;
			price = 10.99;
		} else if (inp == 3 && foodOpt == 1) {
			feed = 8;
			price = 21.99;
		} else if (inp == 3 && foodOpt == 2) {
			feed = 5;
			price = 22.99;
		} else if (inp == 3 && foodOpt == 3) {
			feed = 10;
			price = 26.99;
		} else {
			System.out.println("Option not valid.");
		}

		System.out.println("Enter the number of people:");
		System.out.println("----------------------------");
		int people = input.nextInt();

		TakeOut1.determineTrays(people, feed);
		int trays = TakeOut1.determineTrays(people, feed);
		
		System.out.println("----------------------------");
		System.out.println("You need "+trays+" trays");
		System.out.println("Feeds:"+feed);

		TakeOut1.getSubtotal(price, trays);
		double subTotal = TakeOut1.getSubtotal(price, trays);
		System.out.println("Price for " + people + " people " + "(" + trays + " trays)" + ": $" + subTotal);

		TakeOut1.getTax(subTotal, taxrate);
		double tax = TakeOut1.getTax(subTotal, taxrate);
		System.out.println("Tax: $"+tax);
		
		TakeOut1.getTip(subTotal, tipRate);
		double tip = TakeOut1.getTip(subTotal, tipRate);
		System.out.println("Tip: $"+tip);
		
		TakeOut1.getGrandTotal(subTotal, tax, tip);
		double grandTotal = TakeOut1.getGrandTotal(subTotal, tax, tip);
		System.out.println("Total (food, tax, tip): $"+grandTotal	);
		
		TakeOut1.pricePerPerson(grandTotal, people);
		double perPerson = TakeOut1.pricePerPerson(grandTotal, people);
		System.out.println("Price per person: $"+perPerson);	
		
		TakeOut1.determineLeftOvers(feed, trays, people);
		int leftOvers = TakeOut1.determineLeftOvers(feed, trays, people);
		System.out.println("Leftover servings for the delivery person: "+leftOvers);
	}
}
