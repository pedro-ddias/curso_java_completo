package Fundamentos.Fundamentos.tipos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {
        
        String s = new String("2");
        System.out.println("2" == s);
        System.out.println("2".equals(s)); // o equals irá avaliar o conteúdo, então será verdadeiro

        Scanner ler = new Scanner(System.in);

        String s2 = ler.next();
        System.out.println("2".equals(s2));
        ler.close();
    }
}
