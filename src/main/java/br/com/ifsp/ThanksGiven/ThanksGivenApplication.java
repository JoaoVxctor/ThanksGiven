package br.com.ifsp.ThanksGiven;

import org.hibernate.annotations.Parent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sun.net.www.ApplicationLaunchException;

@SpringBootApplication
public class ThanksGivenApplication   {
	private ConfigurableApplicationContext springContext;
	private Parent rootNode;

	public static void main(String[] args) {
		SpringApplication.run(ThanksGivenApplication.class, args);
	}

	

}
