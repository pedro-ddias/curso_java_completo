package Fundamentos.Fundamentos;

// conjunto de caracteres do tipo char
public class TipoString {
    public static void main(String[] args) {
        // mostrar letra no indice zero, começa do 0 e irá crescendo
        System.out.println("Bom dia".charAt(0));

        // objeto imutavel, nunca consegue mudar o valor iniciado
        // você não consegue modificar, mas sim substituir o valor por algo através de métodos
        String s = "Boa tarde";

        //pode usar .concat ou o +
        System.out.println(s + "!!!");

        // descobrir o tamanho da String
        System.out.println(s.length());

        // Compara a String com um objeto qualquer
        System.out.println(s.equals("Boa noite"));

        // através do var criado o java identificará que é um String
        var nome = "Pedro";

        String frase = nome + " está fazendo o curso";
        System.out.println(frase);
    }
}
