import java.util.Locale;
import java.util.Scanner;

public class AboutMe_Scanner {
    public static void main(String[] args) {

        /*
        * Agora vamos criar o mesmo exemplo da classe AboutMe anterior
        * Vamos receber dados do usuário e printar esses dados na tela
        * Só que agora vamos utilizar a classe do Java para entrada de dados
        * Que é a classe Scanner - ela pertence ao pacote java.util
        * E ela vai ser útil quando a gente quiser pegar e receber dados do usuário
        * Da forma certa, porque ela consegue limitar o dado recebido, informar
        * Qual tipo de dado deve passar e lançar erros caso o usuário passe
        * Um valor errado ao que solicitamos
        */

        // Recebendo dados do usuário com a classe Scanner

        // Para isso precisamos importar o pacote dela e depois instanciar a classe


        // Criando o objeto scanner - instanciando a classe Scanner
        // System.in - é para informar ao Scanner que queremos pegar dados do teclado
        // useLocale(Locale.US) - garante que pegue os dados no formato americano(US)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Pegando o nome do usuário

        // next(): Lê a próxima palavra (até encontrar um espaço)
        // nextLine(): Lê uma linha inteira como texto
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        // Pegando o sobrenome do usuário

        // next(): Lê a próxima palavra (até encontrar um espaço)
        // nextLine(): Lê uma linha inteira como texto
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        // Pegando a idade do usuário

        // nextInt(): Lê um número inteiro
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        // Pegando a altura do usuário

        // nextDouble(): Lê um número decimal (ponto flutuante)
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();


        // imprimindo os dados obtidos pelo usuário
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");


        // Quando você usa Scanner (especialmente com System.in),
        // ele abre um canal de leitura da entrada padrão (teclado)

        // Fecha o scanner e libera os recursos de memória que estava consumindo
        scanner.close();
    }
}
