package introducaoPOO04.entities;


//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
//projetada abaixo.

public class Funcionario02 {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentoSalarial(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}
