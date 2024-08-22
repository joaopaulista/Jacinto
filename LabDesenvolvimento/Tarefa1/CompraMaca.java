// Exercício 9
// As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra. 

import java.util.Scanner;

public class CompraMaca {
    public static void main(String[] args) {
        Scanner leituraQtMacaCompra = new Scanner(System.in);

        System.out.println("Sr/Sra., digite a quantidade de maçãs que deseja comprar:");
        int qtMaca = leituraQtMacaCompra.nextInt();

        if (qtMaca >= 12) {
            Double precoMaca = 1.00;
            Double compraMaca = precoMaca * qtMaca;
            System.out.print("Valor da compra: R$");
            System.out.println(compraMaca);
            System.out.print("Preço unitário da Maçã: R$");
            System.out.print(precoMaca);
        } else {
            Double precoMaca = 1.30;
            Double compraMaca = precoMaca * qtMaca;
            System.out.print("Valor da compra: R$");
            System.out.println(compraMaca);
            System.out.print("Preço unitário da Maçã: R$");
            System.out.print(precoMaca);
        }
    }
}
