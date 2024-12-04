package org.example.e1lp1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class BolasDAO {
    public void salvarBola(Bolas bola) {
        String sql = "INSERT INTO bolas (formato, cor, material) VALUES (?, ?, ?)";

        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, bola.getFormato());
            stmt.setString(2, bola.getCor());
            stmt.setString(3, bola.getMaterial());
            stmt.executeUpdate();

            System.out.println("Bola salva com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Bolas> getBolas() {
        ObservableList<Bolas> listaBolas = FXCollections.observableArrayList();
        String sql = "SELECT id, formato, cor, material FROM bolas";

        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String formato = rs.getString("formato");
                String cor = rs.getString("cor");
                String material = rs.getString("material");

                Bolas bola = new Bolas(formato, cor, material);
                bola.setId(id);  // Certificando-se de que o ID está correto ao carregar os dados
                listaBolas.add(bola);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaBolas;
    }

    public boolean atualizarBola(int id, String formato, String cor, String material) {
        Connection con = null;
        boolean sucesso = false;

        try {
            con = ConnectionDB.getConnection();
            String updateSql = "UPDATE bolas SET formato = ?, cor = ?, material = ? WHERE id = ?";
            PreparedStatement pst = con.prepareStatement(updateSql);

            // Setando os parâmetros no PreparedStatement
            pst.setString(1, formato);
            pst.setString(2, cor);
            pst.setString(3, material);
            pst.setInt(4, id);

            // Executando a atualização
            int rowsAffected = pst.executeUpdate();

            // Verificando se a atualização foi bem-sucedida
            if (rowsAffected > 0) {
                sucesso = true; // Atualização foi bem-sucedida
                System.out.println("Bola com ID " + id + " atualizada com sucesso.");
            } else {
                // Se nenhuma linha foi afetada, lança uma exceção indicando que o ID não foi encontrado
                throw new RuntimeException("Nenhuma bola encontrada com o ID fornecido: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao atualizar bola: " + e.getMessage(), e);
        } finally {
            try {
                if (con != null) con.close(); // Fechando a conexão
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Erro ao fechar conexão: " + e.getMessage(), e);
            }
        }

        return sucesso; // Retorna true se a atualização foi bem-sucedida, false caso contrário
    }



    public void deletarBola(int id) {
        String sql = "DELETE FROM bolas WHERE id = ?";

        try (Connection conn = ConnectionDB.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected == 0) {
                System.out.println("Nenhuma bola foi excluída, verifique o ID.");
            } else {
                System.out.println("Bola excluída com sucesso!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
