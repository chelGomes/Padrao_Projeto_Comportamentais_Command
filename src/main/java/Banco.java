import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Tarefa> transacoes = new ArrayList<>();

    public void processarTransacao(Tarefa transacao) {
        this.transacoes.add(transacao);
        transacao.executar();
    }

    public void cancelarUltimaTransacao() {
        if (!transacoes.isEmpty()) {
            Tarefa transacao = this.transacoes.get(transacoes.size() - 1);
            transacao.cancelar();
            this.transacoes.remove(transacoes.size() - 1);
        }
    }
}
