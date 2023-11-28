import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaBancariaTest {
    ContaBancaria contaBancaria;
    Banco banco;

    @BeforeEach
    void setUp() {
        contaBancaria = new ContaBancaria(12345);
        banco = new Banco();
    }

    @Test
    void deveRealizarAberturaConta() {
        Tarefa operacaoDeposito = new AberturaContaTarefa(contaBancaria);
        banco.processarTransacao(operacaoDeposito);

        assertEquals("Conta aberta", contaBancaria.getSituacao());
    }

    @Test
    void deveRealizarFechamentoConta() {
        Tarefa operacaoSaque = new FechamentoContaTarefa(contaBancaria);
        banco.processarTransacao(operacaoSaque);

        assertEquals("Conta fechada", contaBancaria.getSituacao());
    }

    @Test
    void deveCancelarFechamentoConta() {
        Tarefa operacaoSaque = new FechamentoContaTarefa(contaBancaria);
        banco.processarTransacao(operacaoSaque);

        assertEquals("Conta fechada", contaBancaria.getSituacao());
    }
}
