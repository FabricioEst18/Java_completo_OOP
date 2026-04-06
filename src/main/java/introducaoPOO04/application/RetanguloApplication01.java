package introducaoPOO04.application;

import introducaoPOO04.entities.Retangulo01;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloApplication01 {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Retangulo01 retangulo01 = new Retangulo01();

        System.out.println("Digite o valor da largura do retangulo: ");
        retangulo01.largura = scanner.nextDouble();
        System.out.println("Digite o valor da altura do retangulo: ");
        retangulo01.altura = scanner.nextDouble();

        System.out.printf("AREA: %.2f%n", retangulo01.area());
        System.out.printf("PERIMETRO: %.2f%n", retangulo01.perimetro());
        System.out.printf("DIAGONAL: %.2f%n", retangulo01.diagonal());

        scanner.close();
    }
}
