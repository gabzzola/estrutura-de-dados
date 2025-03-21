package atividades.atividade2;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ListaSimplesmenteEncadeadaTest {

    @Test
    public void deveRetornarTrueQuandoAmbasAsListasEstiveremVazias() {
        // Arrange
        ListaSimplesmenteEncadeada listaA = new ListaSimplesmenteEncadeada();
        ListaSimplesmenteEncadeada listaB = new ListaSimplesmenteEncadeada();

        // Act
        boolean resultado = listaA.verificarListasIguais(listaB);

        // Assert
        assertTrue(resultado);
    }

    @Test
    public void deveRetornarFalseQuandoUmaListaEstiverVaziaEAOutraNao() {
        // Arrange
        ListaSimplesmenteEncadeada listaA = new ListaSimplesmenteEncadeada();
        ListaSimplesmenteEncadeada listaB = new ListaSimplesmenteEncadeada();
        listaA.adicionarNoInicio("Gabriel", 1);

        // Act
        boolean resultado = listaA.verificarListasIguais(listaB);

        // Assert
        assertFalse(resultado);
    }

    @Test
    public void deveRetornarTrueQuandoAsListasPossuiremDadosIguais() {
        // Arrange
        ListaSimplesmenteEncadeada listaA = new ListaSimplesmenteEncadeada();
        ListaSimplesmenteEncadeada listaB = new ListaSimplesmenteEncadeada();
        listaA.adicionarNoInicio("Gabriel", 1);
        listaB.adicionarNoInicio("Gabriel", 1);
        listaA.adicionarNoInicio("Jennifer", 2);
        listaB.adicionarNoInicio("Jennifer", 2);
        listaA.adicionarNoFinal("Ceci", 3);
        listaB.adicionarNoFinal("Ceci", 3);

        // Act
        boolean resultado = listaA.verificarListasIguais(listaB);

        // Assert
        assertTrue(resultado);
    }

    @Test
    public void deveRetornarFalseQuandoAsListasPossuiremDadosDiferentes() {
        // Arrange
        ListaSimplesmenteEncadeada listaA = new ListaSimplesmenteEncadeada();
        ListaSimplesmenteEncadeada listaB = new ListaSimplesmenteEncadeada();
        listaA.adicionarNoInicio("Gabriel", 1);
        listaB.adicionarNoInicio("Jennifer", 2);

        // Act
        boolean resultado = listaA.verificarListasIguais(listaB);

        // Assert
        assertFalse(resultado);
    }
}
