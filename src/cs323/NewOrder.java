package cs323;

public class NewOrder extends Order {

	public NewOrder(String customerName, String itemOrdered, double itemPrice) {
		super(customerName, itemOrdered, itemPrice);
	}

	@Override
	public String getOrderStatus() {
		return ("Order received, checking payment approval");
	}

	@Override
	public boolean isCancellable() {
		return true;
	}
}
