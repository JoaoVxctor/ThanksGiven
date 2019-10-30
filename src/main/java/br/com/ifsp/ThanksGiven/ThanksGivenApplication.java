package br.com.ifsp.ThanksGiven;

import br.com.ifsp.ThanksGiven.config.StageManager;
import br.com.ifsp.ThanksGiven.View.FxmlView;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import javafx.application.Application;
import br.com.ifsp.ThanksGiven.Controller.*;

@SpringBootApplication
public class ThanksGivenApplication extends Application   {
	protected ConfigurableApplicationContext springContext;
	protected StageManager stageManager;

	public static void main(String[] args) {
		SpringApplication.run(ThanksGivenApplication.class, args);
	}

	@Override
	public void init() throws Exception {
		springContext = springBootApplicationContext();
	}

	@Override
	public void start(Stage stage) throws Exception {
		stageManager = springContext.getBean(StageManager.class);
		displayInitialScene();

	}

	@Override
	public void stop() throws Exception {
		springContext.close();
	}

	

	protected void displayInitialScene() {
		stageManager.switchScene(FxmlView.LOGIN);
	}

	private ConfigurableApplicationContext springBootApplicationContext() {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ThanksGivenApplication.class);
		String[] args = getParameters().getRaw().stream().toArray(String[]::new);
		return builder.run(args);
	}
	
	public void startPanes() {
		CadastroController.hidePane();
		LoginController.showPane();
	}

}
