// Exercício 10
// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.
import java.util.Scanner;

public class MediaAluno {
    
    public static void main(String[] args) {
        Scanner leituraNota1 = new Scanner(System.in);
        Scanner leituraNota2 = new Scanner(System.in);

        System.out.println("Insira a primeira nota:");
        Double nota1 = leituraNota1.nextDouble();

        System.out.println("Insira a primeira nota:");
        Double nota2 = leituraNota2.nextDouble();

        Double media = (nota1 + nota2)/2;
        if (media >= 6) {
            System.out.println("Parabéns, você foi aprovado!");
            System.out.print("Com uma média de: ");
            System.out.print(media);
        } else {
            System.out.println("Infelizmente, você não foi aprovado!");
            System.out.print("Ficando com uma média de: ");
            System.out.print(media);
        }
        leituraNota1.close();
        leituraNota2.close();
    }
}
