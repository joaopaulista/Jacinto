import java.util.Scanner;

public class MediaAlunoLP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da Prova 1 (P1): ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite a nota do Exercício 1 (E1): ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite a nota do Exercício 2 (E2): ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite a nota da Atividade Prática Individual (API): ");
        double API = scanner.nextDouble();

        System.out.print("Digite a nota adicional (X): ");
        double X = scanner.nextDouble();

        System.out.print("Digite a nota do Sub-Projeto (SUB): ");
        double SUB = scanner.nextDouble();

        // NOTA BASE
        double notaBase = P1 * 0.6 + ((E1 + E2) / 2) * 0.4;

        // CÁLCULO API
        double fatorAjusteAPI = (notaBase > 5.9) ? (Math.max(notaBase - 5.9, 0) / (notaBase - 5.9)) * (API * 0.5) : 0;

        // MÉDIA FINAL
        double media = (notaBase * 0.5) + fatorAjusteAPI + X + (SUB * 0.2);

        System.out.printf("A média final do aluno é: %.2f%n", media);

        scanner.close();
    }
}
