// Ler 2 valores (não sendo valores iguais) e escrever o maior deles
import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double valor1, valor2;

        System.out.println("Digite o primeiro valor: ")
        valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor: ")
        valor2 = scanner.nextDouble();

        if (valor1 == valor2) {
            System.out.println("Não aceitamos valores iguais. Por favor, digite valores diferentes.")
        } else {
            if (valor1 > valor2) {
                System.out.println("O maior valor é: " + valor1);
            } else {
                System.out.println("O maior valor é: " + valor2);
            }
        }
        scanner.close();
    }
}