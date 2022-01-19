package Fundamentos.Fundamentos.operadores;

public class operadoresLogicos {

    public static void main(String[] args) {

        /**
         * TABELA VERDADE DO: && - E
         * V && V -> V
         * V && F -> F
         * F && V -> F
         * F && F -> F
         * __________________________________
         */

         /**
         * TABELA VERDADE DO: || - OU
         * V || V -> V
         * V || F -> V
         * F || V -> V
         * F || F -> F
         * __________________________________
         */

         /**
         * TABELA VERDADE DO: ^ - OU EXCLUSIVO
         * V ^ V -> F
         * V ^ F -> V
         * F ^ V -> V
         * F ^ F -> F
         * __________________________________
         */

         /**
         * TABELA VERDADE DO: ! - NOT
         * !V -> F
         * !F -> V
         * __________________________________
         */

        boolean condicao1 = true;
        boolean condicao2 = 3>7; //altomaticamente vira false porque a operação do resultado está incorreto
        
        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2);
        System.out.println(!condicao1);
        System.out.println(!condicao2);
    }
}
