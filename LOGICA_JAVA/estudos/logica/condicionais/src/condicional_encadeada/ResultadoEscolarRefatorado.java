package condicional_encadeada;

public class ResultadoEscolarRefatorado {
    public static void main(String[] args) {
        /*
         * No controle de fluxo condicional, nem sempre vamos
         * nos limitar a IF() e ELSE, com isso podemos ter uma
         * terceira condição, ou uma quarta, ou quinta
         * E para isso utilizamos a estrutura ELSE IF()
         */

        // Para ver ela funcionando, vamos refazer a classe
        // ResultadoEscolar, agora utilizando ELSE IF()
        // Caso a nota do aluno seja menor que 7
        // Mas ela também seja maior ou igual a 5
        // Com isso gerando uma terceira condição

        int nota = 6;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota >=5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
