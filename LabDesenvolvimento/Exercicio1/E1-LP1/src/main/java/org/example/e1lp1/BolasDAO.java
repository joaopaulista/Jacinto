package org.example.e1lp1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
