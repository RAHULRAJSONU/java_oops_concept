package exercise.payment;

public class CitrixImpl implements IPaymentGateWay {
	@Override
	public void PayMoney() {
		System.out.println("Payment Successfull Through Citrix");
	}
}
