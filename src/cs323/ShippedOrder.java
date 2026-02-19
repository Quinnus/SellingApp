package cs323;

public class ShippedOrder extends Order {
	private String courierType;

	public ShippedOrder(String customerName, String itemOrdered, double itemPrice, String shipmentBy) {
		super(customerName, itemOrdered, itemPrice);
		this.courierType = shipmentBy;
	}

	@Override
	public String getOrderStatus() {
		return ("Order shipped, delivery by: " + courierType);
	}

	@Override
	public boolean isCancellable() {
		return false;
	}
}
