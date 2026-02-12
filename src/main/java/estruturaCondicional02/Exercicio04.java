package estruturaCondicional02;

import java.util.Scanner;

public class Exercicio04 {
    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Digite a hora inicial: ");
        horaInicial = scanner.nextInt();
        System.out.println("Digite a hora final: ");
        horaFinal = scanner.nextInt();

        if (horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");
        scanner.close();
    }
}
