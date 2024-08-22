// Exercício 13
// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente
public class OrdenaValor {

    public static void main(String[] args) {
        int valor1 = 102;
        int valor2 = 138;

        if (valor1 < valor2) {
            System.out.println("Em ordem crescente: ");
            System.out.print(valor1 + " " + valor2);
        } else {
            System.out.println("Em ordem crescente: ");
            System.out.print(valor2 + " " + valor1);
        }
    }
}