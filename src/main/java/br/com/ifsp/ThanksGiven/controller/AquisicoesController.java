package br.com.ifsp.ThanksGiven.controller;

import static br.com.ifsp.ThanksGiven.ThanksGivenApplication.stageManager;

import java.net.URL;
import java.util.ResourceBundle;

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
    private TableView<?> tableViewMinhasDoacoes;


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
        assert buttonSairConta != null : "fx:id=\"buttonSairConta\" was not injected: check your FXML file 'AquisitionView.fxml'.";
        assert buttonSairConta1 != null : "fx:id=\"buttonSairConta1\" was not injected: check your FXML file 'AquisitionView.fxml'.";
        assert labelVoltarPesquisarDoacoes != null : "fx:id=\"labelVoltarPesquisarDoacoes\" was not injected: check your FXML file 'AquisitionView.fxml'.";
        assert paneMinhasAquisicoes != null : "fx:id=\"paneMinhasAquisicoes\" was not injected: check your FXML file 'AquisitionView.fxml'.";
        assert tableViewMinhasDoacoes != null : "fx:id=\"tableViewMinhasDoacoes\" was not injected: check your FXML file 'AquisitionView.fxml'.";


    }

}
