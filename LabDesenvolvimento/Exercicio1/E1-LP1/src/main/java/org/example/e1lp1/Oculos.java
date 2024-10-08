package org.example.e1lp1;

import javafx.scene.control.Label;

public class Oculos {

    private String formato;
    private String cor;
    private String material;

    //Construtor
    public Oculos(String formato, String cor, String material) {
        this.formato = formato;
        this.cor = cor;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    //MÉTODOS
    public void usar(Label messageLabel) {
        messageLabel.setText("Usando óculos.");
    }

    public void vender(Label messageLabel) {
        messageLabel.setText("Óculos vendido.");
    }

    public void comprar(Label messageLabel) {
        messageLabel.setText("Óculos adquirido.");
    }

    //Método Exibir Informações Óculos
    public String toString() {
        return "óculos [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Oculos oculos = new Oculos("redondo", "branco", "plástico");

        Label messageLabel = new Label();

        System.out.println(oculos);
        System.out.println(messageLabel.getText());
    }
}
