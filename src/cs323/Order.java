package cs323;

abstract class Order {

	private static int orderID = 1000;

	private String customerName;
	private String itemOrdered;
	private double itemPrice;
	private int orderNumber;

	public Order(String customerName, String itemOrdered, double itemPrice) {
		this.orderNumber = orderID;
		orderID++;
		this.customerName = customerName;
		this.itemOrdered = itemOrdered;
		this.itemPrice = itemPrice;
	}

	public static int getOrderID() {
		return orderID;
	}

	public double getItemPrice() {
		return this.itemPrice;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public String getItemOrdered() {
		return this.itemOrdered;
	}

	public int getOrderNumber() {
		return this.orderNumber;
	}

	public abstract String getOrderStatus();

	public abstract boolean isCancellable();

	public void printSummary() {
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("OrderID: " + getOrderNumber());
		System.out.println("Order Description: " + getItemOrdered());
		System.out.println("Total Price: " + getItemPrice());
		System.out.println("Order Status: " + getOrderStatus());
		System.out.println("Is Order Cancellable: " + ((isCancellable()) ? "YES" : "NO"));
	}

}
