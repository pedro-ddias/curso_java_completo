package Fundamentos.Fundamentos;
import java.util.*;

public class Console {
    public static void main(String[] args) {
        
        //Pegar informações do teclado a partir do console
        Scanner ler = new Scanner(System.in);
                                    //entrada no sistema in

        System.out.printf("Salário: %.2f", 1234.5678);

        System.out.println("\nDigite o seu salário: ");
        double salario = ler.nextDouble();
        System.out.printf("Salário: %.2f", salario);
    }
}
