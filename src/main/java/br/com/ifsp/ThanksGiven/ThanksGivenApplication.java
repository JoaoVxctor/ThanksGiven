package br.com.ifsp.ThanksGiven;

import javafx.stage.Stage;
import org.hibernate.annotations.Parent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import javafx.application.Application;

@SpringBootApplication
public class ThanksGivenApplication extends Application   {
	private ConfigurableApplicationContext springContext;
	private Parent rootNode;

	public static void main(String[] args) {
		SpringApplication.run(ThanksGivenApplication.class, args);
	}


	@Override
	public void start(Stage stage) throws Exception {

	}
}
