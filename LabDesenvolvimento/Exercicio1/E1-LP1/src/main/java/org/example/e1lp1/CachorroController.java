package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class CachorroController {

    @FXML
    private Label messageLabel;

    @FXML
    private ImageView imageView;

    private Cachorro cachorro;

    public void initialize() {
        cachorro = new Cachorro("Golden", "Marrom", "Grande"); // Inicializa o cachorro
    }

    @FXML
    protected void onBrincarButtonClick() {
        cachorro.brincar(messageLabel);
    }

    @FXML
    protected void onDarAComerButtonClick() {
        cachorro.comer(messageLabel);
    }

    @FXML
    protected void onDeitarButtonClick() {
        cachorro.deitar(messageLabel);
    }

    @FXML
    protected void onBackButtonClick() throws IOException {
        // Carrega a tela inicial
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("start-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Obtém a janela atual e troca a cena
        Stage stage = (Stage) messageLabel.getScene().getWindow(); // Usa qualquer componente para obter a Stage
        stage.setScene(new Scene(root, 900, 500));
    }
}