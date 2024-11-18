
package davi;

import org.junit.Test;
import static org.junit.Assert.*;


public class AnimalTest {

    @Test
    public void testHeranca() {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        assertEquals("RUFF RUFF", cachorro.emitirSom());
        assertEquals("Miau", gato.emitirSom());
    }
}
