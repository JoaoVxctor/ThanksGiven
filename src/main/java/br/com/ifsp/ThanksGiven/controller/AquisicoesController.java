package br.com.ifsp.ThanksGiven.controller;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
@Controller
public class AquisicoesController {

	@FXML
	private Pane MyAquisitionsPane;

	@FXML
	private ChoiceBox<?> CBEstadoAquis;

	@FXML
	private Button ButtonConfirmar;

	@FXML
	private Font x2;

	@FXML
	void ClickConfirmaEstado(MouseEvent event) {

	}

	@FXML
	void GoBackAction(MouseEvent event) {

	}

	@FXML
	void SelectOption(MouseEvent event) {

	}

}
