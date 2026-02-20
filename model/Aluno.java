package model;

public class Aluno {
    private String nome;
    private int id;
    private int idade;
    private Plano plano;
    private boolean status;

    public Aluno(String nome, int idade, int id, Plano plano) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Plano getPlano() {
        return plano;
    }
    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        String infoAluno;
        infoAluno = String.format("ID: %s | Nome: %s | Idade: %d | Plano: %s", id, nome, idade, plano.getNome());
        return infoAluno;
    }

    
}
