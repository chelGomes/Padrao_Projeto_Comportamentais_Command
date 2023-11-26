public class FechamentoContaTarefa implements Tarefa{
    private ContaBancaria conta;

    public FechamentoContaTarefa(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void executar() {
        this.conta.fecharConta();
    }

    @Override
    public void cancelar() {
        this.conta.abrirConta();
    }
}
