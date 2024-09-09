package Tarefa2.Objetos;

public class Fruta {
    //Atributos
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
    public void comer() {
        System.out.println("Comendo a fruta...");
    }

    public void lavar() {
        System.out.println("Lavando a fruta...");
    }

    public void pegar() {
        System.out.println("Pegando a fruta...");
    }

    //Método Exibir Informações Frutas
    public String toString() {
        return "fruta [formato=" + formato + ", cor=" + cor + ", textura=" + textura + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Fruta frutas = new Fruta("esfera", "vermelho", "lisa");

        System.out.println(frutas);

        frutas.comer();
        frutas.lavar();
        frutas.pegar();
    }
}
