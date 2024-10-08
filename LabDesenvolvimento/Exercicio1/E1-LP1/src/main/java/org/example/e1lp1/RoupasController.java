package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class RoupasController {

    @FXML
    private Label messageLabel;

    @FXML
    private ImageView imageView;

    private Roupas roupas;

    public void initialize() {
        roupas = new Roupas("Esfera", "Verde", "Áspera");
    }

    @FXML
    protected void onVestirButtonClick() {
        roupas.vestir(messageLabel);
    }

    @FXML
    protected void onLavarButtonClick() {
        roupas.lavar(messageLabel);
    }

    @FXML
    protected void onGuardarButtonClick() {
        roupas.guardar(messageLabel);
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