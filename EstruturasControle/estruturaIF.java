import java.util.Scanner;

public class estruturaIF {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a média");
        double media = ler.nextDouble();

        if (media >= 7.0) {
            System.out.println("Aprovado, Parabens");
        } else if (media < 7.0 && media >= 4.5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        ler.close();
    }
}
