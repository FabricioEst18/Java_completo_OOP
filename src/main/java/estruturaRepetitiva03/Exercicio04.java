package estruturaRepetitiva03;

import java.util.Scanner;

public class Exercicio04 {
    //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    //X, se for o caso.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;

        System.out.println("Digite o valor de x: ");
        x = scanner.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
