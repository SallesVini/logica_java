package try_catch;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        // Utilizando a classe AboutMe
        // Onde ela recebe dados do usuário via terminal
        // Vamos utilizar nela o bloco try/catch
        // Para tratar possíveis erros de entrada do usuário, como:
        // - Nome contendo caracteres especiais
        // - Idade inserida como texto em vez de número
        // - Altura informada com vírgula ao invés de ponto (formato inválido)

        // Ao verificar essas entradas incorretas, usaremos try/catch
        // para capturar as exceções geradas (como InputMismatchException ou NumberFormatException)
        // e lançar uma exceção(aviso) personalizada ou exibir uma mensagem de erro,
        // pedindo para o usuario inserir o dado corretamente novamente.

        // Utilizando o bloco try/catch:
        // Dentro do bloco try, tentamos executar o código normalmente,
        // por exemplo, ler e converter os dados informados pelo usuário.

        // Se o usuario informar um dado inválido (como texto no lugar de número),
        // uma exceção será lançada automaticamente pelo Java (como NumberFormatException).

        // O try não "pega" a exceção, ele apenas tenta executar o código.
        // Se uma exceção ocorrer, ela é "capturada" pelo bloco catch.

        // O catch, então, trata essa exceção — seja exibindo uma mensagem de erro
        // ao usuario ou até lançando uma nova exceção personalizada, se necessário,
        // informando que o dado está incorreto.

        // E caso o catch for lançar uma nova exceção informando
        // Ao usuario que o dado está incorreto
        // Para lançar essa nova exceção informando o usuario
        // Ele utiliza a palavra reservada "throw"

        // A palavra "throw" é usada para lançar manualmente uma exceção,
        // seja uma exceção existente do Java (como NumberFormatException)
        // ou uma exceção personalizada criada pelo programador.

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");

            scanner.close();
        }
        // Aqui no catch vamos tentar capturar a exceção
        // InputMismatchException - caso o usuario informe
        // Idade ou altura errado
        // Se o catch viu que aconteceu essa exceção
        // Podemos exibir essa mensagem
        // Nesse catch não lançamos uma nova exceção
        // Só exibimos uma mensagem ao usuario por causa
        // Da exceção que o usuario gerou com o dado errado
        catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
