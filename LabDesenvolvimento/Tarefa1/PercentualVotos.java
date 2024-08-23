// Exercício 2
// Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
import java.util.Scanner;

public class PercentualVotos {
    public static void main(String[] args) {
        Scanner leituraEleitores = new Scanner(System.in);
        Scanner leituraBrancos = new Scanner(System.in);
        Scanner leituraNulos = new Scanner(System.in);
        Scanner leituraValidos = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores no município:");
        int eleitores = leituraEleitores.nextInt();
        System.out.println("Insira a quantidade de VOTOS BRANCOS:");
        int brancos = leituraBrancos.nextInt();
        System.out.println("Insira a quantidade de VOTOS NULOS:");
        int nulos = leituraNulos.nextInt();
        System.out.println("Insira a quantidade de VOTOS VÁLIDOS:");
        int validos = leituraValidos.nextInt();

        int totalVotos = brancos + nulos + validos;

        if (totalVotos != eleitores) {
            System.out.println("O total de votos não corresponde ao número total de eleitores.");
            return;
        }

        double percentualBrancos = (brancos * 100.0) / eleitores;
        double percentualNulos = (nulos * 100.0) / eleitores;
        double percentualValidos = (validos * 100.0) / eleitores;

        System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
    }
}
