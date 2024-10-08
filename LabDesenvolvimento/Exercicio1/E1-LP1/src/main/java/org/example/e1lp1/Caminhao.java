package org.example.e1lp1;

import javafx.scene.control.Label;

public class Caminhao {

    private String marca;
    private String cor;
    private String eixos;

    //Construtor
    public Caminhao(String marca, String cor, String eixos) {
        this.marca = marca;
        this.cor = cor;
        this.eixos = eixos;
    }

    //ATRIBUTOS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEixos() {
        return eixos;
    }

    public void setEixos(String eixos){
        this.eixos = eixos;
    }

    //MÉTODOS
    public void dirigir(Label messageLabel) {
        messageLabel.setText("Dirigindo o caminhão...");
    }

    public void abastecer(Label messageLabel) {
        messageLabel.setText("Abastecendo o tanque do caminhão...");
    }

    public void desligar(Label messageLabel) {
        messageLabel.setText("Desligando o caminhão...");
    }

    //Método Exibir Informações Caminhão
    public String toString() {
        return "caminhao [marca=" + marca + ", cor=" + cor + ", eixos=" + eixos + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Label messageLabel = new Label();
        Caminhao caminhao = new Caminhao("Scania", "verde", "3");

        System.out.println(caminhao);
        System.out.println(messageLabel.getText());
    }
}
