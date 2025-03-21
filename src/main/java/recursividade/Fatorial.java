package recursividade;

public class Fatorial {
    public static int calcular(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcular(n - 1);
    }
}
