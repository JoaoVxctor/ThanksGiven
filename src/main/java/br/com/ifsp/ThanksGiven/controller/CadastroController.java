package br.com.ifsp.ThanksGiven.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.ifsp.ThanksGiven.exception.UsuarioException;
import br.com.ifsp.ThanksGiven.models.Usuario;
import br.com.ifsp.ThanksGiven.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.ifsp.ThanksGiven.ThanksGivenApplication;
import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.control.PasswordField;


@Controller
public class CadastroController {
    UsuarioService usuarioService;

    @Autowired
    public CadastroController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;



    @FXML
    private TextField textFieldCadastroEmail;

    @FXML
    private TextField textFieldCadastroLogin;

    @FXML
    private TextField textFieldCadastroNome;

    @FXML
    private PasswordField passwordFieldCadastro;

    @FXML
    private Button buttonCadastrar;

    @FXML
    private Label labelVoltarCadastroPane;

    @FXML
    private Pane paneCadastro;


    @FXML
    void clickCadastrar(MouseEvent event) throws UsuarioException {
//    	ThanksGivenApplication.stageManager.switchScene(FxmlView.PESQUISARDOACOES);
        try{
            usuarioService.cadastraUsuario(new Usuario(textFieldCadastroNome.getText(),textFieldCadastroEmail.getText(),passwordFieldCadastro.getText()));
        }catch (UsuarioException e){
            System.out.println(e);
        }
    }


    @FXML
    void clickVoltarLoginPane(MouseEvent event) {
    	ThanksGivenApplication.stageManager.switchScene(FxmlView.LOGIN);
    }

    @FXML
    void initialize() {
        assert textFieldCadastroEmail != null : "fx:id=\"textFieldCadastroEmail\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert textFieldCadastroLogin != null : "fx:id=\"textFieldCadastroLogin\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert textFieldCadastroNome != null : "fx:id=\"textFieldCadastroNome\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert passwordFieldCadastro != null : "fx:id=\"passwordFieldCadastro\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert buttonCadastrar != null : "fx:id=\"buttonCadastrar\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert labelVoltarCadastroPane != null : "fx:id=\"labelVoltarCadastroPane\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert paneCadastro != null : "fx:id=\"paneCadastro\" was not injected: check your FXML file 'CadastroView.fxml'.";


    }

}
