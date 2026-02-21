package model;

import java.time.LocalDate;

public class Pagamentos {
    private Aluno aluno;
    private int id;
    private double valor;
    private Plano plano;
    private LocalDate data;
    private boolean statusPagamento = false;
    
    
    
    public Pagamentos(Aluno aluno, int id, Plano plano) {
        this.aluno = aluno;
        this.id = id;
        this.plano = plano;
        this.valor = plano.getPreco();
        this.data = LocalDate.now();
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Plano getPlano() {
        return plano;
    }
    public void setPlano(Plano nome) {
        this.plano = nome;
    }
    public Aluno getAluno() {
        return aluno;
    }
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public boolean getStatusPagamento() {
        return statusPagamento;
    }
    public void setStatusPagamento(boolean statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    
    
    @Override
    public String toString() {
        String infoPagamentos = String.format("ID: %d | Nome do aluno: %s | Nome do plano: %s | Valor: %.2f | Data: %s ",
        id, 
        aluno.getNome(), 
        plano.getNome(), 
        valor,
        data);
        return infoPagamentos;
    }

    

}
