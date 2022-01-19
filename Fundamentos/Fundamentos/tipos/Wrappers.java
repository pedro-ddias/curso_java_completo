package Fundamentos.Fundamentos.tipos;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        // é um embrulho, um empacotador

        Scanner ler = new Scanner(System.in);

        // Tipos primitivos
        // Com as inicias maiusculas se transformam em classes e foram criadas como
        // String
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; // altera para Integer para se ultilizar em Whappers para embrulho em um objeto
        Long l = 100000L; // para a conversão é necessário ter um L maiusculo
        // ____________________________
        System.out.println(s);
        System.out.println(l);

        // o valor acossiado a ela
        b.byteValue(); // como o Byte se tornou em objeto, pose-se ultilizar o ponto para acrescentar
                       // métodos a esse objeto
        // mas é um objeto já criado no java que o programador não precisa criar ou
        // alterar

        Integer.parseInt("1000"); // como o objeto foi criado e se torna String, o único jeito dele voltar a seu
                                  // tipo padrão seria com métodos com a notação ponto
        System.out.println(i);

        // Passou o determinado valor para o objeto e o converteu em boolean
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        System.out.println(Boolean.valueOf(bo)); // mostrou o valor na variavel, qua a mesma passou de String para ser
                                                 // boolean

        // transforma o boolean em String para pode coloca-lo em letras maiusculas
        System.out.println(bo.toString().toUpperCase());

        Character c = 'b';
        System.out.println(b.toString()); // transformou o caracter em String
        // ____________________________
        System.out.println(c);

        Float f = 12F;
        double d = 123.44;
        // ____________________________
        System.out.println(f);
        System.out.println(d);

        //____________________________
        ler.close();
    }
}
