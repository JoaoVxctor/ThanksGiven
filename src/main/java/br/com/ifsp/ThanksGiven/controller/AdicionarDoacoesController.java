package br.com.ifsp.ThanksGiven.controller;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

@Controller
public class AdicionarDoacoesController {

	private DoacaoService doacaoService;

	@FXML
	private Pane paneLogin;

	@FXML
	private Button buttonEntrar;

	@FXML
	private Font x2;

	@FXML
	private Font nome;

	@FXML
	private Font descricao;

	@FXML
	private Font endereco;

	@FXML
	private Font imagem;

	@FXML
	void GoBackAction(MouseEvent event) {

	}

	@FXML
	void clickAdicionarDoacao(MouseEvent event) {
 		try {
				Usuario doador = Session.getSession().getUsuario();
				Doacao novaDoacao = doacaoService.cadastraDoacao(
					new Doacao(
						doador,
						nome.getText(),
						descricao.getText(), 
						new Endereco (
							endereco.getText()
						),
						True
					)
			);
            ThanksGivenApplication.stageManager.switchScene(FxmlView.MINHASDOACOES);
        } catch (UsuarioException e) {
            //exibir mensagem para verificar campos
        }
	}
}
