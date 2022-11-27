package model.entities;

import java.time.LocalDate;

public class ContractService09 {

	private OnlinePaymentService09 onlinePaymentService09;

	public ContractService09(OnlinePaymentService09 onlinePaymentService09) {
		this.onlinePaymentService09 = onlinePaymentService09;
	}

	public void processContract(Contract09 contract, Integer months) {
		double basicQuota = contract.getTotalValue()/months;
		for (int i=1; i<=months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService09.interest(basicQuota, i);
			double fee = onlinePaymentService09.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstallments().add(new Installment09(dueDate, quota));
		}
	}
}
