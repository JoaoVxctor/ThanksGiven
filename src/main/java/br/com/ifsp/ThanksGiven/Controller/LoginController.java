package br.com.ifsp.ThanksGiven.Controller;

import br.com.ifsp.ThanksGiven.Controller.CadastroController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;


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
    private Button buttonCloseLoginView;

    @FXML
    private Button buttonEntrar;

    @FXML
    private Button buttonMinimizeLoginView;

    @FXML
    private static Pane paneLogin;


    @FXML
    void clickCadastrarSe(MouseEvent event) {
    	hidePane();
    	CadastroController.showPane();
    	
    }

    @FXML
    void clickCloseLoginPane(MouseEvent event) {
    }

    @FXML
    void clickEntrarLogin(MouseEvent event) {
    }

    @FXML
    void clickMinimizeLoginPane(MouseEvent event) {
    }

    public static void hidePane() {
    	paneLogin.setVisible(false);
    }
    
    public static void showPane() {
    	paneLogin.setVisible(true);
    }
    
    @FXML
    void initialize() {
        assert TextFieldLogin != null : "fx:id=\"TextFieldLogin\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert TextFieldSenha != null : "fx:id=\"TextFieldSenha\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert buttonCadastreSe != null : "fx:id=\"buttonCadastreSe\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert buttonCloseLoginView != null : "fx:id=\"buttonCloseLoginView\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert buttonEntrar != null : "fx:id=\"buttonEntrar\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert buttonMinimizeLoginView != null : "fx:id=\"buttonMinimizeLoginView\" was not injected: check your FXML file 'LoginView.fxml'.";
        assert paneLogin != null : "fx:id=\"paneLogin\" was not injected: check your FXML file 'LoginView.fxml'.";


    }
    
   

}
