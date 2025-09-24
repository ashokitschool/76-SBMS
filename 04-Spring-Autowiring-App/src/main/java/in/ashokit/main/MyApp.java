package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.beans.ShoppingCart;
import in.ashokit.config.AppConfig;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = 
				new AnnotationConfigApplicationContext(AppConfig.class);
	
		ShoppingCart bean = ctxt.getBean(ShoppingCart.class);
		
		bean.placeOrder();
	}

}
