package cs323;

public class CompletingOrder extends Order {  //extended Order class with child specific changes
	private String estimatedDelivery;

	public CompletingOrder(String customerName, String itemOrdered, double itemPrice, String deliveryDate) {
		super(customerName, itemOrdered, itemPrice);
		this.estimatedDelivery = deliveryDate;
	}

	@Override //overrides for orderStatus and isCancellable
	public String getOrderStatus() {
		return ("Preparing to ship, estimated delivery date: " + estimatedDelivery);
	}

	@Override
	public boolean isCancellable() {
		return true;
	}
}
