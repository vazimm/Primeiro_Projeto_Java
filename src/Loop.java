import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe quantos usuários irão \nfazer a crítica do filme:");
        int n_pessoas = input.nextInt();
        double mediaAvalicao = 0;
        double nota;

        int i;

        for (i = 0; i < n_pessoas; i++) {
            System.out.printf("Diga sua avalição para o filme\nUsuário %d°\n", i + 1);
            nota = input.nextDouble();
            mediaAvalicao += nota;
        }

        double divisor_da_media = i;

        double media = mediaAvalicao/divisor_da_media;

        System.out.printf("Média da avaliação das notas do filme: %.1f", media);
        input.close();
    }
}