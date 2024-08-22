// Exercício 4
// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor. 
import java.util.Scanner;

public class CustoCarro {
    public static void main(String[] args) {
        Scanner leituraValor = new Scanner(System.in);

        System.out.println("Insira o custo de fábrica de um carro:");
        Double custoFabrica = leituraValor.nextDouble();

        Double distr = custoFabrica*0.28;
        Double imposto = custoFabrica*0.45;

        Double valorCarro = custoFabrica + distr + imposto;

        System.out.print("O valor do carro é: R$");
        System.out.print(valorCarro);
    }
}
