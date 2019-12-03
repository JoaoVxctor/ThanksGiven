package br.com.ifsp.ThanksGiven.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.ifsp.ThanksGiven.config.Session;
import javafx.scene.image.Image;
import org.springframework.stereotype.Controller;


import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import javax.imageio.ImageIO;

import static br.com.ifsp.ThanksGiven.ThanksGivenApplication.stageManager;


@Controller
public class DetalhesDoacoesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button buttonSairConta;

    @FXML
    private ImageView imageViewImagemProduto;

    @FXML
    private Label labelDescricaoDoProduto;

    @FXML
    private Label labelNomeDoProduto;

    @FXML
    private Label labelVoltarPesquisarDoacoes;

    @FXML
    private AnchorPane paneDetalhesDoacoes;


    @FXML
    void clickSairConta(MouseEvent event) {
        Session.setUsuario(null);
    	stageManager.switchScene(FxmlView.LOGIN);
    }

    @FXML
    void clickVoltarPesquisarDoacoesPane(MouseEvent event) {
    	stageManager.switchScene(FxmlView.PESQUISARDOACOES);
    }

    @FXML
    void clickCancelarDoacao(){
        stageManager.switchScene(FxmlView.PESQUISARDOACOES);
    }

    @FXML
    void initialize() throws IOException {
        assert buttonSairConta != null : "fx:id=\"buttonSairConta\" was not injected: check your FXML file 'VisualizarDoacaoView.fxml'.";
        assert imageViewImagemProduto != null : "fx:id=\"imageViewImagemProduto\" was not injected: check your FXML file 'VisualizarDoacaoView.fxml'.";
        assert labelDescricaoDoProduto != null : "fx:id=\"labelDescricaoDoProduto\" was not injected: check your FXML file 'VisualizarDoacaoView.fxml'.";
        assert labelNomeDoProduto != null : "fx:id=\"labelNomeDoProduto\" was not injected: check your FXML file 'VisualizarDoacaoView.fxml'.";
        assert labelVoltarPesquisarDoacoes != null : "fx:id=\"labelVoltarPesquisarDoacoes\" was not injected: check your FXML file 'VisualizarDoacaoView.fxml'.";
        assert paneDetalhesDoacoes != null : "fx:id=\"paneDetalhesDoacoes\" was not injected: check your FXML file 'VisualizarDoacaoView.fxml'.";

        String pathImagem = Session.getDoacao().getItem().getPathImagem();
        Image image = new Image("file:"+pathImagem,true);

        labelDescricaoDoProduto.setText(Session.getDoacao().getItem().getDescricao());
        labelNomeDoProduto.setText(Session.getDoacao().getItem().getTitulo());
        imageViewImagemProduto.setImage(image);
    }

}
