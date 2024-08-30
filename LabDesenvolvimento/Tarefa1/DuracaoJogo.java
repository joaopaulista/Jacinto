// Exercício 14
// Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.
import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a hora em que o jogo foi iniciado:");
        int horaInicio = leitura.nextInt();

        System.out.println("Insira a hora em que o jogo acabou:");
        int horaFinal = leitura.nextInt();

        if (horaFinal < horaInicio) {
            int duracaoJogoXadrez = (24 - horaInicio) + horaFinal;
            System.out.print("A duração da partida de xadrez foi de: ");
            System.out.print(duracaoJogoXadrez);
        } else {
            int duracaoJogoXadrez = horaFinal - horaInicio;
            System.out.print("A duração da partida de xadrez foi de: ");
            System.out.print(duracaoJogoXadrez + "hora(s)");
        }
        leitura.close();
    }
}
