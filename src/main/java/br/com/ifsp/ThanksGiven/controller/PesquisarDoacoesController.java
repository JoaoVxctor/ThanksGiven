package br.com.ifsp.ThanksGiven.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.ifsp.ThanksGiven.ThanksGivenApplication;
import br.com.ifsp.ThanksGiven.config.Session;
import br.com.ifsp.ThanksGiven.exception.DoacaoException;
import br.com.ifsp.ThanksGiven.exception.UsuarioException;
import br.com.ifsp.ThanksGiven.models.Item;
import br.com.ifsp.ThanksGiven.models.Usuario;
import br.com.ifsp.ThanksGiven.service.DoacaoService;
import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import static br.com.ifsp.ThanksGiven.ThanksGivenApplication.stageManager;

@Controller
public class PesquisarDoacoesController {

    private DoacaoService doacaoService;

    @Autowired
    public PesquisarDoacoesController(DoacaoService doacaoService) {
        this.doacaoService = doacaoService;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonBuscarDoacoes;

    @FXML
    private Button buttonOpcaoAdicionarDoacoes;

    @FXML
    private Button buttonOpcaoMinhasAquisicoes;

    @FXML
    private Button buttonOpcaoMinhasDoacoes;

    @FXML
    private Button buttonSairConta;

    @FXML
    private AnchorPane panePesquisarDoacoes;

    @FXML
    private TableView<Item> tableViewResultadoPesquisa;

    @FXML
    private TextField textFieldPesquisa;

    @FXML
    private TableColumn<Item, String> doador;

    @FXML
    private TableColumn<Item, String> nome;

    @FXML
    private TableColumn<Item, String> descricao;


    @FXML
    void clickBuscarDoacoes(MouseEvent event) {
		/*
		 * try { Usuario usuario = usuarioService .cadastraUsuario(new
		 * Usuario(textFieldCadastroNome.getText(), textFieldCadastroEmail.getText(),
		 * passwordFieldCadastro.getText(), textFieldCadastroLogin.getText()));
		 * Session.getSession().setUsuario(usuario); } catch (DoacaoException e) {
		 * System.out.println(e); }
		 */
    }

    @FXML
    void clickIrPaneAdicionarDoacoes(MouseEvent event) {
    	stageManager.switchScene(FxmlView.ADDPRODUTO);
    }

    @FXML
    void clickIrPaneMinhasAquisicoes(MouseEvent event) {
    	stageManager.switchScene(FxmlView.AQUISICOES);
    }

    @FXML
    void clickIrPaneMinhasDoacoes(MouseEvent event) {
    	stageManager.switchScene(FxmlView.MINHASDOACOES);
    }

    @FXML
    void clickSairConta(MouseEvent event) {
    	stageManager.switchScene(FxmlView.LOGIN);
    }

    @FXML
    void doacaoClick(MouseEvent event){

    }

    @FXML
    void initialize() {
        assert buttonBuscarDoacoes != null : "fx:id=\"buttonBuscarDoacoes\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        assert buttonOpcaoAdicionarDoacoes != null : "fx:id=\"buttonOpcaoAdicionarDoacoes\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        assert buttonOpcaoMinhasAquisicoes != null : "fx:id=\"buttonOpcaoMinhasAquisicoes\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        assert buttonOpcaoMinhasDoacoes != null : "fx:id=\"buttonOpcaoMinhasDoacoes\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        assert buttonSairConta != null : "fx:id=\"buttonSairConta\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        assert panePesquisarDoacoes != null : "fx:id=\"panePesquisarDoacoes\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        assert tableViewResultadoPesquisa != null : "fx:id=\"tableViewResultadoPesquisa\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        assert textFieldPesquisa != null : "fx:id=\"textFieldPesquisa\" was not injected: check your FXML file 'PesquisarDoacoesView.fxml'.";
        if(Session.getSession().getUsuario() == null)
            stageManager.switchScene(FxmlView.LOGIN);

        descricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        nome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        doador.setCellValueFactory(new PropertyValueFactory<>("doador"));

        tableViewResultadoPesquisa.setItems(FXCollections.observableArrayList(doacaoService.getDoacoesAtivas()));


    }

}
