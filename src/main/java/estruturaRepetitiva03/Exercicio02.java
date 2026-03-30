package estruturaRepetitiva03;

import java.util.Scanner;

public class Exercicio02 {
    //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
    //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
    //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
    static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int x;
        int y;

        System.out.println("Digite o valor de x: ");
        x = scanner.nextInt();
        System.out.println("Digite o valor de y: ");
        y = scanner.nextInt();

        while ((x != 0)  || (y != 0)){
            if (x > 0 && y > 0){
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x > 0 && y < 0){
                System.out.println("Terceiro quadrante");
            }  else if (x < 0 && y < 0){
                System.out.println("Quarto quadrante");
            }
            System.out.println("Digite outro valor para x: ");
            x = scanner.nextInt();
            System.out.println("Digite outro valor para y: ");
            y = scanner.nextInt();
        }
        scanner.close();
    }
}
