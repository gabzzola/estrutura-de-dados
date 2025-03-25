package recursividade;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PesquisaBinariaTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 5, 0 },
                { 25, 4 },
                { 50, 9 },
                { 3, -1 },
        });
    }

    @Parameterized.Parameter()
    public int n;

    @Parameterized.Parameter(1)
    public int resultadoEsperado;

    @Test
    public void deveEncontrarOIndiceDoValorSolicitado() {
        int[] vetorOrdenado = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int inicio = 0;
        int fim = vetorOrdenado.length - 1;

        int resultadoAtual = PesquisaBinaria.pesquisar(vetorOrdenado, n, inicio, fim);

        assertEquals(resultadoEsperado, resultadoAtual);
    }
}
