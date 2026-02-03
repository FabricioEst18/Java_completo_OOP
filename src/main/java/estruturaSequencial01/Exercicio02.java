package estruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
//    Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//    casas decimais conforme exemplos.
//    Fórmula da área: area = π . raio2
//    Considere o valor de π = 3.14159
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o valor do raio do círculo: ");
        raio = scanner.nextDouble();
        area = pi * (raio * raio);
        System.out.printf("A área do círculo é igual a %.4f%n", area);

        scanner.close();
    }
}
