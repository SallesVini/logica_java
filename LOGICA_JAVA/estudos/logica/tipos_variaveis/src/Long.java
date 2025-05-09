package logica.tipos_variaveis.src;

public class Long {
    public static void main(String[] args) {

        // Long é um tipo de dado primitivo para armazenar números inteiros muito grandes
        // Ocupa 8 bytes de memória, permitindo armazenar valores de -9.223.372.036.854.775.808 a
        // 9.223.372.036.854.775.807

        // Ideal para calculos financeiros, contagem de tempo, ou quando o tipo int não é suficiente
        // Valores literais do tipo long devem ser seguidos por L (maiúsculo) para indicar o tipo
        // O sublinhado pode ser usado para melhorar a legibilidade em números longos
        // separando em grupos de dígitos EX: 123_456_789_012_345L


        // Criando uma variável long
        long populacaoMundial = 7800000000000L;

        System.out.println(populacaoMundial);


        // Uma forma de representar 1 milhão
        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero + 1);
    }
}
