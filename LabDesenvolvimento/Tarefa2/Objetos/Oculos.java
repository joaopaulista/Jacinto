package Tarefa2.Objetos;

public class Oculos {
    //Atributos
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
    public void usar() {
        System.out.println("Colocando os óculos...");
    }

    public void vender() {
        System.out.println("Óculos vendido.");
    }

    public void comprar() {
        System.out.println("Óculos comprado.");
    }

    //Método Exibir Informações Óculos
    public String toString() {
        return "óculos [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Oculos oculos = new Oculos("redondo", "branco", "plástico");

        System.out.println(oculos);

        oculos.usar();
        oculos.vender();
        oculos.comprar();
    }
}
