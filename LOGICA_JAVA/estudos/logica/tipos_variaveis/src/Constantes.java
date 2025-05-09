package logica.tipos_variaveis.src;

public class Constantes {
    public static void main(String[] args) {

        // Constantes são variáveis que não podem ter seu valor alterado
        // E em Java para criarmos constantes utilizamos a palavra reservada "final"

        // final: Define uma variável como constante, impedindo que seu valor seja alterado
        // após a inicialização
        // Uma vez atribuído, o valor não pode ser modificado
        // Boas práticas: Usado para valores que não devem mudar durante a execução do programa
        // como PI ou taxas de juros

        // Convenção de nomes: Constantes geralmente são nomeadas em letras maiúsculas com palavras separadas
        // por sublinhados (_)


        // Criando uma constante que armazena a quantidade de dias da semana
        final int DIAS_DA_SEMANA = 7;

        System.out.println("A semana tem: " + DIAS_DA_SEMANA + " dias");
    }
}
