package condicional_switch;

public class SistemaMedida {
    public static void main(String[] args) {
        /*
         * Temos mais uma estrutura condicional - que é a estrutura
         * Switch case
         * A estrutura switch compara o valor de cada caso(case) com
         * p valor da variável de forma sequencial, e sempre que
         * encontra um valor correspondente - onde o valor da variável
         * é igual ao valor de um caso(case) - executa o código do case
         */


        // Vamos criar uma classe onde ela precisa imprimir
        // uma medida com base no valor, na sigla daquela medida
        // Então se o valor(sigla) for "P" então ela deve imprimir
        // a medida PEQUENO

        // O break é usado para parar a execução de um case
        // Porque se não colocarmos um break e aquele case
        // For executado, como está sem o break o programa irá
        // Continuar e com isso irá executar os case abaixo
        // Por isso colocamos o break, para o programa executar
        // Apenas o case específico, que tem seu valor igual
        // Ao da variável

        // E o default é como a condição ELSE na estrutura
        // IF() ELSE

        String sigla = "M";

        switch(sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default: {
                System.out.println("INDEFINIDO");
            }
        }
    }
}
