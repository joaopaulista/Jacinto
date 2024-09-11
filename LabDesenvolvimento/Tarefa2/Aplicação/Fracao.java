package Tarefa2.Aplicação;

import java.util.Scanner;

// Declaração Variáveis
public class Fracao {
    private int numerador;
    private int denominador;

    // Construtor para frações
    public Fracao(int numerador, int denominador) {
        // Verifica se denominador é zero
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        // Atribui valor instância
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    // Método simplificar fração
    private void simplificar() {
        int mdc = mdc(numerador, denominador);
        numerador /= mdc;
        denominador /= mdc;
    }

    // Método calcular o MDC (Máximo Divisor Comum)
    private int mdc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdc(b, a % b);
        }
    }

    // Métodos operações
    public Fracao somar(Fracao outraFracao) {
        int novoNumerador = numerador * outraFracao.denominador + denominador * outraFracao.numerador;
        int novoDenominador = denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outraFracao) {
        int novoNumerador = numerador * outraFracao.denominador - denominador * outraFracao.numerador;
        int novoDenominador = denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outraFracao) {
        int novoNumerador = numerador * outraFracao.numerador;
        int novoDenominador = denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao outraFracao) {
        if (outraFracao.numerador == 0) {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
        int novoNumerador = numerador * outraFracao.denominador;
        int novoDenominador = denominador * outraFracao.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método toString para representação textual da fração
    @Override
    public String toString() {
        if (denominador == 1) {
            return Integer.toString(numerador);
        } else {
            return numerador + "/" + denominador;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            if (opcao == 5) {
                break;
            }

            System.out.print("Digite o numerador da primeira fração: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o denominador da primeira fração: ");
            int den1 = scanner.nextInt();

            System.out.print("Digite o numerador da segunda fração: ");
            int num2 = scanner.nextInt();
            System.out.print("Digite o denominador da segunda fração: ");
            int den2 = scanner.nextInt();

            Fracao fracao1 = new Fracao(num1, den1);
            Fracao fracao2 = new Fracao(num2, den2);

            Fracao resultado;
            switch (opcao) {
                case 1:
                    resultado = fracao1.somar(fracao2);
                    break;
                case 2:
                    resultado = fracao1.subtrair(fracao2);
                    break;
                case 3:
                    resultado = fracao1.multiplicar(fracao2);
                    break;
                case 4:
                    resultado = fracao1.dividir(fracao2);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}