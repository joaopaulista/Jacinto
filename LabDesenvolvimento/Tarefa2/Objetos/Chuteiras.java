package Tarefa2.Objetos;

public class Chuteiras {
    //Atributos
    private String marca;
    private String cor;
    private String material;

    //Construtor
    public Chuteiras(String marca, String cor, String material) {
        this.marca = marca;
        this.cor = cor;
        this.material = material;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }
    
    //MÉTODOS
    public void guardar() {
        System.out.println("Guardando a chuteira...");
    }

    public void calcar() {
        System.out.println("Colocando as chuteiras...");
    }

    public void pegar() {
        System.out.println("Pegando as chuteiras...");
    }

    //Método Exibir Informações Chuteiras
    public String toString() {
        return "bolas [marca=" + marca + ", cor=" + cor + ", material=" + material + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Chuteiras chuteiras = new Chuteiras("Nike", "dourado", "couro");

        System.out.println(chuteiras);

        chuteiras.calcar();
        chuteiras.guardar();
        chuteiras.pegar();
    }
}
