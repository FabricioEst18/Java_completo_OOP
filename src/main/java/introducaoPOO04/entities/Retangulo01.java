package introducaoPOO04.entities;

//Fazer um programa para ler os valores da largura e altura
//de um retângulo. Em seguida, mostrar na tela o valor de
//sua área, perímetro e diagonal. Usar uma classe como
//mostrado no projeto ao lado.

//Classe => Retangulo01 no pacote entities
public class Retangulo01 {

    //Atributos da Classe Retangulo01
    public double largura;
    public double altura;

    //Métodos da Classe Retangulo01, retornando o resultado das operações para o usuário
    public double area(){
        return largura * altura;
    }

    public double perimetro(){
        return 2 * (largura + altura);
    }

    public double diagonal(){
        return Math.sqrt((largura * largura) + (altura * altura));
    }

}
