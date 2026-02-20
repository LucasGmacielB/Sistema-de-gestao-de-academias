import java.util.Scanner;

import repository.AlunoRepository;
import repository.PlanoRepository;
import service.AlunoService;
import service.PlanoService;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        AlunoRepository repositoryAluno = new AlunoRepository();
        PlanoRepository repositoryPlano = new PlanoRepository();

        PlanoService servicePlano = new PlanoService(repositoryPlano);

        AlunoService serviceAluno = new AlunoService(repositoryAluno, repositoryPlano);

        int opcao;
        do{
            System.out.println("\n1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Plano");
            System.out.println("3 - Listar alunos");
            System.out.println("4 - Listar planos");
            System.out.println("0 - Sair");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeAluno = scan.nextLine();

                    System.out.print("Idade: ");
                    int idade = scan.nextInt();

                    System.out.println("Escolha um plano...");
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
                    serviceAluno.listarAlunos();
                    break;
                case 4:
                    servicePlano.listarPlanos();
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
