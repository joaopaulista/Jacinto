// Exercício 12
// Ler 2 valores (não sendo valores iguais) e escrever o maior deles
public class MaiorValor {
	
    public static void main(String[] args) {
        
        int valor1 = 45;
        int valor2 = 20;

        // Operador Ternário
        int maior = (valor1 > valor2) ? valor1 : valor2;
   
        System.out.println("O maior valor é: " + maior);
    }
   }