// Exercício 3
// Ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Por gentileza, insira seu salário.");
        Double salario = leitura.nextDouble();

        System.out.println("Por gentileza, insira o reajuste salarial.");
        Double percentual = leitura.nextDouble();

        Double ajuste = salario * (percentual*0.01);
        Double salarioAjustado = salario + ajuste;

        System.out.print("Após o reajuste, seu salário é de R$");
        System.out.print(salarioAjustado);

        leitura.close();
    }
}