public class AboutMe {
    public static void main(String[] args) {

        /*
        * Os argumentos começam com indice 0 - já que é um array de String
        * Nessa classe vamos utilizar o metodo main() e vamos utilizar o array de String
        * Dele para receber vários parâmetros(vários argumentos) pelo main()
        * E tratar esses argumentos recebidos pelo main() aqui dentro dele
        * E vamos pegar esses argumentos pelo terminal
        */

        // Estamos utilizando o objeto Integer e Double
        // Para poder utilizar o metodo valueOf() e converter o argumento capturado
        // Para o tipo de dado certo, nesse caso:

        // O metodo Integer.valueOf(String s) converte uma String que
        // representa um número inteiro para um objeto da classe Integer(para inteiro)

        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);


        System.out.println("\nOlá, me chamo " + nome + " " + sobrenome);
        System.out.println("\nTenho " + idade + " anos ");
        System.out.println("\nMinha altura é " + altura + "cm ");
    }
}
