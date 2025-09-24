package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("credit")
@Primary
public class CreditCardPayment implements IPayment {

	@Override
	public boolean doPayment(double amt) {
		System.out.println("CreditCardPayment :: completed..");
		return true;
	}
}