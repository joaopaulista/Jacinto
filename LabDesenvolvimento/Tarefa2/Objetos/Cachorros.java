package Tarefa2.Objetos;

public class Cachorros {
    //Atributos
    private String raca;
    private String cor;
    private String porte;

    //Construtor
    public Cachorros(String raca, String cor, String porte) {
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
    public void brincar() {
        System.out.println("Brincando com o cachorro...");
    }

    public void deitar() {
        System.out.println("Cachorro deitando...");
    }

    public void comer() {
        System.out.println("Cachorro comendo...");
    }

    //Método Exibir Informações Cachorros
    public String toString() {
        return "cachorro [raca=" + raca + ", cor=" + cor + ", porte=" + porte + "]";
    }

    //Método Principal Testar Classe
    public static void main(String[] args) {
        
        Cachorros cachorros = new Cachorros("Golden", "Marrom", "Grande");

        System.out.println(cachorros);

        cachorros.brincar();
        cachorros.comer();
        cachorros.deitar();
    }
}