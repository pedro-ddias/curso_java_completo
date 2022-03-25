import java.util.Scanner;

public class WhileIndeterminado {

    //quando não sabe-se o ponto de parada, somente quando o usuário deseja digitar para parar
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        String valor = "";

        // irá rodar enquanto o usuário não digitar sair, quando você quer que o usuário escolha quando sair
        while(!valor.equalsIgnoreCase("sair")) {
            System.out.println("Você diz: ");
            valor = ler.nextLine();
        }

        ler.close();
    }
}
