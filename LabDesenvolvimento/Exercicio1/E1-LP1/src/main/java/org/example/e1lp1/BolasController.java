package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BolasController {

    @FXML
    private Label messageLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField CampoFormatoBola;

    @FXML
    private TextField CampoCorBola;

    @FXML
    private TextField CampoMaterialBola;

    private Bolas bolas;

    public void initialize() {
        bolas = new Bolas("Esfera", "Branca", "Metal");
    }
    // Função para quando o botão "Enviar" for clicado
    @FXML
    protected void onEnviarBola() {
        // Obter os valores dos campos de texto
        String formato = CampoFormatoBola.getText();
        String cor = CampoCorBola.getText();
        String material = CampoMaterialBola.getText();

        // Verificar se os campos estão preenchidos
        if (formato.isEmpty() || cor.isEmpty() || material.isEmpty()) {
            messageLabel.setText("Preencha todos os campos antes de enviar.");
            return;
        }

        // Criar um novo objeto Bola com os dados fornecidos pelo usuário
        Bolas novaBola = new Bolas(formato, cor, material);

        // Enviar para o banco de dados
        BolasDAO bolasDAO = new BolasDAO();
        bolasDAO.salvarBola(novaBola);

        // Exibir mensagem de sucesso
        messageLabel.setText("Bola salva com sucesso!");

        // Limpar os campos após salvar
        CampoFormatoBola.clear();
        CampoCorBola.clear();
        CampoMaterialBola.clear();
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
