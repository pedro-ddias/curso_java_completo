import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        
        // do {} while (...); 
        // a expressão vem ao final 
        // o blco do while será executada pelo menos uma vez, todas as outras podem rodar ou não rodar

        Scanner ler = new Scanner (System.in);

        String text = "";
        do {
            System.out.println("Falar palavras: ");
            System.out.println("Quer sair?");
            text = ler.nextLine();
        } while (!text.equalsIgnoreCase("sim"));
        System.out.println("Obrigado!");

        ler.close();
    }
}
