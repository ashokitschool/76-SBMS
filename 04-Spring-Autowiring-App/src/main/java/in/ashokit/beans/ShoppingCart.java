package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCart {

	@Autowired
	private IPayment payment;

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void placeOrder() {

		boolean doPayment = payment.doPayment(110.00);

		if (doPayment) {
			System.out.println("Order Placed Successfully!!");
		} else {
			System.out.println("Order Failed");
		}
	}

}
