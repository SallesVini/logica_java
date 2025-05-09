package estrutura_while;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        // Vamos criar um exemplo utilizando while() aqui
        // Nesse exemplo temos um menino chamado Joãozinho
        // E Joãozinho ganhou uma mesada de R$50,00 e quer
        // Gastar toda essa mesada numa loja de doces

        // Então "enquanto" Joãozinho tiver dinheiro para
        // Comprar doces, ele vai poder colocar doces no carrinho
        // Então ele só vai parar de colocar doces no carrinho
        // Quando a sua mesada chegar a 0

        // E essa é a condição do while()
        // Quando o valor de mesada chegar a 0 termina o laço

        double mesada = 50.0;

        while(mesada > 0) {
            // Vamos criar uma variável chamada valorDoce
            // Que vai receber uma função(metodo) que gera
            // Valores aleatórios para simular valores diferentes
            // Para cada doce que ele pegar
            // Para isso vamos usar o metodo ThreadLocalRandom
            double valorDoce = valorAleatorio();

            // Se o valor do doce for maior que a mesada
            // Vamos deixar o valor do doce igual a da mesada
            if(valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println("Doce de valor: " + valorDoce + "Adicionado ao carrinho");

            // Essa é a condição que faz descontar o valor do doce da mesada
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    // Metodo que gera valores aleatórios entre 2 e 8 para os doces
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
