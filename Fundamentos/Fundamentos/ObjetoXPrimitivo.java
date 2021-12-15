package Fundamentos.Fundamentos;

public class ObjetoXPrimitivo {
    // java tem seis tipos primitivos como ja foram ditos int, double, float,
    // boolean .....

    public static void main(String[] args) {

        String s = "Bom dia"; // String é uma classe
        // Com o 's' nos temos alguns Objetos para usar

        s.toUpperCase(); //pela notação ponto tem atributos e comportamentos

        String a = new String("texto"); //você tbm pode criar o String como um objeto
        // tudo que não é primitivo é um objeto
        System.out.println(a);

        // Wrappers - versão objetos dos tipos primitivos
        // Os tipos primitivos carregam somente o valor e não existem comportamentos para primitivos, só alterando o este
    }
}
