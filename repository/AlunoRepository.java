package repository;

import java.util.ArrayList;
import java.util.List;

import model.Aluno;


public class AlunoRepository {

    private List<Aluno> alunos = new ArrayList<>();

    public void salvar(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> listarTodosAlunos() {
        return alunos;
    }

    public Aluno buscarIdAluno (int id) {
        for (Aluno a : alunos) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }


}
