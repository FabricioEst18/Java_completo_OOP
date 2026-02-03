package estruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
//    Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//    mostre:
//    a) a área do triângulo retângulo que tem A por base e C por altura.
//    b) a área do círculo de raio C. (pi = 3.14159)
//    c) a área do trapézio que tem A e B por bases e C por altura.
//    d) a área do quadrado que tem lado B.
//    e) a área do retângulo que tem lados A e B.
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
        double pi = 3.14159;

        System.out.println("Digite o valor de A: ");
        a = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        b = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        c = scanner.nextDouble();

        areaTriangulo = (a * c)/ 2;
        areaCirculo = pi * (c * c);
        areaTrapezio = ((a + b) * c)/ 2;
        areaQuadrado = b * b;
        areaRetangulo = a * b;

        System.out.printf(" Triângulo: %.3f%n Circulo: %.3f%n Trapezio: %.3f%n Quadrado: %.3f%n Retângulo: %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        scanner.close();
    }
}
