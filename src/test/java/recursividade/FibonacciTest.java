package recursividade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1 },
                { 2, 1 },
                { 3, 2 },
                { 4, 3 },
                { 5, 5 },
                { 6, 8 }
        });
    }

    @Parameterized.Parameter()
    public int n;

    @Parameterized.Parameter(1)
    public int resultadoEsperado;

    @Test
    public void deveCalcularOFibonacciCorretamente() {
        int resultadoAtual = Fibonacci.calcular(n);
        assertEquals(resultadoEsperado, resultadoAtual);
    }
}
