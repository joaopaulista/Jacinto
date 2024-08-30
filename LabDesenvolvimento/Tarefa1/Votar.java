// Exercício 11
// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano.
import java.util.Scanner;

public class Votar {
    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        int anoAtual = leitura.nextInt();

        System.out.println("Digite o ano em que você nasceu:");
        int anoNasceu = leitura.nextInt();

        int idade = anoAtual - anoNasceu;
        if (idade > 18) {
            System.out.println("Você PODERÁ votar!");
        } else {
            System.out.println("Você NÃO PODERÁ votar!");
        }
        leitura.close();
    }
}
