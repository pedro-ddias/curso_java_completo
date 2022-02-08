package Fundamentos.Fundamentos;

import java.util.Scanner;

public class desafioCalculado {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Qual o primeiro número?");
        double num1 = ler.nextDouble();
        System.out.println("Qual o segundo número?");
        double num2 = ler.nextDouble();

        System.out.println("Digite o símbolo referente a operação que deseja: + | - | * | / | %");
        String op = ler.next();

        double resultado;
        if ("+".equals(op)) {
            resultado = num1 + num2;
        } else if ("-".equals(op)) {
            resultado = num1 - num2;
        } else if ("*".equals(op)) {
            resultado = num1 * num2;
        } else if ("/".equals(op)) {
            resultado = num1 / num2;
        } else {
            resultado = num1 % num2;
        }

        System.out.println("Seu resultado é: " + resultado);
        ler.close();
    }
}
