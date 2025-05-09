package exercicios.logica;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        // Pedir peso em kg
        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        // Pedir altura em m
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        // Calcular IMC
        double imc = peso / (altura * altura);


        // Exibir classificação
        if(imc < 18.5) {
            System.out.println("Seu IMC é: " + imc + " Abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.9) {
            System.out.println("Seu IMC é: " + imc + " Peso normal");
        } else if(imc >= 25 && imc < 29.9) {
            System.out.println("Seu IMC é: " + imc + " Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
