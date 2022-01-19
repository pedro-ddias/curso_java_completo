package Fundamentos.Fundamentos.conversao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class desafioConversao {
    public static void main(String[] args) {

        String val1 = JOptionPane.showInputDialog(
                "Digite o primeiro número").replace(",", ".");
        String val2 = JOptionPane.showInputDialog(
                "Digite o segundo número").replace(",", ".");

        System.out.println(val1 + val2);

        double num1 = Double.parseDouble(val1);
        double num2 = Double.parseDouble(val2);

        System.out.println("A soma é: " + (num1 + num2));
        System.out.println("A média é: " + (num1 + num2) / 2);

        //__________________________________________________________________________________________________________________________

        Scanner ler = new Scanner(System.in);

        // o replace serve para alterar toda vírgula por ponto para não atrapalhar na
        // conversão de double

        System.out.println("Digite o primeiro número");
        String valor1 = ler.nextLine().replace(",", ".");

        System.out.println("Digite o segundo número");
        String valor2 = ler.nextLine().replace(",", ".");

        System.out.println("A soma de String: " + valor1 + valor2);

        // realizar conversão
        double number1 = Double.parseDouble(valor1);
        double number2 = Double.parseDouble(valor2);

        System.out.println("A soma é: " + (number1 + number2));
        ler.close();
    }

}
