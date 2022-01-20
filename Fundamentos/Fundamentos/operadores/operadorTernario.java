package Fundamentos.Fundamentos.operadores;

public class operadorTernario {
    public static void main(String[] args) {
        
        double media = 7.6;
        // a partir do boolean gerado é feito a criação da String separado por ? os operadores
        String resultado = media >= 7.0 ? "Aprovado" : "Reprovado";
        // pode criar operadores ternarios em sequencia
        System.out.println(resultado);

    }
}
