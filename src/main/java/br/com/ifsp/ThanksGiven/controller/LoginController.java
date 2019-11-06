package br.com.ifsp.ThanksGiven.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;


@Controller
public class LoginController implements Initializable {

    @FXML
    private static Pane paneLogin;
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

    public static void hidePane() {
        paneLogin.setVisible(false);
    }

    public static void showPane() {
        paneLogin.setVisible(true);
    }

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

    @FXML
    void initialize() {
        assert TextFieldLogin != null : "fx:id=\"TextFieldLogin\" was not injected: check your FXML file 'Login.fxml'.";
        assert TextFieldSenha != null : "fx:id=\"TextFieldSenha\" was not injected: check your FXML file 'Login.fxml'.";
        assert buttonCadastreSe != null : "fx:id=\"buttonCadastreSe\" was not injected: check your FXML file 'Login.fxml'.";
        assert buttonCloseLoginView != null : "fx:id=\"buttonCloseLoginView\" was not injected: check your FXML file 'Login.fxml'.";
        assert buttonEntrar != null : "fx:id=\"buttonEntrar\" was not injected: check your FXML file 'Login.fxml'.";
        assert buttonMinimizeLoginView != null : "fx:id=\"buttonMinimizeLoginView\" was not injected: check your FXML file 'Login.fxml'.";
        assert paneLogin != null : "fx:id=\"paneLogin\" was not injected: check your FXML file 'Login.fxml'.";


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
