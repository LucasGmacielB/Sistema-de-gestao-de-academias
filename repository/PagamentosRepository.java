package repository;

import java.util.ArrayList;
import java.util.List;

import model.Pagamentos;

public class PagamentosRepository {

    private List<Pagamentos> pagamento = new ArrayList<>();

    public void salvar(Pagamentos pagamento) {
        this.pagamento.add(pagamento);
    }

    public List<Pagamentos> listarTodos() {
        return pagamento;
    }

}
