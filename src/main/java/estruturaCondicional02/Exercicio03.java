package estruturaCondicional02;

import java.util.Scanner;

public class Exercicio03 {
    //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
    //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
    //ordem crescente ou decrescente.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Digite o valor de A: ");
        a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        b = scanner.nextInt();

        if (a % b == 0 || b % a == 0){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        scanner.close();
    }
}
