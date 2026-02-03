package estruturaSequencial01;

import java.util.Scanner;

public class Exercicio01 {
    //Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, x;

        System.out.println("Digite um número inteiro: ");
        a = scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        b = scanner.nextInt();
        x = a + b;
        System.out.println("A soma de " + a + " + " + b + " é igual a " + x );
        scanner.close();
    }

}
