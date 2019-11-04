package br.edu.ifsp.cmp.Op3n;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Tela extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(Main.class.getResource("/br/edu/ifsp/cmp/Op3n/view/LoginView.fxml"));
		primaryStage.setScene(new Scene(root, 450, 450));
		primaryStage.show();
	}
}
