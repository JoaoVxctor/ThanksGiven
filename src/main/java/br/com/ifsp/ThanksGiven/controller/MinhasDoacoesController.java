package br.com.ifsp.ThanksGiven.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.ifsp.ThanksGiven.config.Session;
import br.com.ifsp.ThanksGiven.models.DoacaoDTO;
import br.com.ifsp.ThanksGiven.service.DoacaoService;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.scene.control.cell.PropertyValueFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.ifsp.ThanksGiven.ThanksGivenApplication;
import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import static br.com.ifsp.ThanksGiven.ThanksGivenApplication.stageManager;

@Controller
public class MinhasDoacoesController {

    private DoacaoService doacaoService;

    @Autowired
    public MinhasDoacoesController(DoacaoService doacaoService) {
        this.doacaoService = doacaoService;
    }

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
    private TableView<DoacaoDTO> tableViewMinhasDoacoes;

    @FXML
    private TableColumn<DoacaoDTO, String> receptorCol;
    @FXML
    private TableColumn<DoacaoDTO, String> produtoCol;
    @FXML
    private TableColumn<DoacaoDTO, Boolean> estadoCol;

    @FXML
    void clickSairConta(MouseEvent event) {
    	ThanksGivenApplication.stageManager.switchScene(FxmlView.LOGIN);
    }

	
	@FXML 
	void clickVoltarPesquisarDoacoesPane(MouseEvent event) {
		ThanksGivenApplication.stageManager.switchScene(FxmlView.PESQUISARDOACOES);
	}
	

    @FXML
    void doacaoClick(){}

    @FXML
    void initialize() {
        if (Session.getUsuario() == null)
            stageManager.switchScene(FxmlView.LOGIN);

        produtoCol.setCellValueFactory(new PropertyValueFactory<>("tituloDoacao"));
        estadoCol.setCellValueFactory(new PropertyValueFactory<>("disponibilidade"));
        receptorCol.setCellValueFactory(new PropertyValueFactory<>("receptorNome"));

        tableViewMinhasDoacoes.setItems(FXCollections.observableArrayList(doacaoService.buscaMinhasDoacoes(Session.getUsuario())));
    }

}
