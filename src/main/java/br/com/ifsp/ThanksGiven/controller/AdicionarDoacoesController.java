package br.com.ifsp.ThanksGiven.controller;

import br.com.ifsp.ThanksGiven.ThanksGivenApplication;
import br.com.ifsp.ThanksGiven.config.Session;
import br.com.ifsp.ThanksGiven.models.Doacao;
import br.com.ifsp.ThanksGiven.models.Endereco;
import br.com.ifsp.ThanksGiven.models.Item;
import br.com.ifsp.ThanksGiven.models.Usuario;
import br.com.ifsp.ThanksGiven.service.DoacaoService;
import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.File;

@Controller
public class AdicionarDoacoesController {

    @Autowired
    private DoacaoService doacaoService;

    @FXML
    private Pane paneAdicionarDoacao;

    @FXML
    private Button buttonSalvar;

    @FXML
    private Font contornoInserir;

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextArea descricaoTextField;


    @FXML
    private Label produtoLabel;

    @FXML
    private Font nomeLabel;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Font contornoCancelar;

    @FXML
    private Font enderecoLabel;

    @FXML
    private Button buttonAdicionarImagem;

    @FXML
    private Font contornoAdicionarImagem;

    @FXML
    private TextField ruaTextField;

    @FXML
    private TextField cepTextField;

    @FXML
    private TextField municipioTextField;

    @FXML
    private ComboBox<String> estadoComboBox;

    @FXML
    private TextField numeroTextField;


    @FXML
    private TextField complementoTextField;

    private File imagem;

    @FXML
    void clickAdicionarDoacao(MouseEvent event) {
        try {
            Usuario doador = Session.getSession().getUsuario();
            Doacao novaDoacao = doacaoService.cadastraDoacao(
                    new Doacao(
                            doador,
                            new Endereco(
                                    ruaTextField.getText(),
                                    municipioTextField.getText(),
                                    estadoComboBox.getValue(),
                                    cepTextField.getText(),
                                    numeroTextField.getText(),
                                    complementoTextField.getText()
                            ),
                            new Item(nomeTextField.getText(),
                                    descricaoTextField.getText(),
                                    imagem.getAbsolutePath(),
                                    Session.getSession().getUsuario()
                            )
                    )
            );
            ThanksGivenApplication.stageManager.switchScene(FxmlView.MINHASDOACOES);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void clickAdicionarImagem(MouseEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("JPG", "*.jpg"), new FileChooser.ExtensionFilter("PNG", "*.png"));
        File selected = fileChooser.showOpenDialog(null);

        if (selected != null) {
            buttonAdicionarImagem.setText("Imagem Selecionada!");
            buttonAdicionarImagem.setStyle("-fx-background-color: #27ae60; -fx-border-color: #27ae60; -fx-border-radius: 5px");
            imagem = selected;
        }

    }

    @FXML
    void clickCancelarDoacao(MouseEvent event) {
        ThanksGivenApplication.stageManager.switchScene(FxmlView.PESQUISARDOACOES);
    }

    @FXML
    void initialize() {
        estadoComboBox.setItems(FXCollections.observableArrayList(
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"
        ));
    }
}
