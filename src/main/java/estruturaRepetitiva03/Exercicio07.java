package estruturaRepetitiva03;

import java.util.Scanner;

public class Exercicio07 {
    //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;

        System.out.println("Digite um numero: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){

            System.out.println("Digite um numero: ");
            int x = scanner.nextInt();
            System.out.println("Digite outro numero: ");
            int y = scanner.nextInt();

            if (y == 0){
                System.out.println("Divisão Impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
        scanner.close();
    }
}
