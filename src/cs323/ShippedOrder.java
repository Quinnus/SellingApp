package cs323;

public class ShippedOrder extends Order { //extended Order class with child specific changes
	private String courierType;

	public ShippedOrder(String customerName, String itemOrdered, double itemPrice, String shipmentBy) {
		super(customerName, itemOrdered, itemPrice);
		this.courierType = shipmentBy;
	}

	@Override //overrides for orderStatus and isCancellable
	public String getOrderStatus() {
		return ("Order shipped, delivery by: " + courierType);
	}

	@Override
	public boolean isCancellable() {
		return false;
	}
}
