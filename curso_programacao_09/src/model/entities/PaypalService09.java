package model.entities;

public class PaypalService09 implements OnlinePaymentService09 {

	@Override
	public double interest(Double amount, Integer months) {
		return (0.01 * amount * months);
	}
	
	@Override
	public double paymentFee(Double amount) {
		return (amount * 0.02);
	}
}
