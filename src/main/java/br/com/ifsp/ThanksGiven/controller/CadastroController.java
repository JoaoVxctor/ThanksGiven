package br.com.ifsp.ThanksGiven.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;


@Controller
public class CadastroController {

    @FXML
    private static Pane paneCadastro;
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField TextFieldCadastroCPF;
    @FXML
    private TextField TextFieldCadastroEmail;
    @FXML
    private TextField TextFieldCadastroLogin;
    @FXML
    private TextField TextFieldCadastroNome;
    @FXML
    private TextField TextFieldCadastroSenha;
    @FXML
    private Button buttonCadastrar;
    @FXML
    private Button buttonCloseCadastroView;
    @FXML
    private Button buttonMinimizeCadastroView;

    public static void hidePane() {
        paneCadastro.setVisible(false);
    }

    public static void showPane() {
        paneCadastro.setVisible(true);
    }

    @FXML
    void clickCadastrar(MouseEvent event) {
    }

    @FXML
    void clickCloseCadastroPane(MouseEvent event) {
    }

    @FXML
    void clickMinimizeCadastroPane(MouseEvent event) {
    }

    @FXML
    void initialize() {
        assert TextFieldCadastroCPF != null : "fx:id=\"TextFieldCadastroCPF\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroEmail != null : "fx:id=\"TextFieldCadastroEmail\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroLogin != null : "fx:id=\"TextFieldCadastroLogin\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroNome != null : "fx:id=\"TextFieldCadastroNome\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroSenha != null : "fx:id=\"TextFieldCadastroSenha\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert buttonCadastrar != null : "fx:id=\"buttonCadastrar\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert buttonCloseCadastroView != null : "fx:id=\"buttonCloseCadastroView\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert buttonMinimizeCadastroView != null : "fx:id=\"buttonMinimizeCadastroView\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert paneCadastro != null : "fx:id=\"paneCadastro\" was not injected: check your FXML file 'CadastroView.fxml'.";


    }

}
