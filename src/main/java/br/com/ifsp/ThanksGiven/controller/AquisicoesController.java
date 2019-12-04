package br.com.ifsp.ThanksGiven.controller;

import static br.com.ifsp.ThanksGiven.ThanksGivenApplication.stageManager;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.ifsp.ThanksGiven.config.Session;
import br.com.ifsp.ThanksGiven.models.DoacaoDTO;
import br.com.ifsp.ThanksGiven.service.DoacaoService;
import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

@Controller
public class AquisicoesController {

    @Autowired
    private DoacaoService doacaoService;
    @FXML
    private URL location;

    @FXML
    private Button buttonSairConta;

    @FXML
    private Button buttonSairConta1;

    @FXML
    private Label labelVoltarPesquisarDoacoes;

    @FXML
    private AnchorPane paneMinhasAquisicoes;

    @FXML
    private TableView<DoacaoDTO> tableViewMinhasAquisicoes;

    @FXML
    private TableColumn<DoacaoDTO, String> doadorCol;
    @FXML
    private TableColumn<DoacaoDTO, String> itemCol;
    @FXML
    private TableColumn<DoacaoDTO, Boolean> descricaoCol;


    @FXML
    void clickOpenChoices(MouseEvent event) {
    }

    @FXML
    void clickSairConta(MouseEvent event) {
        stageManager.switchScene(FxmlView.LOGIN);
    }

    @FXML
    void clickVoltarPesquisarDoacoesPane(MouseEvent event) {
        stageManager.switchScene(FxmlView.PESQUISARDOACOES);
    }

    @FXML
    void initialize() {

        descricaoCol.setCellValueFactory(new PropertyValueFactory<>("descricaoDoacao"));
        itemCol.setCellValueFactory(new PropertyValueFactory<>("tituloDoacao"));
        doadorCol.setCellValueFactory(new PropertyValueFactory<>("doadorNome"));

        tableViewMinhasAquisicoes.setItems(FXCollections.observableArrayList(doacaoService.buscaMinhasAquisicoes(Session.getUsuario())));
    }

}
