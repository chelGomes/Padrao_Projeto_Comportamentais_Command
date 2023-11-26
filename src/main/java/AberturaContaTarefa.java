public class AberturaContaTarefa implements Tarefa{
    private ContaBancaria conta;

    public AberturaContaTarefa(ContaBancaria conta) {
        this.conta = conta;
    }

    @Override
    public void executar() {
        this.conta.abrirConta();
    }

    @Override
    public void cancelar() {
        this.conta.fecharConta();
    }

}
