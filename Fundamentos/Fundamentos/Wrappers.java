package Fundamentos.Fundamentos;

public class Wrappers {
    public static void main(String[] args) {
        // é um embrulho, um empacotador

        // Tipos primitivos
        // Com as inicias maiusculas se transformam em classes e foram criadas como String
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000; //altera para Integer para se ultilizar em Whappers para embrulho em um objeto
        Long l = 100000L; //para a conversão é necessário ter um L maiusculo

        // o valor acossiado a ela
        b.byteValue(); // como o Byte se tornou em objeto, pose-se ultilizar o ponto para acrescentar métodos a esse objeto
        // mas é um objeto já criado no java que o programador não precisa criar ou alterar

        i.parseInt("1000") //como o objeto foi criado e se torna String, o único jeito dele voltar a seu tipo padrão seria com métodos com a notação ponto
        

    }
}
