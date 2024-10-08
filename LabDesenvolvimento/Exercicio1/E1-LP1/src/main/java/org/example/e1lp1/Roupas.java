package org.example.e1lp1;

import javafx.scene.control.Label;

public class Roupas {

    private String formato;
    private String cor;
    private String tecido;

    //Construtor
    public Roupas(String formato, String cor, String tecido) {
        this.formato = formato;
        this.cor = cor;
        this.tecido = tecido;
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

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido){
        this.tecido = tecido;
    }

    //MÉTODOS
    public void vestir(Label messageLabel) {
        messageLabel.setText("Vestindo a roupa...");
    }

    public void lavar(Label messageLabel) {
        messageLabel.setText("Lavando a roupa...");
    }

    public void guardar(Label messageLabel) {
        messageLabel.setText("Guardando a roupa...");
    }

    //Método Exibir Informações Roupas
    public String toString() {
        return "roupas [formato=" + formato + ", cor=" + cor + ", tecido=" + tecido + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Roupas roupas = new Roupas("camiseta", "verde claro", "algodão");
        Label messageLabel = new Label();

        System.out.println(messageLabel.getText());
        System.out.println(roupas);
    }
}
