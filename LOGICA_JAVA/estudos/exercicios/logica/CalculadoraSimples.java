package exercicios.logica;

import java.util.Scanner;

/**
 * 
 * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração
 * 
 * 1 - Pedir dois números para o usuário (double)
 * 2 - Apresentar uma tabela/texto para escolher a operação
 * 3 - Resgatar a operação que o usuário selecionou
 * 4 - Realizar o calculo
 * 5 - Exibir o resultado
 * 6 - Se a operação escolhida for inválida, exbir mensagem de erro
 * 7 - Se a divisão for por 0, exibir mensagem de erro também
 * 
*/

public class CalculadoraSimples {
    public static void main(String[] args) {

        // Vamos utilizar o que vimos até agora para fazer essa calculadora, incluindo loops FOR(), While()
        
        // Instanciando o Scanner()
        Scanner scanner = new Scanner(System.in);
        
        String continuar = "s";

        // Nunca usar os operadores "==" para comparar strings(fazendo 'continuar == s'). Sempre usar equals()
        // Sempre usar equalsIgnoreCase() não se importa com maiúsculo e minúsculo
        while(continuar.equalsIgnoreCase("s")) {
            // 1
            System.out.println("Digite um número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Digite um outro número: ");
            double num2 = scanner.nextDouble();

            // 2
            System.out.println("Escolha uma das operações: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            int opcao = scanner.nextInt();


            if(opcao == 1) {
                System.out.println("Soma");
                double resultado = num1 + num2;
                System.out.println("A soma dos números é: " + resultado);
            } 
            else if(opcao == 2) {
                System.out.println("Subtração");
                double resultado = num1 - num2;
                System.out.println("A subtração dos números é: " + resultado);
            }
            else if(opcao == 3) {
                System.out.println("Multiplicação");
                double resultado = num1 * num2;
                System.out.println("A multiplicação dos números é: " + resultado);
            }
            else if(opcao == 4) {
                if(num2 != 0) {
                    System.out.println("Divisão");
                    double resultado = num1 / num2;
                    System.out.println("A divisão dos números é: " + resultado);
                } else {
                    throw new Error("Operação inválida. Não pode dividir por 0!");
                }
            }
            else {
                System.out.println("Opção inválida! Tente novamente.");
            }

            System.out.println("Deseja continuar usando a calculadora s/n? ");
            continuar = scanner.next();
        }

        scanner.close();
    }
}
