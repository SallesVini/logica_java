package condicional_ternario;

public class SistemaEscolar {
    public static void main(String[] args) {

        /*
        * Agora vamos ver como abreviar nosso algorítmo
        * condicional da classe de ResultadoEscolar
        * Só que agora em vez de usar IF() - ELSE IF() - ELSE
        * Vamos utilizar o operador ternário
        * que consegue simplificar estruturas condicionais
        */

        int nota = 7;

        // Operador ternário
        // condição ? "true" : "false";
        // condição ? "true" : 2 condição ? "true" : "false";

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
