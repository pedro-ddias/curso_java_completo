package Fundamentos.Fundamentos;

public class desafioAreaCircunferencia {
    
    public static void main(String[] args) {
        
        //variavel inteira, primitiva
        int raio;

        //variavel usada pronto para separar ao lugar de virgula
        double raio1 = 3.4;

        //coloca-se a palavra final na frente para NÃO poder alterar esse valor ao decorrer do código, VALOR ESTATICO
        //a letra maiuscula é mais usual quando a palavra é estatica
        final double PI = 3.14159;

        //atribuindo o novalor valor ao raio dependendo do exercicio
        raio = 10;

        //colocando o resultado da operação em uma variável
        double area = raio * raio1 * PI;


        // o + é para concatenar as informações, juntar para aparecer no terminal
        System.out.println("Area =" + area);
    }
}
