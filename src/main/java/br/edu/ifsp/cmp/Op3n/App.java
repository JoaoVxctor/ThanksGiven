package br.edu.ifsp.cmp.Op3n;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;


@SpringBootApplication
public class App extends Application   {
	private ConfigurableApplicationContext springContext;
	private Parent rootNode;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}


	@Override
	public void start(Stage stage) throws Exception {
		
	}
}