public class For1 {
    public static void main(String[] args) {

        // O MAIS USADO
        // estrutura mais utilizada pa valores conhecidos
        // para quantidades determinada de repetições
        for (int i = 0; i <= 10; i++) {
            System.out.println("Bom dia");
        }

        // não preciso das três variaveis decladas dentro do for´
        // mas faz mais sentido declarados dentro do for, pelo contrário pode ser ultilizado o "while"
        int x = 2;
        for (; x < 10;) {
            System.out.println("x = " + x);
            x++;
        }

        // programa infinito, por o true sempre será verdadeiro caso não passar uma condição
        for(;true;) {
            System.out.println("Fim");
        }
    }
}
