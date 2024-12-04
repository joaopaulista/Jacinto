package org.example.e1lp1;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class BolasController {

    @FXML
    private Label messageLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private TextField CampoFormatBola;

    @FXML
    private TextField CampoCorBola;

    @FXML
    private TextField CampoMaterialBola;

    @FXML
    private TableView<Bolas> tableViewBolas;

    @FXML
    private TableColumn<Bolas, String> colFormato;

    @FXML
    private TableColumn<Bolas, String> colCor;

    @FXML
    private TableColumn<Bolas, String> colMaterial;

    private Bolas bolas;

    public void initialize() {

        bolas = new Bolas("esfera", "preto", "borracha");

        tableViewBolas.setEditable(true);
        // Configurar as colunas
        colFormato.setCellValueFactory(new PropertyValueFactory<>("formato"));
        colCor.setCellValueFactory(new PropertyValueFactory<>("cor"));
        colMaterial.setCellValueFactory(new PropertyValueFactory<>("material"));

        // Permitir edição
        colFormato.setCellFactory(TextFieldTableCell.forTableColumn());
        colCor.setCellFactory(TextFieldTableCell.forTableColumn());
        colMaterial.setCellFactory(TextFieldTableCell.forTableColumn());

        // Configurar eventos de edição
//        colFormato.setOnEditCommit(event -> editarColuna(event, "formato"));
//        colCor.setOnEditCommit(event -> editarColuna(event, "cor"));
//        colMaterial.setOnEditCommit(event -> editarColuna(event, "material"));

        // Configurar as colunas para edição
        colFormato.setCellFactory(TextFieldTableCell.forTableColumn());
        colFormato.setOnEditCommit(event -> {
            Bolas bola = event.getRowValue();
            bola.setFormato(event.getNewValue());
            salvarAlteracoesNoBanco(bola);
        });

        colCor.setCellFactory(TextFieldTableCell.forTableColumn());
        colCor.setOnEditCommit(event -> {
            Bolas bola = event.getRowValue();
            bola.setCor(event.getNewValue());
            System.out.println("Editando bola com ID: " + bola.getId());  // Verificando o ID antes da edição
        });

        colMaterial.setCellFactory(TextFieldTableCell.forTableColumn());
        colMaterial.setOnEditCommit(event -> {
            Bolas bola = event.getRowValue();
            bola.setMaterial(event.getNewValue());
            System.out.println("Editando bola com ID: " + bola.getId());  // Verificando o ID antes da edição
        });

        // Carregar os dados iniciais na tabela
        atualizarTableView();
    }

    private void carregarDados() {
        BolasDAO bolasDAO = new BolasDAO();
        ObservableList<Bolas> listaBolas = bolasDAO.getBolas();
        tableViewBolas.setItems(listaBolas); // Associar os dados ao TableView correto
    }

    // Função para quando o botão "Enviar" for clicado
    @FXML
    protected void onEnviarBola() {
        // Obter os valores dos campos de texto
        String formato = CampoFormatBola.getText();
        String cor = CampoCorBola.getText();
        String material = CampoMaterialBola.getText();

        // Verificar se os campos estão preenchidos
        if (formato.isEmpty() || cor.isEmpty() || material.isEmpty()) {
            messageLabel.setText("Preencha todos os campos antes de enviar.");
            return;
        }

        // Criar um novo objeto Bola com os dados fornecidos pelo usuário
        int id = 0;
        Bolas novaBola = new Bolas(formato, cor, material);

        // Enviar para o banco de dados
        BolasDAO bolasDAO = new BolasDAO();
        bolasDAO.salvarBola(novaBola);

        // Atualizar TableView com novos dados
        carregarDados();

        // Exibir mensagem de sucesso
        messageLabel.setText("Bola salva com sucesso!");

        // Limpar os campos após salvar
        CampoFormatBola.clear();
        CampoCorBola.clear();
        CampoMaterialBola.clear();
    }

    @FXML
    protected void onSalvarTudo() {
        ObservableList<Bolas> bolasList = tableViewBolas.getItems();

        BolasDAO bolasDAO = new BolasDAO(); // Cria uma instância do BolasDAO
        // Atualiza cada bola no banco de dados
        for (Bolas bola : bolasList) {
            bolasDAO.atualizarBola(bola.getId(), bola.getFormato(), bola.getCor(), bola.getMaterial());
        }
        // Atualiza a TableView com os dados mais recentes do banco
        atualizarTableView();

        messageLabel.setText("Alterações salvas com sucesso!");
    }

    // Método genérico para editar uma coluna
//    private void editarColuna(TableColumn.CellEditEvent<Bolas, String> event, String coluna) {
//        Bolas bola = event.getRowValue(); // Objeto editado
//        String novoValor = event.getNewValue(); // Novo valor da célula
//
//        // Atualizar o atributo da bola
//        switch (coluna) {
//            case "formato" -> bola.setFormato(novoValor);
//            case "cor" -> bola.setCor(novoValor);
//            case "material" -> bola.setMaterial(novoValor);
//        }
//
//        // Atualizar no banco de dados
//        BolasDAO.atualizarBola(bola);
//        carregarDados(); // Atualizar a tabela com os dados mais recentes
//        messageLabel.setText("Bola atualizada no banco: " + bola);
//    }

    public void atualizarTableView() {
        BolasDAO dao = new BolasDAO();
        ObservableList<Bolas> bolasAtualizadas = dao.getBolas();
        tableViewBolas.setItems(bolasAtualizadas); // Atualiza a tabela com os novos dados
    }

    private void salvarAlteracoesNoBanco(Bolas bola) {
        BolasDAO bolasDAO = new BolasDAO();
        bolasDAO.atualizarBola(bola.getId(), bola.getFormato(), bola.getCor(), bola.getMaterial()); // Método para atualizar a bola no banco
        carregarDados(); // Atualizar TableView com dados atualizados
        messageLabel.setText("Alteração salva no banco de dados!");
    }

    @FXML
    protected void onExcluirBola() {
        // Obter a bola selecionada na tabela
        Bolas bolaSelecionada = tableViewBolas.getSelectionModel().getSelectedItem();

        // Verificar se uma bola foi selecionada
        if (bolaSelecionada == null) {
            messageLabel.setText("Selecione uma bola para excluir.");
            return;
        }

        // Excluir a bola selecionada
        BolasDAO bolasDAO = new BolasDAO();
        bolasDAO.deletarBola(bolaSelecionada.getId());

        // Atualizar a tabela
        carregarDados();

        // Exibir mensagem de sucesso
        messageLabel.setText("Bola excluída com sucesso!");
    }

    // FUNÇÕES DOS BOTÕES
    @FXML
    protected void onChutarButtonClick() {
        bolas.chutar(messageLabel);
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
