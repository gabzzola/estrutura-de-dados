package recursividade;

public class Fibonacci {
    public static int calcular(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return calcular(n-1) + calcular(n-2);
    }
}
