package IfElse;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // domingo = 1
        // quarta = 4

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome de um dia da semana");
        String dia = ler.nextLine();

        if (dia.equalsIgnoreCase("domingo")) {
            System.out.println(1);
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("sábado")) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido");
        }

        ler.close();
    }

}