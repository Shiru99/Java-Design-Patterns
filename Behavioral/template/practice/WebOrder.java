package Behavioral.template.practice;

public class WebOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Completing web checkout.");
	}

	@Override
	public void doPayment() {
		System.out.println("Process payment without Card present");
	}

	@Override
	public void doDelivery() {
		System.out.println("Ship the item to address");
	}

	@Override
	public void doReceipt() {
		System.out.println("Email receipt");
	}

}
