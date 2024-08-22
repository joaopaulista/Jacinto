// Exercício 1
// Ler a idade de uma pessoa expressa em anos, meses e dias e escrever a idade dessa pessoa expressa apenas em dias. Considerando ano com 365 dias e mês com 30 dias.
import java.util.Scanner;

public class IdadeDias {
    
    public static void main(String[] args) {
        
        Scanner scannerData = new Scanner(System.in);
        Scanner scannerMes = new Scanner(System.in);
        Scanner scannerAno = new Scanner(System.in);

        // Recebendo a entrada da Data
        System.out.println("Digite o dia de hoje:");
        int data1 = scannerData.nextInt();

        System.out.println("Digite o mês de hoje:");
        int data2 = scannerMes.nextInt();

        System.out.println("Digite o ano de hoje:");
        int data3 = scannerAno.nextInt();

        Scanner scannerDiaNasc = new Scanner(System.in);
        Scanner scannerMesNasc = new Scanner(System.in);
        Scanner scannerAnoNasc = new Scanner(System.in);

        //Recebendo a entrada da Idade
        System.out.println("Digite o dia do seu nascimento:");
        int data4 = scannerDiaNasc.nextInt();

        System.out.println("Digite o mês do seu nascimento:");
        int data5 = scannerMesNasc.nextInt();

        System.out.println("Digite o ano do seu nascimento:");
        int data6 = scannerAnoNasc.nextInt();

        //Tratamento dos dados
        int hoje = (data1*1) + (data2*30) + (data3*365);
        int nascimento = (data4*1) + (data5*30) + (data6*365);
        int idade = hoje - nascimento;

        System.out.print("SUA IDADE EM DIAS É: ");
        System.out.print(idade);
    }
}
