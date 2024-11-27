package org.example.e1lp1;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class Bolas {

    private String formato;
    private String cor;
    private String material;

    //CONSTRUTOR
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
    public void chutar(Label messageLabel, ImageView imageView) {
        messageLabel.setText("Golaçooo...");

        Image gif = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/gifs/ball1.gif")));
        imageView.setImage(gif);
    }

    public void jogar(Label messageLabel) {
        messageLabel.setText("Joga muito, craque.");
    }

    public void pegar(Label messageLabel) {
        messageLabel.setText("Penalti");
    }

    // MÉTODO EXIBIR INFORMAÇÕES BOLAS
    public String toString() {
        return "bolas [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    // MÉTODO PRINCIPAL TESTAR CLASSE
    public static void main(String[] args) {

        Label messageLabel = new Label();
        Bolas bolas = new Bolas("esfera", "preto", "borracha");

        System.out.println(bolas);
        System.out.println(messageLabel.getText());
    }
}
