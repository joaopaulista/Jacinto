// Exercício 3
// Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner leituraSalario = new Scanner(System.in);
        Scanner leituraPercentual = new Scanner(System.in);

        System.out.println("Por gentileza, insira seu salário.");
        Double salario = leituraSalario.nextDouble();

        System.out.println("Por gentileza, insira o reajuste salarial.");
        Double percentual = leituraPercentual.nextDouble();

        Double ajuste = salario * (percentual*0.01);
        Double salarioAjustado = salario + ajuste;

        System.out.print("Após o reajuste, seu salário é de R$");
        System.out.print(salarioAjustado);
    }
}