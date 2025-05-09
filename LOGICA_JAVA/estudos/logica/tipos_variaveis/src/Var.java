package logica.tipos_variaveis.src;

public class Var {
    public static void main(String[] args) {

        // Inferência de Tipo com Var em Java

        // var: Introduzido no Java 10, permite ao compilador inferir o tipo da variável com base no valor passado
        // para a variável - é uma auto indentificação do Java
        // Reduz a necessidade de escrever tipos longos e complexos, aumentando a legibilidade do código

        // Tipo estático: Embora o tipo seja inferido, ele é fixo após a atribuição e não pode ser alterado

        // Regras: Deve ser inicializado no momento da declaração, e não pode ser usado para variáveis não
        // inicializadas

        // Boas práticas: Útil para tipos complexos ou quando o tipo é óbvio a partir do contexto


        // Criando uma variável do tipo 'var'
        var z = 10;

        System.out.println(z);


        // Funciona para qualquer outro tipo
        // String
        var texto2 = "teste";


        // double
        var doubleTeste = 2.0;

        System.out.println(texto2);

        System.out.println(doubleTeste);
    }
}
