package br.com.ifsp.ThanksGiven.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.com.ifsp.ThanksGiven.config.Session;
import br.com.ifsp.ThanksGiven.service.DoacaoService;
import javafx.scene.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DoacaoService doacaoService;
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
    private Button solicitarDoacaoButton;



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
    void clickSolicitarDoacao(){
        if(Session.getDoacao().isDisponivel()){
            doacaoService.solicitarDoacao(Session.getDoacao(),Session.getUsuario());
            stageManager.switchScene(FxmlView.AQUISICOES);
        }else{
            solicitarDoacaoButton.setStyle("-fx-background-color: #e74c3c; -fx-border-color: #e74c3c; -fx-border-radius: 5px");
            solicitarDoacaoButton.setText("INDISPONIVEL!");
        }
    }
    @FXML
    void initialize() throws IOException {

        if (Session.getUsuario() == Session.getDoacao().getDoador())
            solicitarDoacaoButton.setVisible(false);

        String pathImagem = Session.getDoacao().getItem().getPathImagem();
        Image image = new Image("file:"+pathImagem,true);

        labelDescricaoDoProduto.setText(Session.getDoacao().getItem().getDescricao());
        labelNomeDoProduto.setText(Session.getDoacao().getItem().getTitulo());
        imageViewImagemProduto.setImage(image);
    }

}
