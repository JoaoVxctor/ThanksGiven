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
    private Label labelVoltarCadastroPane;

    @FXML
    private Pane paneCadastro;


    @FXML
    void clickCadastrar(MouseEvent event) throws UsuarioException {
//    	ThanksGivenApplication.stageManager.switchScene(FxmlView.PESQUISARDOACOES);
        try{
            usuarioService.cadastraUsuario(new Usuario(TextFieldCadastroNome.getText(),TextFieldCadastroEmail.getText(),TextFieldCadastroSenha.getText()));
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
        assert TextFieldCadastroCPF != null : "fx:id=\"TextFieldCadastroCPF\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroEmail != null : "fx:id=\"TextFieldCadastroEmail\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroLogin != null : "fx:id=\"TextFieldCadastroLogin\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroNome != null : "fx:id=\"TextFieldCadastroNome\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert TextFieldCadastroSenha != null : "fx:id=\"TextFieldCadastroSenha\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert buttonCadastrar != null : "fx:id=\"buttonCadastrar\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert labelVoltarCadastroPane != null : "fx:id=\"labelVoltarCadastroPane\" was not injected: check your FXML file 'CadastroView.fxml'.";
        assert paneCadastro != null : "fx:id=\"paneCadastro\" was not injected: check your FXML file 'CadastroView.fxml'.";


    }

}
