package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.beans.AppSecurity;

@Configuration
@ComponentScan(basePackages = "in.ashokit")
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}

	@Bean
	public AppSecurity getSecurityContextObj() {
		AppSecurity security = new AppSecurity("SHA-256");
		// security logic
		return security;
	}
}
