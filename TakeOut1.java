package assignment5;

public class TakeOut1 {

	public static void displayMainMenu() {
		System.out.println("Please choose the type of meal:");
		System.out.println("-------------------------------");
		System.out.println("1. Italian Food\n2. Chinese Food\n3. American Food");
	}

	public static void displayItalianFoodMenu() {
		System.out.println("Choose one:");
		System.out.println("------------");
		System.out.println(
				"1. Lasagna Tray - Feeds 5 - $17.99\n2. Pizza Pack - Feeds 7 - $15.99\n3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - $12.99");

	}

	public static void displayChineseFoodMenu() {
		System.out.println("Choose one:");
		System.out.println("------------");
		System.out.println(
				"1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - $18.99\n2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - $18.99\n3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - $10.99");

	}

	public static void displayAmericanFoodMenu() {
		System.out.println("Choose one:");
		System.out.println("------------");
		System.out.println(
				"1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - $21.99\n2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 - $22.9\n3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - $26.99");

	}

	public static int determineTrays(int people, int feeds) {
		int trays = 0;
		if (people > 10 && people < 100) {
			if (people % feeds == 0) {
				trays = people / feeds;
			} else if (people % feeds != 0) {
				trays = people / feeds + 1;
			} else {
				System.out.println("Invalid option.");;
			}
		} else {
			System.out.println("invalid option.");
	}
		return trays;
	}

	public static double getSubtotal(double price, int trays) {
		double subTotal = 0;	
		subTotal = price * trays;
		return subTotal;
	}

	public static double getTax(double subtotal, double taxrate) {
		double tax=subtotal*taxrate;
		return tax;
	}

	public static double getTip(double subtotal, double tipRate) {
		double tip = subtotal * tipRate;
		return tip;
	}

	public static double getGrandTotal(double subtotal, double tax, double tip) {
		double grandTotal = subtotal + tax + tip;
		return grandTotal;
	}

	public static double pricePerPerson(double grandTotal, int people) {
		double perPerson = grandTotal/people;
		return perPerson;
	}

	public static int determineLeftOvers(int feeds, int trays, int people) {
		int leftOvers = (feeds * trays) - people;
		return leftOvers;
	}
}
