import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivro = new ArrayList<>();

        System.out.println("Bem vindo ao cadastro de livros");

        Scanner scanner = new Scanner(System.in);
        Scanner texto = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livro");
            System.out.println("0 - Sair \n");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                Livro cadastroLivro = new Livro();

                    System.out.println("Digite o nome do Livro: ");
                    cadastroLivro.titulo = texto.nextLine();

                    System.out.println("Digite o nome do Autor: ");
                    cadastroLivro.nomeAutor = texto.nextLine();

                    System.out.println("Digite o local de nascimento do Autor");
                    cadastroLivro.LocalNasc = texto.nextLine();

                    System.out.println("Digite o preço do livro(R$): ");
                    cadastroLivro.preco = scanner.nextFloat();

                    System.out.println("Digite a data de lançamento do livro: ");
                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Period periodo = Period.between(date, LocalDate.now());

                    System.out.println();

                    cadastroLivro.dataLancamento = date;

                    if(periodo.getYears() >= 5){
                        System.out.println("Livro tem mais de 5 anos \n");
                    } else {
                        System.out.println("Atenção! O Livro tem menos de 5 anos \n");
                        break;
                    }

                    System.out.println("Cadastro Concluído!");

                    listaLivro.add(cadastroLivro);

                    break;

                case 2:
                    if(listaLivro.size() > 0){
                        for (Livro cadaLivro : listaLivro){
                            System.out.println();
                            System.out.println("Nome do Livro: " + cadaLivro.titulo);
                            System.out.println("Nome do Autor: " + cadaLivro.nomeAutor);
                            System.out.println("Local de Nascimento: " + cadaLivro.LocalNasc);
                            System.out.println("Preço do Livro: " + String.format("%.2f", cadaLivro.preco));
                            System.out.println("Data de lançamento: " + cadaLivro.dataLancamento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                            System.out.println();
                        }
                        break;

                    } else {
                        System.out.println("Lista Vazia \n");
                        break;
                    }
                case 0:
                    System.out.println("Fim! \n");
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente!");
                    break;
            }

        } while (opcao != 0);
    }
}