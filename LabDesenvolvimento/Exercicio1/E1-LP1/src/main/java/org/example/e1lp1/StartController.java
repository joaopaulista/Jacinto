package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class StartController {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onChuteirasButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("footballboots-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onBolaButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ball-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onCachorroButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dog-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onCaminhaoButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("truck-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onEscudoButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("shield-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onFrutaButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fruits-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onOculosButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("glasses-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onPanelaButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pots-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onPlantaButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("plants-screen.fxml"));
        Parent root = fxmlLoader.load();

        // Cria uma nova cena e a exibe
        Stage stage = (Stage) welcomeText.getScene().getWindow();
        stage.setScene(new Scene(root, 900, 500));
    }

    @FXML
    protected void onRoupaButtonClick() throws IOException {
        // Carrega a nova tela
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("clothes-screen.fxml"));
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