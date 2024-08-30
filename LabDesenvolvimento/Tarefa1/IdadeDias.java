// Exercício 1
// Ler a idade de uma pessoa expressa em anos, meses e dias e escrever a idade dessa pessoa expressa apenas em dias. Considerando ano com 365 dias e mês com 30 dias.
import java.util.Scanner;

public class IdadeDias {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Recebendo a entrada da Data
        System.out.println("Digite o dia de hoje:");
        int data1 = scanner.nextInt();

        System.out.println("Digite o mês de hoje:");
        int data2 = scanner.nextInt();

        System.out.println("Digite o ano de hoje:");
        int data3 = scanner.nextInt();

        //Recebendo a entrada da Idade
        System.out.println("Digite o dia do seu nascimento:");
        int data4 = scanner.nextInt();

        System.out.println("Digite o mês do seu nascimento:");
        int data5 = scanner.nextInt();

        System.out.println("Digite o ano do seu nascimento:");
        int data6 = scanner.nextInt();

        //Tratamento dos dados
        int hoje = (data1*1) + (data2*30) + (data3*365);
        int nascimento = (data4*1) + (data5*30) + (data6*365);
        int idade = hoje - nascimento;

        System.out.print("SUA IDADE EM DIAS É: ");
        System.out.print(idade);

        scanner.close();
    }
}
