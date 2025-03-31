import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = input.nextLine();
        System.out.println("Qual o ano de lançamento?");
        int anoDeLancamento = input.nextInt();
        System.out.println("Diga sua avalição para o filme ");
        double avalicao = input.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avalicao);
    }
}
