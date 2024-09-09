package Tarefa2.Objetos;

public class Panelas {
    //Atributos
    private String formato;
    private String cor;
    private String material;

    //Construtor
    public Panelas(String formato, String cor, String material) {
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
    public void cozinhar() {
        System.out.println("Cozinhando na panela...");
    }

    public void guardar() {
        System.out.println("Guardando a panela...");
    }

    public void limpar() {
        System.out.println("Limpando a panela...");
    }

    //Método Exibir Informações Panelas
    public String toString() {
        return "panelas [formato=" + formato + ", cor=" + cor + ", material=" + material + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Panelas panelas = new Panelas("redondo", "prata", "metal");

        System.out.println(panelas);

        panelas.cozinhar();
        panelas.guardar();
        panelas.limpar();
    }
}
