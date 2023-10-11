import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivro = new ArrayList<>();

        System.out.println("Bem vindo ao cadastro de livros");

        Scanner scanner = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Escolha uma opção: 1 - Cadastrar Livro / 2 - Listar Livro / 0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                Livro cadastroLivro = new Livro();

                    System.out.println("Digite o nome do Livro: ");
                    cadastroLivro.titulo = texto.nextLine();

                    System.out.println("Digite o nome do Autor: ");
                    cadastroLivro.nomeAutor = texto.next();

                    System.out.println("Digite o local de nascimento do Autor");
                    cadastroLivro.LocalNasc = texto.next();

                    System.out.println("Digite o preço do livro(R$): ");
                    cadastroLivro.preco = scanner.nextFloat();

                    System.out.println("Digite a data de lançamento do livro: ");
                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Period periodo = Period.between(date, LocalDate.now());

                    if(periodo.getYears() >= 5){
                        System.out.println("Livro tem mais de 5 anos");
                    } else {
                        System.out.println("Livro com menos de 5 anos");
                        break;
                    }

                    System.out.println("Cadastro ok");

                    listaLivro.add(cadastroLivro);

                    break;

                case 2:
                    if(listaLivro.size() > 0){
                        

                    } else {
                        System.out.println("Lista Vazia");
                    }
            }


        } while (opcao != 0);
                break;
    }
}