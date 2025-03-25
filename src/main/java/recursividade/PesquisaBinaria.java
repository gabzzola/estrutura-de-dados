package recursividade;

public class PesquisaBinaria {
    public static int pesquisar(int[] vetor, int n, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;
        if (vetor[meio] == n) {
            return meio;
        }

        if (vetor[meio] > n) {
            return pesquisar(vetor, n, inicio, meio - 1);
        }
        return pesquisar(vetor, n, meio + 1, fim);
    }
}
