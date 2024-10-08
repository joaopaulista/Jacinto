package org.example.e1lp1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Escudo {

    private String formato;
    private String cor;
    private String simbolo;

    //Construtor
    public Escudo(String formato, String cor, String simbolo) {
        this.formato = formato;
        this.cor = cor;
        this.simbolo = simbolo;
    }

    //ATRIBUTOS
    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }

    //MÉTODOS
    public void torcer(Label messageLabel) {
        messageLabel.setText("Vamos timeee!!!");
    }

    public void irar(Label messageLabel) {
        messageLabel.setText("Ai não dá, quem joga assim!?");
    }

    public void entristecer(Label messageLabel) {
        messageLabel.setText("Desisto desse time.");
    }

    //Método Exibir Informações Escudo
    public String toString() {
        return "bolas [formato=" + formato + ", cor=" + cor + ", simbolo=" + simbolo + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Escudo escudo = new Escudo("esfera", "cinza", "escudo");

        Label messageLabel = new Label();

        System.out.println(escudo);
        System.out.println(messageLabel.getText());
    }
}

