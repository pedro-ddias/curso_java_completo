package Fundamentos.Fundamentos;

import javax.swing.JOptionPane;

public class conversaoStringNumero {
    public static void main(String[] args) {

        // irá aparecer uma tela para você digitar
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número:");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número:");

        // não vai somar, comente juntar a String
        System.out.println(valor1 + valor2);

        // atribuir a uma variavel a conversão de String para Double
        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);

        double soma = num1 + num2;
        System.out.println(soma);

    }
}
