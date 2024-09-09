package Tarefa2.Objetos;

public class Plantas {
    //Atributos
    private String formato;
    private String cor;
    private String folhagem;

    //Construtor
    public Plantas(String formato, String cor, String folhagem) {
        this.formato = formato;
        this.cor = cor;
        this.folhagem = folhagem;
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

    public String getFolhagem() {
        return folhagem;
    }

    public void setFolhagem(String folhagem){
        this.folhagem = folhagem;
    }
    
    //MÉTODOS
    public void cheirar() {
        System.out.println("Cheirando a planta...");
    }

    public void regar() {
        System.out.println("Regando a planta...");
    }

    public void pegar() {
        System.out.println("Pegando a planta...");
    }

    //Método Exibir Informações Plantas
    public String toString() {
        return "plantas [formato=" + formato + ", cor=" + cor + ", folhagem=" + folhagem + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Plantas plantas = new Plantas("esfera retangular", "verde escuro", "seca");

        System.out.println(plantas);

        plantas.cheirar();
        plantas.regar();
        plantas.pegar();
    }
}
