package in.ashokit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Motor {

	public Motor() {
		System.out.println("Motor :: Constructor");
	}

	@PostConstruct
	public void start() {
		System.out.println("motor started...");
	}

	public void doWork() {
		System.out.println("Motor working...");
	}

	@PreDestroy
	public void stop() {
		System.out.println("motor stopped...");
	}

}
