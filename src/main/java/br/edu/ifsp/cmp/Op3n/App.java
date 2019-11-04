package br.edu.ifsp.cmp.Op3n;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import javafx.application.Application;
import javafx.stage.Stage;


@SpringBootApplication
public class App extends Application   {
	private ConfigurableApplicationContext springContext;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
	@Override
	public void stop() throws Exception {
		springContext.close();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}