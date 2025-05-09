package logica.tipos_variaveis.src;

public class TiposVariaveis {
	public static void main(String[] args) {
		
		// O que são tipos de dados

		// Na linguagem Java existem algumas palavras reservadas para a representação dos tipos
		// de dados básicos que precisam ser manipulados para a construção do programa
		// Estes tipos de dados são conhecidos como tipos primitivos (Primitive Types)
		
		// E no Java temos 8 tipos primitivos de dados
		
		// int, byte, short, long, float, double, boolean e char
		
		// Esses tipos não são considerados objetos, e portanto representam valores brutos
		// Eles são armazenados diretamente na pilha de memória. (Memory Stack)
		
		// Um ponto curioso é que, por mais que a gente tenha 4 tipos de dados para representar
		// Inteiros, é muito comum a gente utilizar 'int' por questão de compatibilidade com
		// A JVM, ela sempre busca converter tipos de dados literais para 'int'
		// Ou seja, se temos 100 byte - ele(JVM) vai tentar converter para 'int'
		
		// E para números decimais é comum utilizar 'double'
		
		//---------------------------//----------------------------//
		
		// Declaração de variáveis
		
		// Variável é uma identificação de um espaço em memória utilizado pelo nosso programa
		// Seguindo as convenções em linguagem de programação, toda variável é composta por:
		
		// tipo de dados + identificação + valor atribuído
		
		// A estrutura padrão para se declarar uma variável sempre é:
		
		// <Tipo de dado> <nomeVariavel> = <atribuicaoDeValorOpcional>
		
		
		// OBS: se a gente observar o valor de long e float tem que ter a inicial do tipo no final
		// Do valor, ou seja, para escrever o long o valor fica: 203040L;
		// Para escrever o float o valor fica: 3.4050F;
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // Se começar com zero o Java não coloca em um inteiro, melhor String
		int anoFabricacao = 2021;
		long cpf = 98765432109L; // O cpf a mesma regra, caso comece com zero 
		float pi = 3.14F;
		double salarioMinimo = 2.500;
		
		
		//---------------------------//----------------------------//
		
		// Declaração de constante
		
		// A linguagem Java disponibiliza mecanismo para criar constantes, valores(variáveis)
		// Que não podem ter seu valor modificado depois de declarados
		
		// Em java para criar constantes precisamos utilizar a palavra reservada 'final'
		// Seguido do tipo daquela constante(variável) e depois atribuida a um valor
		
		// Por convenção, constantes são sempre escritas em CAIXA ALTA
		
		 final double VALOR_DE_PI = 3.15;
		 
		 // VALOR_DE_PI = 3.15; Essa linha vai apresentar um erro
		 
		 
		//---------------------------//----------------------------//
		 
		// E o tipo de dado String - é uma classe que representa textos
	    // String não é um tipo primitivo do java, ela é uma classe do java que representa texto
		
		String meuNome = "Vinicius Sales";
	}
}
