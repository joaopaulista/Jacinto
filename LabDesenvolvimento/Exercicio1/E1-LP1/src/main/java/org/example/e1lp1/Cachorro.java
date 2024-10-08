package org.example.e1lp1;

import javafx.scene.control.Label;

public class Cachorro {

    private String raca;
    private String cor;
    private String porte;

    //Construtor
    public Cachorro(String raca, String cor, String porte) {
        this.raca = raca;
        this.cor = cor;
        this.porte = porte;
    }

    //ATRIBUTOS
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte){
        this.porte = porte;
    }

    //MÉTODOS
    public void brincar(Label messageLabel) {
        messageLabel.setText("Brincando com o cachorro...");
    }

    public void deitar(Label messageLabel) {
        messageLabel.setText("*Cachorro deitando*");
    }

    public void comer(Label messageLabel) {
        messageLabel.setText("*Cachorro comendo*");
    }

    //Método Exibir Informações Cachorros
    public String toString() {
        return "cachorro [raca=" + raca + ", cor=" + cor + ", porte=" + porte + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {

        Label messageLabel = new Label();
        Cachorro cachorro = new Cachorro("Golden", "Marrom", "Grande");

        System.out.println(cachorro);
        System.out.println(messageLabel.getText());
    }
}
