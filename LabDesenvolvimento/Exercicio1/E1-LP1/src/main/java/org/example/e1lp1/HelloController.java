package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onShowMessageScreenButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("message-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onExitButtonClick() {
        System.exit(0);
    }
}