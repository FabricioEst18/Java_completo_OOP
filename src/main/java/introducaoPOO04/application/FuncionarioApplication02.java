package introducaoPOO04.application;

import introducaoPOO04.entities.Funcionario02;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioApplication02 {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        Funcionario02 funcionario02 = new Funcionario02();

        System.out.println("Digite o nome: ");

        funcionario02.nome = scanner.nextLine();
        System.out.println("Digite o salario: ");
        funcionario02.salarioBruto = scanner.nextDouble();
        System.out.println("Digite o imposto: ");
        funcionario02.imposto = scanner.nextDouble();

        System.out.println();
        System.out.println("Funcionário " + funcionario02);
        System.out.println("Digite a porcentagem para adicionar ao salario: ");
        double porcentagem = scanner.nextDouble();
        funcionario02.aumentoSalarial(porcentagem);

        System.out.println();
        System.out.printf("Dados atualizados: " + funcionario02);
        scanner.close();
    }
}
