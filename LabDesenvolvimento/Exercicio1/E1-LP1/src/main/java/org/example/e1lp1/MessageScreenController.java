package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class MessageScreenController {

    @FXML
    private Label messageLabel;

    @FXML
    private ImageView imageView;

    @FXML
    protected void onShowMessageButtonClick() {
        messageLabel.setText("Esta é uma mensagem simples!");

        // Carrega uma imagem (substitua pelo caminho da sua imagem)
        Image image = new Image("file:path/to/your/image.png"); // Use o caminho correto
        imageView.setImage(image);
    }

    @FXML
    protected void onBackButtonClick() throws IOException {
        // Carrega a tela inicial
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view-platform.fxml"));
        Parent root = fxmlLoader.load();

        // Obtém a janela atual e troca a cena
        Stage stage = (Stage) messageLabel.getScene().getWindow(); // Usa qualquer componente para obter a Stage
        stage.setScene(new Scene(root, 900, 500));
    }
}