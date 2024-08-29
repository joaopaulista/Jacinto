// Exercício 2
// Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
import java.util.Scanner;

public class PercentualVotos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores no município:");
        int eleitores = leitura.nextInt();
        System.out.println("Insira a quantidade de VOTOS BRANCOS:");
        int brancos = leitura.nextInt();
        System.out.println("Insira a quantidade de VOTOS NULOS:");
        int nulos = leitura.nextInt();
        System.out.println("Insira a quantidade de VOTOS VÁLIDOS:");
        int validos = leitura.nextInt();

        int totalVotos = brancos + nulos + validos;

        if (totalVotos != eleitores) {
            System.out.println("O total de votos não corresponde ao número total de eleitores.");
        } else {
        double percentualBrancos = (brancos * 100.0) / eleitores;
        double percentualNulos = (nulos * 100.0) / eleitores;
        double percentualValidos = (validos * 100.0) / eleitores;

        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
        }
        leitura.close();
    }
}
