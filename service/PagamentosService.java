package service;

import java.util.List;

import model.Aluno;
import model.Pagamentos;
import model.Plano;
import repository.AlunoRepository;
import repository.PagamentosRepository;

public class PagamentosService {
    private AlunoRepository repositoryAluno;
    private PagamentosRepository repositoryPagamento;
    private int idPagamentos = 1;

    public PagamentosService(AlunoRepository repositoryAluno, PagamentosRepository repositoryPagamento) {
        this.repositoryAluno = repositoryAluno;
        this.repositoryPagamento = repositoryPagamento;
    }

    public void fazerPagamento(int idAluno) {
        Aluno al = repositoryAluno.buscarIdAluno(idAluno);
        
        if (al == null) {
            System.out.println("O id do Aluno está incorreto!");
            return;
        }

        Plano pl = al.getPlano();

        Pagamentos pagamento = new Pagamentos(al, idPagamentos, pl);
        repositoryPagamento.salvar(pagamento);
        al.setStatus(true);
        idPagamentos++;
        System.out.println("Seu pagamento foi realizado com sucesso!");

    }

    public void listarPagamentos() {
        List<Pagamentos> pg = repositoryPagamento.listarTodos();
        if (pg == null) {
            System.out.println("Ainda não foram registrados pagamentos!");
            return;
        }

        for(Pagamentos p : pg) {
            System.out.println(p);
        }
    }

    
}
