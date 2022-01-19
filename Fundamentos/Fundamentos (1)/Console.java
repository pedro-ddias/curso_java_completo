package Fundamentos.Fundamentos;

import java.util.*;

public class Console {
    public static void main(String[] args) {

        // Pegar informações do teclado a partir do console
        Scanner ler = new Scanner(System.in);
        // entrada no sistema "in"

        System.out.printf("Salário: %.2f", 1234.5678);

        System.out.println("\nDigite o seu salário: ");
        double salario = ler.nextDouble();

        // imprimir na tela
        System.out.printf("Salário: %.2f", salario);

        // todos tipos primitivos tem uma forma para entrar na onjeto Scanner
        ler.nextDouble();

        ler.close();
    }
}
