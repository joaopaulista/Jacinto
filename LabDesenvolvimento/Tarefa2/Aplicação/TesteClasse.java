package Tarefa2.Aplicação;
import java.util.Scanner;

import Tarefa2.Objetos.*;

public class TesteClasse {
    
    //Método main
    public static void main(String[] args) {
        //Instâncias
        Scanner leitura = new Scanner(System.in);

        Cachorros cachorro = new Cachorros("Golden", "marrom", "grande");
        Bolas bolas = new Bolas("esfera", "preto", "borracha");

        int escolha = 0;
        //loop
        while (escolha != 20) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Bolas");
            System.out.println("2. Cachorros");
            System.out.println("3. Caminhões");
            System.out.println("4. Chuteiras");
            System.out.println("5. Escudo/Brasão");
            System.out.println("6. Frutas");
            System.out.println("7. Óculos");
            System.out.println("8. Panelas");
            System.out.println("9. Plantas");
            System.out.println("10. Roupas");
            System.out.println("11. Sair");
            System.out.println("12. Bolas");
            System.out.println("13. Cachorros");
            System.out.println("14. Caminhões");
            System.out.println("15. Chuteiras");
            System.out.println("16. Escudo/Brasão");
            System.out.println("17. Frutas");
            System.out.println("18. Óculos");
            System.out.println("19. Panelas");
            System.out.println("20. Plantas");
            System.out.println("0. Sair");
            escolha = leitura.nextInt();

            //escolha
            switch (escolha) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    cachorro.brincar();
                    break;
                case 2:
                    cachorro.deitar();
                    break;
                case 3:
                    cachorro.comer();
                    break;
                case 4:
                    cachorro.comer();
                    break;
                case 5:
                    cachorro.comer();
                    break;
                case 6:
                    cachorro.comer();
                    break;
                case 7:
                    cachorro.comer();
                    break;
                case 8:
                    cachorro.comer();
                    break;
                case 9:
                    cachorro.comer();
                    break;
                case 10:
                    cachorro.comer();
                    break;
                case 11:
                    cachorro.comer();
                    break;
                case 12:
                    cachorro.comer();
                    break;
                case 13:
                    cachorro.comer();
                    break;
                case 14:
                    cachorro.comer();
                    break;
                case 15:
                    cachorro.comer();
                    break;
                case 16:
                    cachorro.comer();
                    break;
                case 17:
                    cachorro.comer();
                    break;
                case 18:
                    cachorro.comer();
                    break;
                case 19:
                    cachorro.comer();
                    break;
                case 20:
                    cachorro.comer();
                    break;
                //caso contrário:
                default:
                    System.out.println("Opção inválida.");
            }
        }
        leitura.close();
    }
}
