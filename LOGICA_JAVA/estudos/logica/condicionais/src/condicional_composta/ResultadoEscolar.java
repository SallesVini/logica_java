package condicional_composta;

public class ResultadoEscolar {
    public static void main(String[] args) {
        /*
         * Algumas vezes o nosso programa deverá seguir mais de
         * uma jornada de execução dependendo de uma condição
         * com isso vamos ver a estrutura condicional composta
         * aqui vamos criar um outro fluxo de execução caso
         * a estrutura IF() seja falsa, com isso vamos entrar
         * na estrutura ELSE
         */

        // E vamos criar um sistema de nota escolar
        // Onde se a nota for igual ou maior que 7 a condição
        // É true - entra no IF() e imprime "Aprovado"
        // Se a condição for falsa - nota menor que 7
        // entra no ELSE e imprime "Reprovado"

        int nota = 8;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
