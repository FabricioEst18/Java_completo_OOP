package estruturaRepetitiva03;

import java.util.Scanner;

public class Exercicio11 {
    //Soma Infinita: Use um while para ler números do teclado e somá-los. O programa só deve parar e mostrar o total
    // quando o usuário digitar 0.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int soma = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("SOMA : " + soma);
        scanner.close();
    }
}
