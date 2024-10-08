package org.example.e1lp1;

import javafx.scene.control.Label;

public class Bolas {

    private String formato;
    private String cor;
    private String material;

    //Construtor
    public Bolas(String formato, String cor, String material) {
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
    public void chutar(Label messageLabel) {
        messageLabel.setText("Golaçooo...");
    }

    public void jogar(Label messageLabel) {
        messageLabel.setText("Jogar demais, craque.");
    }

    public void pegar(Label messageLabel) {
        messageLabel.setText("Penalti");
    }

    //Método Exibir Informações Bolas
    public String toString() {
        return "bolas [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Label messageLabel = new Label();
        Bolas bolas = new Bolas("esfera", "preto", "borracha");

        System.out.println(bolas);
        System.out.println(messageLabel.getText());
    }
}
