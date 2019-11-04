package br.edu.ifsp.cmp.Op3n;

import org.hibernate.annotations.Parent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sun.net.www.ApplicationLaunchException;

@SpringBootApplication
public class App   {
	private ConfigurableApplicationContext springContext;
	private Parent rootNode;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}



}
