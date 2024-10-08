package org.example.e1lp1;

import javafx.scene.control.Label;

public class Plantas {

    private String formato;
    private String cor;
    private String folhagem;

    //Construtor
    public Plantas(String formato, String cor, String folhagem) {
        this.formato = formato;
        this.cor = cor;
        this.folhagem = folhagem;
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

    public String getFolhagem() {
        return folhagem;
    }

    public void setFolhagem(String folhagem){
        this.folhagem = folhagem;
    }

    //MÉTODOS
    public void cheirar(Label messageLabel) {
        messageLabel.setText("Cheirando as plantas...");
    }

    public void regar(Label messageLabel) {
        messageLabel.setText("Regando as plantas...");
    }

    public void pegar(Label messageLabel) {
        messageLabel.setText("Pegando as plantas...");
    }

    //Método Exibir Informações Plantas
    public String toString() {
        return "plantas [formato=" + formato + ", cor=" + cor + ", folhagem=" + folhagem + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Plantas plantas = new Plantas("esfera retangular", "verde escuro", "seca");
        Label messageLabel = new Label();

        System.out.println(plantas);
        System.out.println(messageLabel.getText());
    }
}