package estruturaSequencial01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
//    Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//    decimais.
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner =  new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salarioFuncionario;

        System.out.println("Digite o número: ");
        numeroFuncionario = scanner.nextInt();
        System.out.println("Digite as horas trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();
        System.out.println("Digite qual o valor da hora: ");
        valorHora = scanner.nextDouble();

        salarioFuncionario = horasTrabalhadas * valorHora;

        System.out.printf("O funcionário número %d irá receber R$ %.2f", numeroFuncionario, salarioFuncionario);

        scanner.close();
    }
}
