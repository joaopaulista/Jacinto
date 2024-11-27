package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class BolasController {

    @FXML
    private Label messageLabel;

    @FXML
    private ImageView imageView;

    private Bolas bolas;

    public void initialize() {
        bolas = new Bolas("Esfera", "Preta", "Borracha");
    }

    // FUNÇÕES DOS BOTÕES
    @FXML
    protected void onChutarButtonClick() {
        bolas.chutar(messageLabel, imageView);
    }

    @FXML
    protected void onJogarButtonClick() {
        bolas.jogar(messageLabel);
    }

    @FXML
    protected void onPegarBButtonClick() {
        bolas.pegar(messageLabel);
    }

    @FXML
    protected void onBackButtonClick() throws IOException {
        // CARREGA A TELA INICIAL
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("start-screen.fxml"));
        Parent root = fxmlLoader.load();

        // PROPORÇÕES PARA A TROCA DE TELA - STAGE
        Stage stage = (Stage) messageLabel.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }
}
