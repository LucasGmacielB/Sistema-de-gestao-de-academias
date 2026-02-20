package repository;

import java.util.ArrayList;
import java.util.List;

import model.Plano;

public class PlanoRepository {

    private List<Plano> planos = new ArrayList<>();

    public void salvar(Plano plano) {
        planos.add(plano);
    }

    public List<Plano> listarTodosPlanos() {
        return planos;
    }

    public Plano buscarIdPlano(int id) {
        for(Plano p : planos) {
            if (p.getId() == id) {
                return p;
            }  
        }
        return null;
    }
}
