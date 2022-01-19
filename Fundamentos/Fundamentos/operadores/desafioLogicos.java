package Fundamentos.Fundamentos.operadores;

public class desafioLogicos {
    public static void main(String[] args) {
        
        boolean trab1 = false;
        boolean trab2 = false;

        // só compra a tv se trabalhou nos dois empregos
        boolean comprouTv50 = trab1 && trab2;
        System.out.println("Comprou tv50:" +comprouTv50);

        //se nenhum trabalho der certo ele não vai comprar e se os dois derem certo tambem não vai comprar porque comprou 50
        boolean comproutv32 = trab1 ^ trab2;
        System.out.println("Comprou tv32: " +comproutv32);

        // se trabalhou em algum dos dois empregos ele compra o sorve
        boolean comprouSorvete = trab1 || trab2;
        System.out.println("Comprou sorvete: " +comprouSorvete);

        System.out.println("Está saudável: " +!comprouSorvete);
    }
}
