
package davi;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContaBancariaTest {

    @Test
    public void testGettersAndSetters() {
        ContaBancaria conta = new ContaBancaria("João", 1000.0);
    
        // Teste de encapsulamento usando getters e setters
        assertEquals("João", conta.getTitular());
    
        conta.setTitular("Maria");
        assertEquals("Maria", conta.getTitular());
    
        // Uso do parâmetro delta é necessário para comparar valores do tipo double
        assertEquals(1000.0, conta.getSaldo(), 0.0001);
    }

    @Test
    public void testDepositarESacar() {   
        ContaBancaria conta = new ContaBancaria("João", 1000.0);

        conta.depositar(500.0);
        assertEquals(1500.0, conta.getSaldo(), 0.0001);

        conta.sacar(200.0);
        assertEquals(1300.0, conta.getSaldo(), 0.0001);

        // Tentativa de sacar mais do que o saldo
        conta.sacar(2000.0);
        assertEquals(1300.0, conta.getSaldo(), 0.0001);
    }
}
