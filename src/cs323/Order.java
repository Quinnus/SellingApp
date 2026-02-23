package cs323;

abstract class Order { //abstract class, child objects are modified as required

	private static int orderID = 1000; // class specific variable for order number, increments each time an order is
	// created

	private String customerName;
	private String itemOrdered;
	private double itemPrice;
	private int orderNumber;

	public Order(String customerName, String itemOrdered, double itemPrice) {
		this.orderNumber = orderID;
		orderID++;  //assign and increment order number
		this.customerName = customerName;
		this.itemOrdered = itemOrdered;
		this.itemPrice = itemPrice;
	}

	public static int getOrderID() {
		return orderID;
	} // class methods

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

	public void printSummary() { //summary for orders - modified at child level
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("OrderID: " + getOrderNumber());
		System.out.println("Order Description: " + getItemOrdered());
		System.out.println("Total Price: " + getItemPrice());
		System.out.println("Order Status: " + getOrderStatus());
		System.out.println("Is Order Cancellable: " + ((isCancellable()) ? "YES" : "NO"));
	}

}
