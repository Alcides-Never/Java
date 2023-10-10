import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<PessoaFisica> listaPf = new ArrayList<>();
        PessoaFisica metodosPf = new PessoaFisica();

        ArrayList<PessoaJuridica> listaPj = new ArrayList<>();
        PessoaJuridica medodoPj = new PessoaJuridica();

        System.out.println("Bem vindo ao sistema de cadastro de Pessoa Fisica e Pessoa Juridica");

        Scanner scanner = new Scanner(System.in);
//        next, uma forma de armazenar o imput
        int opcao;

        do{
            System.out.println("Escolha uma opção: 1 - Pessoa Física / 2 - Pessoa Jurídica / 0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    int opcaoPf;
                    do{

                        System.out.println("Escolha uma opção: 1 - Cadastrar Pessoa Fisica / 2 - Listar Pessoa Física / 0 - Voltar ao Menu Anterior");
                        opcao = scanner.nextInt();

                        switch (opcao){
                            case 1:
//                                Exemplo abaixo para instanciar um novo objeto
                                PessoaFisica novapf = new PessoaFisica();
                                Endereco novoEndPf = new Endereco();

                                System.out.println("Digite o nome da pessoa física: ");
                                novapf.nome = scanner.next();

                                System.out.println("Digite o cpf: ");
                                novapf.cpf = scanner.next();

                                System.out.println("Digite o redimento mensal(Somente números): ");
                                novapf.rendimento = scanner.nextInt();

                                System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");
                                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                Period periodo = Period.between(date, LocalDate.now());

                                novapf.dataNascimento = date;

                                if (periodo.getYears() >= 18){
                                    System.out.println("A pessoa tem mais de 18 anos");

                                } else {
                                    System.out.println("A pessoa tem menos de 18 anos. Retornando menu ...");
                                    break;
                                }

                                System.out.println("Digite o logradouro: ");
                                novoEndPf.logradouro = scanner.next();

                                System.out.println("Digite o número: ");
                                novoEndPf.numero = scanner.next();

                                System.out.println("É endereço comercial? S/N: ");
                                String endCom;
                                endCom = scanner.next();

//                                if (endCom.toUpperCase().equals("S")){
                                if (endCom.equalsIgnoreCase("S")){
                                    novoEndPf.enderecoComercial = true;
                                }else{
                                    novoEndPf.enderecoComercial = false;
                                }

                                novapf.endereco = novoEndPf;

                                novapf.endereco = novoEndPf;

                                listaPf.add(novapf);

                                System.out.println("Cadastro Realizado com Sucesso");

                                break;
                            case 2:

                                if(listaPf.size() > 0){

                                    for (PessoaFisica cadaPf : listaPf){
                                        System.out.println();
                                        System.out.println("Nome: " + cadaPf.nome);
                                        System.out.println("CPF: " + cadaPf.cpf);
                                        System.out.println("Endereço: " + cadaPf.endereco.logradouro + ", " + cadaPf.endereco.numero);
                                        System.out.println("Data de Nascimento: " + cadaPf.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                        System.out.println("Imposto a ser pago: " + metodosPf.CalcularImposto(cadaPf.rendimento));
                                        System.out.println();
                                        System.out.println("Digite 0 para continuar");
                                        scanner.nextLine();
                                    }

                                    opcaoPf = scanner.nextInt();

                                } else {
                                    System.out.println("Lista Vazia");
                                }

                                break;
                            case 0:
                                System.out.println("Voltando ao menu anterior");
                                break;
                            default:
                                System.out.println("Opção Inválida, digite uma opção válida!");
                                break;
                        }

                    } while(opcao != 0);
                    break;
                case 2:
                    int opcaoPj;
                    do{
                        System.out.println("Esolha uma opção: 1 - Cadastrar Pessoa Juridica / 2 - Listas Pessoa Juridica / 0 - Voltar ao Menu Anterior");
                        opcao = scanner.nextInt();

                        switch(opcao){
                            case 1:
                                PessoaJuridica novapj = new PessoaJuridica();
                                Endereco novoEndPj = new Endereco();

                                System.out.println("Digite o CNPJ: ");
                                novapj.cnpj = scanner.next();

                                System.out.println("Digite a Razão Social: ");
                                novapj.razaoSocial = scanner.next();

                                System.out.println("Digite o redimento mensal(Somente números): ");
                                novapj.rendimento = scanner.nextInt();

                                System.out.println("Digite o logradouro: ");
                                novoEndPj.logradouro = scanner.next();

                                System.out.println("Digite o número: ");
                                novoEndPj.numero = scanner.next();

                                System.out.println("É endereço comercial? S/N: ");
                                String endCom;
                                endCom = scanner.next();

                                if (endCom.equalsIgnoreCase("S")){
                                    novoEndPj.enderecoComercial = true;
                                }else{
                                    novoEndPj.enderecoComercial = false;
                                }

                                novapj.endereco = novoEndPj;

                                listaPj.add(novapj);

                                System.out.println("Cadastro Realizado com Sucesso");
                                break;

                            case 2:
                                if(listaPj.size() > 0){

                                    for (PessoaJuridica cadaPj : listaPj){
                                        System.out.println();
                                        System.out.println("CNPJ: " + cadaPj.cnpj);
                                        System.out.println("Razão Social: " + cadaPj.razaoSocial);
                                        System.out.println("Endereço: " + cadaPj.endereco.logradouro + ", " + cadaPj.endereco.numero);
//                                        System.out.println("Imposto a ser pago: " + metodosPf.CalcularImposto(cadaPf.rendimento));
                                        System.out.println();
                                        System.out.println("Digite 0 para continuar");
                                        scanner.nextLine();
                                    }

                                    opcaoPf = scanner.nextInt();


                                } else {
                                    System.out.println("Lista Vazia");
                                }
                        }
                    } while (opcao != 0);
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o sistema!");
                    break;
                default:
                    System.out.println("Opção Inválida, digite uma opção válida!");
                    break;
            }

        } while (opcao != 0);
    }
}