//Abaixo importa a funcionalidade para scanear o imput
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //    Abaixo ele instancia e inicia com new fazendo com que faça a leitura das entradas dos sistema
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o salario: ");
//    final float é igual ao const do js
//        abaixo estamos criando a variavel que irá aceitar o tipo float e o leitor irá receber do usuarioe converter para float com nextfloat
        final float salario = leitor.nextFloat();

        if (salario < 1000){
            var novoSalario = salario * 1.1f;
//            snnipet: SOUT irá criar a linha abaixo
            System.out.println(novoSalario);
        } else {
            System.out.println("Salário dentro da faixa");
        }
    }
}