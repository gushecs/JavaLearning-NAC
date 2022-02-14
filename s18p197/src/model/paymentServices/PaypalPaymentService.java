package model.paymentServices;

public class PaypalPaymentService implements PaymentService{

	@Override
	public double serviceFee() {
		return .01;
	}

	@Override
	public double serviceTax() {
		return .02;
	}

}
