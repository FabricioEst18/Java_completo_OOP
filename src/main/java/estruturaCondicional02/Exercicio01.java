package estruturaCondicional02;

import java.util.Scanner;

public class Exercicio01 {
    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro qualquer: ");
        numero = scanner.nextInt();

        if (numero >= 0){
            System.out.println("POSITIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        scanner.close();
    }
}
