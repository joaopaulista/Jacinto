// Exercício 8
// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo). 
import java.util.Scanner;

public class ValorPN {
    public static void main(String[] args) {
        Scanner leituraValor = new Scanner(System.in);

        System.out.println("Digite um número:");
        Double valor = leituraValor.nextDouble();

        if (valor >= 0) {
            System.out.println("O valor é POSITIVO");
        } else {
            System.out.println("O valor é NEGATIVO");
        }
        leituraValor.close();
    }
}