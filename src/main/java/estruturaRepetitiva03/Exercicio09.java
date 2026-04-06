package estruturaRepetitiva03;

import java.util.Scanner;

public class Exercicio09 {
    //Soma de Intervalo: Peça dois números inteiros (início e fim) e calcule a soma de todos os números entre eles (inclusive).
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInicial;
        int numeroFinal;
        int soma = 0;

        System.out.println("Digite um numero: ");
        numeroInicial = scanner.nextInt();
        System.out.println("Digite outro numero: ");
        numeroFinal = scanner.nextInt();

        //Lógica para caso o número inicial seja maior que o final
        if (numeroFinal < numeroInicial) {
            int c = numeroInicial;
            numeroInicial = numeroFinal;
            numeroFinal = c;
        }


        for (int i = numeroInicial; i <= numeroFinal; i++) {
            soma += i;
        }

        System.out.println("Resultado da soma de " + numeroInicial + " até " + numeroFinal + ": " + soma);

        scanner.close();
    }
}
