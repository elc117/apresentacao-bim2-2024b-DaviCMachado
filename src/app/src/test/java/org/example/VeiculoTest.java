
package davi;

import org.junit.Test;
import static org.junit.Assert.*;

public class VeiculoTest {

    @Test     
    public void testPolimorfismo() {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        // Teste de polimorfismo
        assertEquals("Carro acelerando", carro.acelerar());
        assertEquals("Moto acelerando", moto.acelerar());

        // Tratando ambos os objetos como Veiculo
        Veiculo[] veiculos = {carro, moto};
        for (Veiculo veiculo : veiculos) {
            assertNotNull(veiculo.acelerar());
        }
    }
}
