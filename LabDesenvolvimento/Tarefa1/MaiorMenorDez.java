// Exercício 7
// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!
import java.util.Scanner;

public class MaiorMenorDez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int number = scanner.nextInt();

        if (number < 10) {
            System.out.println("NÃO É MAIOR QUE 10");
        } else {
            if (number > 10){
                System.out.println("É MAIOR QUE 10");
            } else {
                System.out.println("É IGUAL A 10");
            }
            
        }
    }
}