package Fundamentos.Fundamentos.conversao;

public class conversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 1000;

        //numero (int) convertido em String
        System.out.println(num1.toString());

        // propiedade dada pela notação ponto para saber quantos caracteres existem, só funciona quando são Strings
        System.out.println(num1.toString().length());

        int num2 = 17;

        // É possivel converter o tipo primitivo desde que passe o Tipo 
        System.out.println(Integer.toString(num2));
    }
}
