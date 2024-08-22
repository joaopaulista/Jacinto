// Exercício 5
// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor
import java.util.Scanner;

public class VendedorCarros {
    public static void main(String[] args) {
        Scanner leituraValorVendas = new Scanner(System.in);
        Scanner leituraCarrosVendidos = new Scanner(System.in);
        Scanner leituraValorPorCarroVendido = new Scanner(System.in);
        Scanner leituraSalarioFix = new Scanner(System.in);

        System.out.println("Insira o Valor Total de suas Vendas no mês:");
        Double valorVendas = leituraValorVendas.nextDouble();

        System.out.println("Insira a Quantidade de Carros Vendidos no mês:");
        int carrosVendidos = leituraCarrosVendidos.nextInt();

        System.out.println("Insira o Valor do seu Salário fixo:");
        Double salarioFix = leituraSalarioFix.nextDouble();

        System.out.println("Insira o Valor por cada Carro Vendido:");
        Double comissaoPorCarro = leituraValorPorCarroVendido.nextDouble();

        // Tratamento dos Dados - SALÁRIO FINAL
        Double salarioCarrosVendidos = comissaoPorCarro*carrosVendidos;
        Double salarioComissaoVendas = valorVendas*0.05;
        Double salarioFinal = salarioComissaoVendas + salarioCarrosVendidos + salarioFix;

        System.out.print("Seu Salário Final é de R$");
        System.out.print(salarioFinal);
    }
}
