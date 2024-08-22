// Exercício 15
// Leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas.
import java.util.Scanner;

public class SalarioTrabalho {
    
    public static void main(String[] args) {
        Scanner scannerHoraMes = new Scanner(System.in);
        Scanner scannerSalarioHora = new Scanner(System.in);

        System.out.println("Por gentileza, insira a quantidade de horas trabalhadas neste mês:");
        int horaMes = scannerHoraMes.nextInt();

        System.out.println("Insira seu salário por hora trabalhada:");
        Double salarioHora = scannerSalarioHora.nextDouble();

        int horasNormal = 160;

        if (horaMes > 160) {
            int horaMesExtra = horaMes - horasNormal;
            Double salarioExtra = (horaMesExtra * salarioHora) + (salarioHora*0.5);
            Double salario = salarioHora * (horaMes - horaMesExtra);
            Double salarioFinal = salarioExtra + salario;

            System.out.print("Seu salário é: R$");
            System.out.print(salarioFinal);

        } else {
            Double salario = salarioHora * horaMes;

            System.out.print("Seu salário é: R$");
            System.out.print(salario);
        }
    }
}
