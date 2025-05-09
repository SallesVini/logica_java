package logica.tipos_variaveis.src;

public class Strings {
    public static void main(String[] args) {

        // Strings são sequências de caracteres usadas para armazenar e manipular texto
        // Classe String: Em Java, as Strings são objetos da classe String e oferecem métodos
        // para manipulação de texto

        // Uma String não pode ser alterada, qualquer modificação gera uma nova String
        // Podemos concatenar (unir) duas strings com o operador +


        // E vamos criar nossa primeira String para armazenar nosso primeiro nome
        // E vamos criar outra String para armazenar nosso último nome
        String firstName = "Vinicius";
        String lastName = "Araujo";


        // E para printar esses dois nomes juntos precisamos concatenar eles usando o operador '+'
        System.out.println(firstName + " " + lastName);


        // Como nossas Strings são dados dinamicos podemos unir elas com outras strings
        System.out.println("O nome dele é: " + firstName);



        // E para comparar Strings no Java, não utilizamos os operadores "=="
        // E sim o método equals() já que uma String no Java é um objeto(classe)

        // O método equals() compara o conteúdo das strings, caractere por caractere
        // É a maneira correta e segura de verificar se duas strings são iguais em valor


        // O método equalsIgnoreCase() - é uma variante de equals() e ignora diferenças entre maiúsculas
        // e minúsculas entre as Strings


        // Comparando Strings

        // Criando as Strings
        String str1 = "Java";
        String str2 = new String("Java"); // Outra forma de criar String

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
