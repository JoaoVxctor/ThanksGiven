package br.com.ifsp.ThanksGiven.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import br.com.ifsp.ThanksGiven.ThanksGivenApplication;
import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

@Controller
public class MinhasDoacoesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonSairConta;

    @FXML
    private Label labelVoltarPesquisarDoacoes;

    @FXML
    private AnchorPane paneMinhasDoacoes;

    @FXML
    private TableView<?> tableViewMinhasDoacoes;


    @FXML
    void clickSairConta(MouseEvent event) {
    	ThanksGivenApplication.stageManager.switchScene(FxmlView.LOGIN);
    }

    @FXML
    void clickVoltarPesquisarDoacoesPane(MouseEvent event) {
    	ThanksGivenApplication.stageManager.switchScene(FxmlView.PESQUISARDOACOES);
    }

    @FXML
    void initialize() {
        assert buttonSairConta != null : "fx:id=\"buttonSairConta\" was not injected: check your FXML file 'MinhasDoacoesView.fxml'.";
        assert labelVoltarPesquisarDoacoes != null : "fx:id=\"labelVoltarPesquisarDoacoes\" was not injected: check your FXML file 'MinhasDoacoesView.fxml'.";
        assert paneMinhasDoacoes != null : "fx:id=\"paneMinhasDoacoes\" was not injected: check your FXML file 'MinhasDoacoesView.fxml'.";
        assert tableViewMinhasDoacoes != null : "fx:id=\"tableViewMinhasDoacoes\" was not injected: check your FXML file 'MinhasDoacoesView.fxml'.";


    }

}
