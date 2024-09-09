package Tarefa2.Objetos;

public class Roupas {
    //Atributos
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
    public void vestir() {
        System.out.println("Vestindo a roupa...");
    }

    public void lavar() {
        System.out.println("Lavando a roupa...");
    }

    public void guardar() {
        System.out.println("Guardando a roupa...");
    }

    //Método Exibir Informações Roupas
    public String toString() {
        return "roupas [formato=" + formato + ", cor=" + cor + ", tecido=" + tecido + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Roupas roupas = new Roupas("camiseta", "verde claro", "algodão");

        System.out.println(roupas);

        roupas.vestir();
        roupas.lavar();
        roupas.guardar();
    }
}
