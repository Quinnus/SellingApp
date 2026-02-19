package cs323;

public class DeliveredOrder extends Order {

	private String customerFeedback;

	public DeliveredOrder(String customerName, String itemOrdered, double itemPrice, String customerFeedback) {
		super(customerName, itemOrdered, itemPrice);
		this.customerFeedback = customerFeedback;
	}

	public String getCustomerFeedback() {
		return this.customerFeedback;
	}

	@Override
	public String getOrderStatus() {
		return ("Order handed to customer, feedback received: " + customerFeedback);
	}

	@Override
	public boolean isCancellable() {
		return false;
	}
}
