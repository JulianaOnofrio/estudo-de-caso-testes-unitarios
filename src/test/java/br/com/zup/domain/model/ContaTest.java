package br.com.zup.domain.model;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ContaTest {

    private Conta conta;

    @Before
    public void carregarConta() {
        conta = ContaBuilder.getInstance().conta(10,839,83939,"Juliana").build();
    }

    @Test
   public void builderTeste() {
        assertTrue(conta != null);
    }

    @Test
    public void saqueTeste() {
        conta.saca(10);
        boolean saca = Double.compare(conta.getSaldo(), 0) == 0;
        assertTrue(saca);
    }

        @Test
   public void depositaTeste() {
        conta.deposita(20);
        boolean depositou = Double.compare(conta.getSaldo(),30) == 0;
        assertTrue(depositou);
    }

    @Test
    public void transfereTeste() {
        Conta conta2 = ContaBuilder.getInstance().conta(0,1,111,"ZUP").build();
        conta.transfere(conta2,10);
        boolean transferiu = Double.compare(conta2.getSaldo(),10) == 0;
        assertTrue(transferiu);
    }
}