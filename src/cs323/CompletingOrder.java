package cs323;

public class CompletingOrder extends Order {
	private String estimatedDelivery;

	public CompletingOrder(String customerName, String itemOrdered, double itemPrice, String deliveryDate) {
		super(customerName, itemOrdered, itemPrice);
		this.estimatedDelivery = deliveryDate;
	}

	@Override
	public String getOrderStatus() {
		return ("Preparing to ship, estimated delivery date: " + estimatedDelivery);
	}

	@Override
	public boolean isCancellable() {
		return true;
	}
}
