package cs323;

public class DeliveredOrder extends Order {  //extended Order class with child specific changes

	private String customerFeedback;

	public DeliveredOrder(String customerName, String itemOrdered, double itemPrice, String customerFeedback) {
		super(customerName, itemOrdered, itemPrice);
		this.customerFeedback = customerFeedback;
	}

	public String getCustomerFeedback() {
		return this.customerFeedback;
	}

	@Override //overrides for orderStatus and isCancellable
	public String getOrderStatus() {
		return ("Order handed to customer, feedback received: " + customerFeedback);
	}

	@Override
	public boolean isCancellable() {
		return false;
	}
}
