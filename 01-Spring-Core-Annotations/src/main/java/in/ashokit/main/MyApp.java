package in.ashokit.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.config.AppConfig;
import in.ashokit.service.UserService;

public class MyApp {

	public static void main(String[] args) {

		// Starting IOC Container
		ApplicationContext ctxt = new AnnotationConfigApplicationContext(AppConfig.class);

		// Getting Spring Bean obj from IoC
		UserService us = ctxt.getBean(UserService.class);

		// calling user service bean method
		us.getName();

	}
}
