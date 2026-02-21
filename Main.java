import java.util.Scanner;

import repository.AlunoRepository;
import repository.PagamentosRepository;
import repository.PlanoRepository;
import service.AlunoService;
import service.PagamentosService;
import service.PlanoService;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AlunoRepository repositoryAluno = new AlunoRepository();
        PlanoRepository repositoryPlano = new PlanoRepository();
        PagamentosRepository repositoryPagamento = new PagamentosRepository();

        PlanoService servicePlano = new PlanoService(repositoryPlano);
        AlunoService serviceAluno = new AlunoService(repositoryAluno, repositoryPlano);
        PagamentosService servicePagamento = new PagamentosService(repositoryAluno, repositoryPagamento);

        int opcao;
        do{
            System.out.println("--------------------------------");
            System.out.println("*      1 - Cadastrar Aluno     *");
            System.out.println("*      2 - Cadastrar Plano     *");
            System.out.println("*      3 - Fazer pagamento     *");
            System.out.println("*      4 - Trocar de Plano     *");
            System.out.println("*      5 - Listar alunos       *");
            System.out.println("*      6 - Listar planos       *");
            System.out.println("*      7 - Listar pagamentos   *");
            System.out.println("*      0 - Sair                *");
            System.out.println("--------------------------------");


            System.out.print("\nOpção: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeAluno = scan.nextLine();

                    System.out.print("Idade: ");
                    int idade = scan.nextInt();

                    System.out.println("Escolha um plano...\n");
                    servicePlano.listarPlanos();
                    if (servicePlano.getHaPlanos() != false) {
                        System.out.print("\nCódigo do plano: ");
                    int idPlano = scan.nextInt();

                    servicePlano.vefiricarId(idPlano);
                    serviceAluno.cadastrarAluno(nomeAluno, idade, idPlano);
                    }
                    
                    break;
                case 2:
                    System.out.print("Nome do plano: ");
                    String nome = scan.nextLine();

                    System.out.print("Preço: ");
                    double preco = scan.nextDouble();

                    System.out.print("Duração em meses: ");
                    int duracao = scan.nextInt();

                    servicePlano.cadastrarPlano(nome, preco, duracao);
                    break;
                case 3:
                    System.out.println("Qual aluno que será realizado o pagamento?\n");
                    serviceAluno.listarAlunos();
                    System.out.print("ID: ");
                    int idAluno = scan.nextInt();
                    servicePagamento.fazerPagamento(idAluno);
                    break;
                case 4:
                    System.out.println("Deseja trocar o plano de qual aluno?\n");
                    serviceAluno.listarAlunos();
                    System.out.print("ID: ");
                    int idAlu = scan.nextInt();
                    System.out.println("Qual o novo plano do cliente?\n");
                    servicePlano.listarPlanos();
                    int idPla = scan.nextInt();
                    serviceAluno.trocarPlano(idAlu, idPla);

                    break;
                case 5:
                    System.out.println("");
                    serviceAluno.listarAlunos();
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    servicePlano.listarPlanos();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    servicePagamento.listarPagamentos();
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Obrigado por usar o sistema!");
                    break;
            
                default:
                    break;
            }
        }while(opcao != 0);

        scan.close();
    }
}
