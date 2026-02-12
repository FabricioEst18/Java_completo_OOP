package estruturaCondicional02;

import java.util.Scanner;

public class Exercicio02 {
    //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número qualquer: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        scanner.close();
    }
}
