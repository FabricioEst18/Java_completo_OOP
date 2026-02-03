package estruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
//    Fazer um programa para ler quatro valores inteiros A, B, C e D.
//    A seguir, calcule e mostre a diferença do produto
//    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Digite o valor de A:");
        a = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        b = scanner.nextInt();
        System.out.println("Digite o valor de C:");
        c = scanner.nextInt();
        System.out.println("Digite o valor de D:");
        d = scanner.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.printf("O produto da diferença de (%d * %d - %d * %d) é igual a %d",a, b, c, d, diferenca);

        scanner.close();
    }
}
