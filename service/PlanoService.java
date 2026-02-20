package service;

import model.Plano;
import repository.PlanoRepository;

public class PlanoService {
    private PlanoRepository repository;
    private Plano pl;
    private boolean haPlanos;

    public boolean getHaPlanos() {
        return haPlanos;
    }

    public void setHaPlanos(boolean haPlanos) {
        this.haPlanos = haPlanos;
    }

    private int id = 1;

    public PlanoService(PlanoRepository repository) {
        this.repository = repository;
    }

    public void cadastrarPlano(String nome, double preco, int duracao) {
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome: ");
            return;
        }
        if(preco < 0) {
            System.out.println("Não pode haver um preço menor que 0!");
            return;
        } if (duracao < 0) {
            System.out.println("Não pode haver um prazo menor que 0 meses!");   
            return;
        }

        Plano plano = new Plano(nome, preco, duracao, id);
        repository.salvar(plano);

        System.out.println("Plano cadastrado com sucesso!");
        id++;
    }

    public void listarPlanos() {
        if (pl == null) {
            System.out.println("Não foram cadastrados nenhum plano!");
            haPlanos = false;
            return;
        }
        for(Plano p : repository.listarTodosPlanos()) {
            System.out.println(p);
        }
    }

    public void vefiricarId(int id) {
        if (pl == null) {
            return;
        }
        if (id < 0) {
            System.out.println("O código do plano não pode ser negativo!");
            return;
        } else if(id > this.id) {
            System.out.println("O código esta incorreto!");
            return;
        }

    }
}
