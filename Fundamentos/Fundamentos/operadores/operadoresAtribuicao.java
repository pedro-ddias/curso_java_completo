package Fundamentos.Fundamentos.operadores;

public class operadoresAtribuicao {
    public static void main(String[] args) {

        int a = 97; // ele atribui um valor a variavel
        int b = a; // como a já foi atribuido a algo, isso se torna válido
        int c = a + b; // atribui o c já com outra operação das outras duas variaveis que só é possivel
                       // porque ja foram declaradas

        c += b; // c = c + b
        c -= a; // c = c - a
        c *= a; // c = c * a
        c /= b; // c = c / b
        c %= 2; // c = c % 2

        System.out.println(c);
    }
}
