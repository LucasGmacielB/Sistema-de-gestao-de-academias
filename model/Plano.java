package model;

public class Plano {
    private String nome;
    private double preco;
    private int duracao;
    private int id;

    
    public Plano(String nome, double preco, int duracao, int id) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String infoPlanos = String.format("ID: %s | Nome do plano: %s | Preço: %.2f | Duração: %d mes(s)", id, nome, preco, duracao);
        return infoPlanos;
    }
}
