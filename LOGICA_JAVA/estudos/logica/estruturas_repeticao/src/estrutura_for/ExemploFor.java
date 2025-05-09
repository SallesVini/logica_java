package estrutura_for;

public class ExemploFor {
    public static void main(String[] args) {
        // Vamos imaginar que Joãozinho precisa contar até 20
        // carneirinhos para pegar no sono

        // Com isso podemos criar um laço de repetição usando
        // O For() para criar esse algoritmo onde fazemos
        // Joãozinho contar 20 carneirinhos para ir dormir


        // Precisamos montar nosso FOR() onde temos:

        // Uma variável inteira chamada carneirinhos
        // Que se inicia em 1 - no primeiro carneirinho

        // Temos uma condição booleana no FOR() que verifica-se
        // A variável carneirinhos é menor ou igual a 20
        // Enquanto carneirinhos for menor que 20 o FOR()
        // executa repetidamente o bloco de código
        // Mas quando carneirinhos for maior que 20, ele para

        // E temos o incremento da variável carneirinhos
        // Que vamos colocar para que o FOR() consiga chegar
        // No carneirinho 20 e com isso finalize, evitando
        // Um loop infinito dentro do FOR()

        for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos " + carneirinhos);
        }

        System.out.println("Joãozinho dormiu");
    }
}
