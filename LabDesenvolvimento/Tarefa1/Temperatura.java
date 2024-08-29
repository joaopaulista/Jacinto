// Exercício 6
// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F
import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma temperatura em Fahrenheit:");

        int fah = scanner.nextInt();

        int cel = (fah - 32)*5 /9;

        System.out.print("A temperatura aproximadamente em Celsius é: ");
        System.out.print(cel);
        System.out.print("°C");

        scanner.close();
    }
}