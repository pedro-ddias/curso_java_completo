package Fundamentos.Fundamentos.operadores;

public class operadoresAritmeticos {
    public static void main(String[] args) {

        System.out.println(2 + 3);

        // o própio Java entende que a variável var se trata de um double após a
        // atribuição
        var x = 34.56;
        double y = 2.2;

        // operações com double sempre será double
        System.out.println(x + y);

        int a = 8;
        int b = 8;

        /**
         * Existe os operadores básicos aritmeticos
         * +
         * -
         * *
         * /
         */

        // operções com int sempre será int
        // Essa operação como é necessário ser int aproxima para o valor mais proximo
        // inteiro do resultado
        System.out.println(a / b);

        // aqui aparece o valor exado porque você realizou a convrsão
        // realização de cash
        System.out.println(a / (double) b);
        System.out.println(a / (float) b); //com a precisão menor


        /**
         *além desses existe o operador MODULO (%)
         * Significa o resto da divisão
         * */

         System.out.println(8 % 3);


    }
}