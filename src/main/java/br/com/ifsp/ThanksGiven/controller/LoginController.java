package br.com.ifsp.ThanksGiven.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import br.com.ifsp.ThanksGiven.ThanksGivenApplication;
import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

@Controller
public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField TextFieldLogin;

    @FXML
    private TextField TextFieldSenha;

    @FXML
    private Button buttonCadastreSe;

    @FXML
    private Button buttonEntrar;

    @FXML
    private Pane paneLogin;


    @FXML
    void clickCadastrarSe(MouseEvent event) {
    	ThanksGivenApplication.stageManager.switchScene(FxmlView.CADASTRO);
    }

    @FXML
    void clickEntrarLogin(MouseEvent event) {
    	ThanksGivenApplication.stageManager.switchScene(FxmlView.PESQUISARDOACOES);
    }

    @FXML
    void initialize() {
        assert TextFieldLogin != null : "fx:id=\"TextFieldLogin\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert TextFieldSenha != null : "fx:id=\"TextFieldSenha\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert buttonCadastreSe != null : "fx:id=\"buttonCadastreSe\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert buttonEntrar != null : "fx:id=\"buttonEntrar\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert paneLogin != null : "fx:id=\"paneLogin\" was not injected: check your FXML file 'LoginView.fxml'.";


    }

}
