package Fundamentos.Fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // TIPOS INTEIROS
        // byte -1
        // short - 2
        // int - 4
        // long - 8

        byte c = 23;
        short d = 5452;
        int e = 123_578_566;
        long f = 553_272_674_167L; // colocar o "L" no final para identificação de um long
        System.out.println(c + d + e + f);

        // TIPOS DECIMAIS - pontos flutuantes
        // float
        // double (maior - duas vezes o float);

        float g = 11_420.44F; // colocar o "F" no final para identificação de um float
        double vendas = 2_5212_456_542.01; // É necessário o ponto de casa decimal, caso controtário o float não
                                           // funciona
        System.out.println(g + vendas);

        // Char - caracter, delimitado por aspas simples
        // BOOLEAN - verdadeiro ou falso

        boolean h = false; // ou true
        char i = 'A'; // campo só aceita um caracter, pode ser n° também
        System.out.println(h + "/" + i);
        
        // Uma variável de tipo menor para maior é tranquilo para não perder informação

        int a = 3; // esse variável foi criado com double mas é um int (n° inteiro)
        double b = 3.2; // números decimais vão ser semple logados como double

        System.out.println(a);
        System.out.println(b);

    }
}