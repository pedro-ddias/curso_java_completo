package Fundamentos.Fundamentos;
// pacote fica fora da definição de classe 

// java é um linguagem que visa sempre o uso de classes

// fica fora da classe, porque está puxando para todo o código
import java.util.Date;

public class Import {
    public static void main(String[] args) {
        String s = "Bom dia";
        System.out.println(s);
        // não precisa importar nada

        // nem tudo sempre está disponível sem import
        // algumas coisas você terá que puxar de uma "coisa" já criada no java
        Date d = new Date();
        System.out.println(d);

    }
}
