package cs323;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Interface {

	public static void startUI() {
		ArrayList<Order> shopping = new ArrayList<>();
		boolean running = true;
		shopping.add(new NewOrder("Mary Byrne", "Electric Whisk", 13.03));
		shopping.add(new CompletingOrder("Joe Bloggs", "LCD TV", 499.99, "Feb 25, 2026"));
		shopping.add(new ShippedOrder("Susan Smith", "Ring Doorbell", 45.99, "DHL"));
		shopping.add(new DeliveredOrder("Bob Byrne", "Screwdriver Set", 14.99, "Delivery was late, won't buy here again"));

		Scanner scanner = new Scanner(System.in);
		while (running) {
			try {

				System.out.println("\n\nSelect an option 1, 2, 3 or 4:");
				System.out.println("1) Manually place an order");
				System.out.println("2) Run current order report");
				System.out.println("3) Run month end report");
				System.out.println("4) Exit\n");
				System.out.print("Selection: ");
				int selection = scanner.nextInt();
				scanner.nextLine();
				if (selection == 1) {
					shopping.add(Shopping.manualOrder());
				} else if (selection == 2) {
					Shopping.printOrderList(shopping);
				} else if (selection == 3) {
					Shopping.printMonthEndReport(shopping);
				} else if (selection == 4) {
					System.out.println("Goodbye.");
					running = false;
				} else {
					System.out.println("Please enter a number between 1 & 4");
				}

			} catch (InputMismatchException e) {
				System.out.println("Please enter a number between 1 & 4");
			}
		}
	}
}