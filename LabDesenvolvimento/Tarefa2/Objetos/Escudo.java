package Tarefa2.Objetos;

public class Escudo {
    //Atributos
    private String formato;
    private String cor;
    private String simbolo;

    //Construtor
    public Escudo(String formato, String cor, String simbolo) {
        this.formato = formato;
        this.cor = cor;
        this.simbolo = simbolo;
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

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }
    
    //MÉTODOS
    public void torcer() {
        System.out.println("Vamos time!!!");
    }

    public void irar() {
        System.out.println("Ai não, não é assim que se faz!");
    }

    public void entristecer() {
        System.out.println("Meu time perdeu.");
    }

    //Método Exibir Informações Escudo
    public String toString() {
        return "bolas [formato=" + formato + ", cor=" + cor + ", simbolo=" + simbolo + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Escudo escudo = new Escudo("esfera", "cinza", "escudo");

        System.out.println(escudo);

        escudo.entristecer();
        escudo.irar();
        escudo.torcer();
    }
}
