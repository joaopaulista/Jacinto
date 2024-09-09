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
        Caminhao caminhao = new Caminhao(null, null, null);
        Chuteiras chuteiras = new Chuteiras(null, null, null);
        Escudo escudo = new Escudo(null, null, null);
        Fruta fruta = new Fruta(null, null, null);
        Oculos oculos = new Oculos(null, null, null);
        Panelas panelas = new Panelas(null, null, null);
        Plantas plantas = new Plantas(null, null, null);
        Roupas roupas = new Roupas(null, null, null);

        int escolha = 0;
        //loop
        while (escolha != 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Chutar bola");
            System.out.println("2. Pegar bola");
            System.out.println("3. Brincar com o cachorro");
            System.out.println("4. Dar de comer para o cachorro");
            System.out.println("5. Dirigir caminhão");
            System.out.println("6. Abastecer caminhão");
            System.out.println("7. Usar chuteira");
            System.out.println("8. Guardar chuteira");
            System.out.println("9. Torcer");
            System.out.println("10. Entristecer");
            System.out.println("11. Comer fruta");
            System.out.println("12. Lavar fruta");
            System.out.println("13. Comprar óculos");
            System.out.println("14. Usar óculos");
            System.out.println("15. Cozinhar na panela");
            System.out.println("16. Limpar panela");
            System.out.println("17. Cheirar planta");
            System.out.println("18. Regar planta");
            System.out.println("19. Vestir roupa");
            System.out.println("20. Lavar roupa");
            System.out.println("0. Sair");
            escolha = leitura.nextInt();

            //escolha
            switch (escolha) {
                case 0:
                    System.out.println("Saindo...");
                    escolha = 0;
                    break;
                case 1:
                    bolas.chutar();
                    break;
                case 2:
                    bolas.pegar();
                    break;
                case 3:
                    cachorro.brincar();
                    break;
                case 4:
                    cachorro.comer();
                    break;
                case 5:
                    caminhao.dirigir();
                    break;
                case 6:
                    caminhao.abastecer();
                    break;
                case 7:
                    chuteiras.calcar();
                    break;
                case 8:
                    chuteiras.guardar();
                    break;
                case 9:
                    escudo.torcer();
                    break;
                case 10:
                    escudo.entristecer();
                    break;
                case 11:
                    fruta.comer();
                    break;
                case 12:
                    fruta.lavar();
                    break;
                case 13:
                    oculos.comprar();
                    break;
                case 14:
                    oculos.usar();
                    break;
                case 15:
                    panelas.cozinhar();
                    break;
                case 16:
                    panelas.limpar();
                    break;
                case 17:
                    plantas.cheirar();
                    break;
                case 18:
                    plantas.regar();
                    break;
                case 19:
                    roupas.vestir();
                    break;
                case 20:
                    roupas.lavar();
                    break;
                //caso contrário:
                default:
                    System.out.println("Opção inválida.");
            }
        }
        leitura.close();
    }
}
