package testes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class MinhaClasseTest {
    @Test
    public void testarMetodo() {
        MinhaClasse minhaClasse = new MinhaClasse();
        int resultado = minhaClasse.multiplicar(2, 3);
        assertEquals(6, resultado);
    }
}
