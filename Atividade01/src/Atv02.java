import java.util.Objects;
import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {

        Scanner password = new Scanner(System.in);
        String senha;
        do {
            System.out.println("Digite a senha: ");

            senha = password.nextLine();
            if (!Objects.equals(senha, "123")) {
                System.out.println("erro");
            }
        } while (!Objects.equals(senha, "123"));
//        Acima, o while não precisa de ação por se tratar de condição para sair. Ao sair, seguirá a linha abaixo


            System.out.println("ok");
    }
}

