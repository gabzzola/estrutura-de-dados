package recursividade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FatorialTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1 },
                { 1, 1 },
                { 3, 6 },
                { 9, 362880 },
        });
    }

    @Parameterized.Parameter()
    public int n;

    @Parameterized.Parameter(1)
    public int resultadoEsperado;

    @Test
    public void deveCalcularOFatorialCorretamente() {
        int resultadoAtual = Fatorial.calcular(n);
        assertEquals(resultadoEsperado, resultadoAtual);
    }
}
