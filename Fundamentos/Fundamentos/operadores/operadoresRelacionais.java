package Fundamentos.Fundamentos.operadores;

public class operadoresRelacionais {
    public static void main(String[] args) {

        //todo operador relacional tem como padrão voltar verdadeiro ou falso´

        int a = 12; //isso você está atribuindo um valor a uma variável
        int b = 12;

        System.out.println(a == b); //aqui você pergunta se é igual, uma operação de igualdade
        /** Temos tbm:
         * >    maior
         * >=   maior igual
         * <    menor
         * <=   menor igual
         * !=   diferente
         * ==   igual a
         */

         double notaAluno = 7.0;
        boolean bomComportamento = true;

        boolean temDesconto = bomComportamento && notaAluno >=7;
        System.out.println("Tem desconto: " +temDesconto);
    }
}
