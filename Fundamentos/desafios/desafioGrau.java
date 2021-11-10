package Fundamentos.desafios;

import java.util.*;

public class desafioGrau {

    // (F° - 32) * 5/9 = °C
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
     
        final int x = 32;
        final double y = 5/9.0;
        double c;
        double f;


        System.out.println("\nConversor de graus F para C");
        System.out.println("Diigite quantos graus f");
        f = ler.nextInt();

        // calculante temperatura em celcius
        c = (f - x) * y;

        
        System.out.println("\nSua quantidade em C é: " + c);
        

        ler.close();
    }

}
