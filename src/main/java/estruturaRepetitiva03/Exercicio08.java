package estruturaRepetitiva03;

import java.util.Scanner;

public class Exercicio08 {
    //Tabuada Personalizada: Peça ao usuário um número inteiro e exiba a tabuada desse número de 1 a 10 usando um laço for.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        //TABUADA DO NÚMERO ENVIADO PELO USUÁRIO
        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();
        System.out.println("TABUADA DO NÚMERO " + numero + ":" );
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * numero);
        }
        scanner.close();
    }
}
