package service;

import java.util.List;

import model.Aluno;
import model.Plano;
import repository.AlunoRepository;
import repository.PlanoRepository;

public class AlunoService {
    private AlunoRepository repositoryAluno;
    private PlanoRepository repositoryPlano;
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
        List<Aluno> al = repositoryAluno.listarTodosAlunos();
        if(al == null) {
            System.out.println("Ainda não há alunos cadastrados!");
            return;
        }
        
        for(Aluno a : al) {
            System.out.println(a);
        }

    }

    public void trocarPlano(int idAluno, int idPlano) {
        Aluno a = repositoryAluno.buscarIdAluno(idAluno);
        Plano p = repositoryPlano.buscarIdPlano(idPlano);
        if (a == null) {
            System.out.println("Aluno não encontrado!");
            return;
        }
        if (p == null) {
            System.out.println("Plano não encontrado!");
            return;
        }

        System.out.println("Plano alterado com sucesso!");

        System.out.println(a);
        a.setPlano(p);
        
    }

    public void listarUmAluno(int id) {
        Aluno a = repositoryAluno.buscarIdAluno(id);
        if (a == null) {
            System.out.println("Aluno não encontrado!");
            return;
        }
    }


}
