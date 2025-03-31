import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println("Nota :"+ notaDoFilme);
        /* Média calculado por 3 notas estáticas */
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(String.format("%.0f", media));
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento: %d
                """.formatted(anoDeLancamento);
        System.out.println(sinopse);

        int classificação;
        classificação = (int) (media/2);
        System.out.println(classificação);
    }
}