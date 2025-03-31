import java.util.Scanner;

public class AnotherLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1){
            int num_p = totalDeNotas + 1;
            System.out.printf("Diga sua avalição para o filme\n%d° Usuário :\nCaso deseje encerrar digite -1\n", num_p);
            nota = input.nextDouble();

            if (nota != -1) {
                mediaAvalicao += nota;
                totalDeNotas++;
            }

        }

        if (mediaAvalicao != 0) {
            System.out.printf("Média da avaliação das notas do filme: %.1f", mediaAvalicao/totalDeNotas);
        } else {
            System.out.println("Operação cancelada");
        }

        input.close();
    }
}
