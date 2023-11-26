public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    private String situacao;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.situacao = "Conta criada";
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirConta() {
        this.situacao = "Conta aberta";
    }

    public void fecharConta() {
        this.situacao = "Conta fechada";
    }

}
