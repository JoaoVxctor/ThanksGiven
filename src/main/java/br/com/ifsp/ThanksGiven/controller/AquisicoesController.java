package br.com.ifsp.ThanksGiven.controller;

import static br.com.ifsp.ThanksGiven.ThanksGivenApplication.stageManager;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.ifsp.ThanksGiven.models.DoacaoDTO;
import javafx.scene.control.TableColumn;
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
    private TableColumn<DoacaoDTO, String> produtoCol;
    @FXML
    private TableColumn<DoacaoDTO, Boolean> estadoCol;


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


    }

}
