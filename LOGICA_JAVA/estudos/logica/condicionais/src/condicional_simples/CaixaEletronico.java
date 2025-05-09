package condicional_simples;

/**
 * <h1>Classe que representa um caixa eletrônico</h1>
 *
 * <p>
 *     Vamos utilizar ela para praticar uma estrutura condicinal
 *     simples, e entender como funciona o fluxo dessa estrutura
 *     que só utiliza o IF()
 * </p>
 */

public class CaixaEletronico {
    public static void main(String[] args) {

        // Declarando duas variáveis locais em escopo de metodo
        double saldo = 25.0;
        double valorSolicitado = 17.0;


        /*
        * Aqui a condicional simples IF() vai verificar
        * Se o valor soliciado pelo usuário está dentro do
        * Valor do seu saldo em conta, se estiver o código
        * Mostra o saldo para o usuário, se não finaliza
        * O programa
        */

        if(valorSolicitado < saldo) {
            // Se for verdadeiro e entrar no IF() o saldo
            // Vai passar a ter um valor menor, já que está sendo
            // Descontado do valor solicitado
            saldo = saldo - valorSolicitado;
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
