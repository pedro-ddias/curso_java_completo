package Fundamentos.Fundamentos.operadores;

public class desafioAritmeticos {
    public static void main(String[] args) {
        
       // função para elevar -> Math.pow(a, b);

       int a = (6 * (3+2));
       int b = 1-5;
       int c = 2-7;
       int bc = b*c;

       int divisor1 = 3*2;
       double divisor2 = Math.pow(2, 2);

       double parte1 = (Math.pow(a, 2) / divisor1);
       double parte2 = (Math.pow(bc, 2) / divisor2);
       
       double phd = parte1 - parte2;

       double pedro = Math.pow(phd, 3);
       double divisorPEdro = Math.pow(10, 3);

       double resultado = pedro / divisorPEdro;
       System.out.println("Resultado é: "+ resultado);

    }
}
