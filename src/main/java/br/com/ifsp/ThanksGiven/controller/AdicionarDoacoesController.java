package br.com.ifsp.ThanksGiven.controller;

import br.com.ifsp.ThanksGiven.ThanksGivenApplication;
import br.com.ifsp.ThanksGiven.config.Session;
import br.com.ifsp.ThanksGiven.models.Doacao;
import br.com.ifsp.ThanksGiven.models.Endereco;
import br.com.ifsp.ThanksGiven.models.Usuario;
import br.com.ifsp.ThanksGiven.service.DoacaoService;
import br.com.ifsp.ThanksGiven.view.FxmlView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import org.springframework.stereotype.Controller;

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
							new Endereco(
									endereco.getText()
							),
							true
					)
			);
            ThanksGivenApplication.stageManager.switchScene(FxmlView.MINHASDOACOES);
        } catch (Exception e) {

        }
	}
}
