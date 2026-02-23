package cs323;

public class NewOrder extends Order { //extended Order class with child specific changes

	public NewOrder(String customerName, String itemOrdered, double itemPrice) {
		super(customerName, itemOrdered, itemPrice);
	}

	@Override //overrides for orderStatus and isCancellable
	public String getOrderStatus() {
		return ("Order received, checking payment approval");
	}

	@Override
	public boolean isCancellable() {
		return true;
	}
}
