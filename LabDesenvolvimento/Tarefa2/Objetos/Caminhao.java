package Tarefa2.Objetos;

public class Caminhao {
    //Atributos
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
    public void dirigir() {
        System.out.println("Dirigindo o caminhão...");
    }

    public void abastecer() {
        System.out.println("Abastecendo o tanque do camninhão...");
    }

    public void desligar() {
        System.out.println("Desligando o caminhão...");
    }

    //Método Exibir Informações Caminhão
    public String toString() {
        return "caminhao [marca=" + marca + ", cor=" + cor + ", eixos=" + eixos + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Caminhao caminhao = new Caminhao("Scania", "verde", "3");

        System.out.println(caminhao);

        caminhao.dirigir();
        caminhao.abastecer();
        caminhao.desligar();
    }
}
