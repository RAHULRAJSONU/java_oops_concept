package exercise.payment;

public class PayPalImpl implements IPaymentGateWay{

	@Override
	public void PayMoney() {
		System.out.println("Payment Successfull Through PayPal");
	}
}
