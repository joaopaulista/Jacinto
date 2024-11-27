package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class CaminhaoController {

    public javafx.scene.image.ImageView imageView;
    @FXML
    private Label messageLabel;

    @FXML
    private ImageView ImageView;

    private Caminhao caminhao;

    public void initialize() {
        caminhao = new Caminhao("Scania", "Verde", "3"); // Inicializa o cachorro
    }

    @FXML
    protected void onDirigirButtonClick() {
        caminhao.dirigir(messageLabel);
    }

    @FXML
    protected void onAbastecerButtonClick() {
        caminhao.abastecer(messageLabel);
    }

    @FXML
    protected void onDesligarButtonClick() {
        caminhao.desligar(messageLabel);
    }

    @FXML
    protected void onBackButtonClick() throws IOException {
        // CARREGA A TELA INICIAL
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("start-screen.fxml"));
        Parent root = fxmlLoader.load();

        // TROCA A TELA
        Stage stage = (Stage) messageLabel.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }
}
