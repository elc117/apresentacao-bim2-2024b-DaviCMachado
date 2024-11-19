

package org.example;

import org.junit.Test;
import static org.junit.Assert.*;


public class GremioTest {

    @Test
    public void testSoma() {
        Gremio objeto = new Gremio();
        int resultado = objeto.soma(2, 3);
        assertEquals(5, resultado); // Verifica se a soma de 2 + 3 é igual a 5
    }
}


