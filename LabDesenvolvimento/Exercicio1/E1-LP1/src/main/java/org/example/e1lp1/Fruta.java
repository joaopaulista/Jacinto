package org.example.e1lp1;

import javafx.scene.control.Label;

public class Fruta {

    private String formato;
    private String cor;
    private String textura;

    //Construtor
    public Fruta(String formato, String cor, String textura) {
        this.formato = formato;
        this.cor = cor;
        this.textura = textura;
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

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura){
        this.textura = textura;
    }

    //MÉTODOS
    public void comer(Label messageLabel) {
        messageLabel.setText("Hmmm, delícia.");
    }

    public void lavar(Label messageLabel) {
        messageLabel.setText("Lavando a fruta...");
    }

    public void pegar(Label messageLabel) {
        messageLabel.setText("Pegando a fruta...");
    }

    //Método Exibir Informações Frutas
    public String toString() {
        return "fruta [formato=" + formato + ", cor=" + cor + ", textura=" + textura + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Fruta frutas = new Fruta("esfera", "vermelho", "lisa");

        Label messageLabel = new Label();

        System.out.println(frutas);
        System.out.println(messageLabel.getText());
    }
}
