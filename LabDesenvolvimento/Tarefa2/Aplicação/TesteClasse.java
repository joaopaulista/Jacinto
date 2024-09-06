package Tarefa2.Aplicação;
import java.util.Scanner;

import Tarefa2.Objetos.Cachorro;

public class TesteClasse {
    
    //Método main
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Cachorro cachorro = new Cachorro();

        int escolha = 0;
        //loop
        while (escolha != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Brincar");
            System.out.println("2. Deitar");
            System.out.println("3. Comer");
            System.out.println("4. Sair");
            escolha = leitura.nextInt();

            //escolha
            switch (escolha) {
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
                    System.out.println("Saindo...");
                    break;
                //caso contrário:
                default:
                    System.out.println("Opção inválida.");
            }
        }
        leitura.close();
    }
}
