package estruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    static void main(String[] args) {
//        Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//        código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1, numeroDePecas1, codigoPeca2, numeroDePecas2;
        double valorUnitarioPecas1, valorUnitarioPecas2, somaDosProdutos;

        System.out.println("Digite o código da peça 1: ");
        codigoPeca1 = scanner.nextInt();
        System.out.println("Digite o número de peças 1 compradas: ");
        numeroDePecas1 = scanner.nextInt();
        System.out.println("Digite o valor unitário de cada peça 1: ");
        valorUnitarioPecas1 = scanner.nextDouble();
        System.out.println("Digite o código da peça 2: ");
        codigoPeca2 = scanner.nextInt();
        System.out.println("Digite o número de peças 2 compradas: ");
        numeroDePecas2 = scanner.nextInt();
        System.out.println("Digite o valor unitário de cada peça 2: ");
        valorUnitarioPecas2 = scanner.nextDouble();

        somaDosProdutos = (numeroDePecas1 * valorUnitarioPecas1) + (numeroDePecas2 * valorUnitarioPecas2);

        System.out.printf("Valor a pagar: R$ %.2f%n", somaDosProdutos);

        scanner.close();
    }
}
