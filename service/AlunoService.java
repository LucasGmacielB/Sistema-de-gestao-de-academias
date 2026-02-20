package service;

import model.Aluno;
import model.Plano;
import repository.AlunoRepository;
import repository.PlanoRepository;

public class AlunoService {
    private AlunoRepository repositoryAluno;
    private PlanoRepository repositoryPlano;
    private Aluno al;
    private int id = 1;
    

    public AlunoService(AlunoRepository repositoryAluno, PlanoRepository repositoryPlano) {
        this.repositoryAluno = repositoryAluno;
        this.repositoryPlano = repositoryPlano;
    }

    public void cadastrarAluno(String nome, int idade, int idPlano) {
        Plano p = repositoryPlano.buscarIdPlano(idPlano);

        if (nome == null || nome.isEmpty()) {
             System.out.println("Nome inválido!");
             return;
        }

        if(p == null) {
            System.out.println("Plano não encontrado!");
            return;
        }

        Aluno aluno = new Aluno(nome, idade, id, p);
        repositoryAluno.salvar(aluno);
        id++;

        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        if(al == null) {
            System.out.println("Ainda não há alunos cadastrados!");
            return;
        }
        
        for(Aluno a : repositoryAluno.listarTodosAlunos()) {
            System.out.println(a);
        }

    }


}
