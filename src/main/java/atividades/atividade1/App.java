package atividades.atividade1;

public class App {
    public static void main(String[] args) {
        double MEDIA = 7.0;
        double[] notas = { 4.5, 5.2, 9.6, 9.2, 8.6, 7.0, 6.7, 8.4, 7.2, 7.0 };

        int abaixoMedia = 0;
        int naMedia = 0;
        int acimaMedia = 0;

        for (double nota : notas) {
            if (nota < MEDIA) {
                abaixoMedia++;
            } else if (nota == MEDIA) {
                naMedia++;
            } else {
                acimaMedia++;
            }
        }

        System.out.printf("%d aluno(s) abaixo da média%n", abaixoMedia);
        System.out.printf("%d aluno(s) na média%n", naMedia);
        System.out.printf("%d aluno(s) acima da média%n", acimaMedia);
    }
}
