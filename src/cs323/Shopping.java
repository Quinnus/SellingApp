package cs323;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {

	public static void printOrderList(ArrayList<Order> orders) {
		System.out.println("\nCurrent Live Orders in System");
		System.out.println("=============================");
		for (Order item : orders) {
			item.printSummary();
			System.out.println("=============================\n");
		}

	}

	public static void printMonthEndReport(ArrayList<Order> orders) {
		System.out.println("Month End Revenue and Customer Service Report");
		System.out.println("=============================================\n");
		double revenue = 0.0;
		for (Order order : orders) {
			revenue += order.getItemPrice();

		}
		System.out.println("Sales for January: €" + (String.format("%.2f", revenue)) + "\n");
		System.out.println("Customer Service Feedback January 2026:");
		for (Order order : orders) {
			if (order instanceof DeliveredOrder) {
				DeliveredOrder delivered = (DeliveredOrder) order;
				System.out.println("Order number: " + delivered.getOrderNumber());
				System.out.println("Feedback: " + delivered.getCustomerFeedback());
			}
		}
	}

	public static Order manualOrder() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		String manualName = scanner.nextLine();
		System.out.print("Enter item description: ");
		String manualItem = scanner.nextLine();
		System.out.print("Enter price (format #.##): ");
		double manualPrice = scanner.nextDouble();
		scanner.nextLine();
		int manualID = Order.getOrderID();
		System.out.println("Order number " + manualID + " created.");
		return new NewOrder(manualName, manualItem, manualPrice);
	}

	public static void main(String[] args) {
		Interface.startUI();

	}
}
