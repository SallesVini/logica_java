package estrutura_do_while;

import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        // Vamos criar um programa simples só para mostrar a funcionalidade do Do While
        // Aqui vamos pedir um número ao usuário e verificar se esse número é menor ou igual a 10
        // Quando o número for maior para e finaliza o Do While
        // E a diferença do Do While para o While é que o Do While vai executar o pedido do número
        // Antes de verificar se esse número é maior ou menor que 10 antes de continuar o loop

        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite um número maior que 10: ");
            numero = scanner.nextInt();
        } while(numero <= 10);
    }
}

