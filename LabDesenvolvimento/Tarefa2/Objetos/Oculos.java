package Tarefa2.Objetos;

public class Bolas {
    //Atributos
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
    public void chutar() {
        System.out.println("Chutar a bola!");
    }

    public void jogar() {
        System.out.println("Jogar a bola!");
    }

    public void pegar() {
        System.out.println("Pegar a bola!");
    }

    //Método Exibir Informações Bolas
    public String toString() {
        return "bolas [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Bolas bolas = new Bolas("esfera", "preto", "borracha");

        System.out.println(bolas);

        bolas.chutar();
        bolas.jogar();
        bolas.pegar();
    }
}
