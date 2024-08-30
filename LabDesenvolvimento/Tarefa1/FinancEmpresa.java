// Exercício 16
// Na empresa, para fechar o balanço do primeiro trimestre, precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais, faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.
import java.util.Scanner;

public class FinancEmpresa {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o valor gasto no mês de Janeiro:");
        Double gastosJan = leitura.nextDouble();

        System.out.println("Insira o valor gasto no mês de Fevereiro:");
        Double gastosFev = leitura.nextDouble();

        System.out.println("Insira o valor gasto no mês de Março:");
        Double gastosMar = leitura.nextDouble();

        Double gastoTotal = gastosJan + gastosFev + gastosMar;
        Double gastoMediaMensal = gastoTotal/3;

        System.out.printf("Despesa Total no Trimestre(JAN, FEV, MAR): R$: %.2f%%\n", gastoTotal);
        System.out.printf("Média Mensal de Gastos no Trimestre(JAN, FEV, MAR): R$ %.2f%%\n", gastoMediaMensal);

        leitura.close();
    }
}
