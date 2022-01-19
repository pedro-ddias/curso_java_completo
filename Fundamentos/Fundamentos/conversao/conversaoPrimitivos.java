package Fundamentos.Fundamentos.conversao;

public class conversaoPrimitivos {

    public static void main(String[] args) {

        // byte, shot, int e long
        // ____________________________
        // ordem de tramanho respectivamente e realizando a conversão não tem perca de
        // informação (implicita), somente o contrário (explicita)

        double a = 1; // conversão implicita
        System.out.println(a);

        float b = 1.0F; // colocar F ou pelo cast
        float b1 = (float) 1.0; // conversão explicita - não ouve perca mas precisou informar a conversão para o
                                // java (CAST)
        System.out.println(b);
        System.out.println(b1);
        // ____________________________

        int c = 4;
        byte d = (byte) c; // o javasó olha os tipos, não os valores
        // conversão explicita
        System.out.println(d);
        // ____________________________

        double e = 1.0; 
        int f = (int) e; //conversão explicita porque o java analisa os tipos, não os valores
        System.out.println(f);
        // ____________________________
    }
}