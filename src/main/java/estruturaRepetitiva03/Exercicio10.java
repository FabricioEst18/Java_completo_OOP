package estruturaRepetitiva03;

import java.util.Scanner;

public class Exercicio10 {
    //Validação de Nota: Use um laço while ou do-while para pedir uma nota entre 0 e 10. Se o usuário digitar um valor
    // inválido, o programa deve continuar pedindo até que um valor correto seja inserido.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota;

        do {
            System.out.println("Digite a nota: ");
            nota = scanner.nextFloat();

            //Verificação de valor inválido
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido");
            }
        } while (nota < 0 || nota > 10);


        scanner.close();
    }
}
