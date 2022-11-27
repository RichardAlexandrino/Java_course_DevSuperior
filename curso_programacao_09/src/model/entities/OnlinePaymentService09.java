package model.entities;

public interface OnlinePaymentService09 {

	double paymentFee(Double amount);
	
	double interest(Double amount, Integer months);
}
