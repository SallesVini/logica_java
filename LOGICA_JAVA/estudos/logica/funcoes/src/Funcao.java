package logica.funcoes.src;

public class Funcao {
    public static void main(String[] args) {
        
        // Normalmente uma função em Java é definida com um tipo de retorno, um nome e pode ou não
        // Receber parâmetros

        // A função pode ser criada sem parâmetros e sem retorno, essas são melhores para tarefas simples
        // que não requerem entrada ou saída

        // Sintaxe Básica: Consiste em um cabeçalho que inclui o tipo de retorno (void sem retorno)
        // e o corpo da função, onde o código é executado

        // Chamando a função: A função é invocada pelo seu nome, e o código dentro dela é executado
        // sempre que chamada


        // OBS:
        // Então sempre que for criar uma função(ou método) em Java - devemos colocar o acesso(Public/Private)
        // O tipo de retorno que essa função(ou método vai retornar) - int, double, String ou void(sem retorno)
        // E verificar se ela(função) vai receber parâmetros ou não e por último o bloco de código dela 


        // E para executar a função criada, a função saudacao(), precisamos chamar ela aqui dentro do main()
        saudacao();

        
        // Chamando a função soma()
        soma(2, 4);


        // Chamando a função saudar()
        saudar("Vinicius");


        // Chamando a função dobrar()
        // O valor que a função dobrar() retorna será armazenado na variável int numero
        int numero = dobrar(4);
        System.out.println(numero);


        // Chamando a função verificarPar()
        String r1 = verificarPar(2);
        String r2 = verificarPar(7);

        System.out.println(r1);
        System.out.println(r2);


        // Chamando a função calcularMedia()
        System.out.println(calcularMedia(5, 6, 7));
    }


    // E como em Java funções são métodos, logo não criamos funções dentro do método main()
    // Criamos funções(métodos) dentro da classe Funcao, no mesmo nível do main()

    // E para criar nossas funções no Java - vamos utilizar essas propriedades

    // NIVEL DE ACESSO (Public, Private, Static) - Como é uma função que só vai executar um bloco de código
    // Específico, ou seja, ela não vai depender de uma informação específica de um objeto(usuário) 
    // ela vai servir para qualquer objeto(usuário), então vamos utilizar o NIVEL DE ACESSO "PUBLIC STATIC"
    // Porque com isso não precisamos de classe para chamar essa função no main()

    // Se sua intenção é apenas criar uma função genérica que executa um bloco de código
    // (como em JavaScript, Python ou C), e você não precisa de atributos ou objetos, então sim,
    // você usa "PUBLIC STATIC" por padrão em Java

    // TIPO DE RETORNO (Void - vazio, Int - retrna inteiro, Double - retorna double)

    // NOME DA FUNÇÃO

    // PUBLIC STATIC INT NOME() {}
    public static void saudacao() {
        System.out.println("Olá, está é a minha primeira função!");
    }




    // ------------------------------------ // ---------------------------------- //

    // Diferença entre Função main() e Funções normais

    // Main()
    // É o ponto de entrada do programa, onde a execução do programa começa
    // Todo programa Java precisa de uma função main() para ser executado
    // A função main() pode chamar outras funções e métodos dentro dela

    // Função
    // Criadas para dividir o código em partes menores e gerenciáveis
    // Podem ter diferentes tipos de retorno, nomes, e receber parâmetros
    // Podem ser chamadas várias vezes em diferentes partes do programa
    // São executadas apenas quando chamadas pelo código, diferente do main()
    // Que é executado automaticamente

    // ------------------------------------ // ---------------------------------- //




    // Função que recebe parâmetros
    // E em Java funções e métodos que recebem parâmetros, nos parâmeros também precisamos deifinir
    // Os tipos dos parâmetros

    // Como essa função é void(não vai retornar nada), então só vamos exibir a soma desses parâmetros
    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da soma é: " + resultado);
    }


    // Função saudar() que recebe uma String
    public static void saudar(String nome) {
        System.out.println("Olá " + nome + ", bem vindo!");
    }


    // Return em funções
    
    // "return" é uma instrução que finaliza a execução de uma função e, opcionalmente, devolve um
    // valor ao ponto onde a função foi chamada
    
    // Tipos de Retorno: O return pode retornar valores de qualquer tipo, incluindo tipos primitivos
    // objetos, ou nenhum valor (void)

    // O return permite que funções realizem cálculos ou operações e enviem o resultado de volta
    // para ser utilizado em outras partes do programa


    // Criando uma função que vai retornar um valor inteiro, então essa não será mais "void"
    // E sim uma função "int"
    // Ela vai receber um valor inteiro, e vai retornar esse valor inteiro dobrado(multiplicado por 2)
    public static int dobrar(int n) {
        return n * 2;
    }



    
    // Encapsulando retorno em variável

    // O processo de armazenar o resultado(o retorno) de uma função em uma variável para uso
    // posterior
    // Permite reutilizar o valor retornado por uma função em várias partes do código
    // aumentando a modularidade e a legibilidade

    // Uso Comum: Armazenar resultados de cálculos, verificações ou operações complexas para evitar
    // chamadas repetidas à mesma função

    // Encapsular o retorno em uma variável pode ajudar a simplificar o código e reduzir a
    // necessidade de executar novamente a função

    // Vamos criar uma função que verifica se um número inteiro é par
    // Então ela vai receber um inteiro e vai retornar uma String(um texto)
    // Logo essa função vai ser do tipo String, mas ela pode receber um valor de outro tipo
    // Com o entanto que ela retorne uma String
    public static String verificarPar(int n) {
        if(n % 2 == 0) {
            return "O número: " + n + " é Par";
        } else {
            return "O número: " + n + " não é Par";
        }
    }



    // Funções com System.exit

    // O método System.exit(int status) encerra imediatamente a execução do programa
    // finalizando todas as operações em andamento

    // O argumento int status indica o estado de término do programa, um valor de 0 geralmente
    // indica uma saída bem-sucedida, enquanto valores diferentes de 0 indicam erros

    // Como o System.exit termina o programa abruptamente, deve ser usado com cuidado,
    // normalmente em situações de erro crítico ou quando não há mais nada a ser feito

    // Casos de uso:
    // Tratamento de Erro: Em cenários onde o programa não pode continuar devido a um erro crítico
    // Interrupção Controlada: Quando o programa atinge um estado em que deve ser encerrado
    // imediatamente, como após confirmar a saída do usuário


    // Vamos criar uma função de autenticação que vai receber uma String usuário e uma String senha
    // E não vai retornar nada 
    // E vamos simular uma lógica de login
    public static void verificarAutenticacao(String usuario, String senha) {

        // Se a String usuario não for igual a String "admin" - por isso estamos negando
        // E se a String senha não for igual a String "SenhaSegura"
        // Aí entra nesse IF()
        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou!");
            System.exit(1); // Se chegar aqui ele vai finalizar todo o programa e não executa mais nada
        }

        System.out.println("Autenticação bem sucedida!");
    }



    // Documentação de funções
    
    // Fornece informações detalhadas sobre o que a função faz, seus parâmetros, valor de retorno, e outros
    // detalhes relevantes
    // Utiliza o formato javadoc (/**...*/) para gerar a documentação automática e legível, que poder ser
    // visualizada em IDEs e ferramentas de documentação

    // É a mesma documentação que fazemos para métodos e classes


    // Vamos criar uma função que calcula a média de um aluno
    // Como podemos retornar valores decimais, ela vai retornar um double
    // E ela vai receber valores inteiros


    // Criando a sua documentação

    /**
     * Calcula a média de 3 números inteiros
     * 
     * @param num1 o primeiro número/nota a ser enviado
     * @param num2 o segundo número/nota a ser enviado
     * @param num3 o terceiro número/nota a ser enviado
     * 
     * @return retorna a média dos três números/notas
    */
    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }



    // Função Built-in

    // Função Built-in são funções já incorporadas na linguagem Java que fornecem funcionalidades comuns
    // e essenciais. Elas são prontas para uso e não precisam ser definidas pelo programador

    // Agora vamos ver algumas dessas funções já prontas do Java

    
    
    // Funções Built-in de Strings:

    // length() - Retorna o comprimento de uma string, ou seja, o número de caracteres;
    
    // substring(int beginIndex, int endIndex) - Extrai uma subsequência da string
    // começando no índice beginIndex e terminando no índice endIndex;

    // toUpperCase() - Converte todos os caracteres da string para letras maiúsculas;

    // replace(char oldChar, char newChar) - Substitui todas as ocorrências de um caractere
    // específico por outro.


    /*
     * String frase = "Java é muito bom";
     * 
     * System.out.println(frase.length());
     * System.out.println(frase.substring(0, 4)); - vai printar a palavra 'Java'
     * System.out.println(frase.toUpperCase());
     * System.out.println(frase.replace('a', 'e')); - vai trocar todos os 'a' da String por 'e'
    */



    // Funções Built-in de Números (Math):

    // Temos algumas funções Built-in para números e elas são:


    // Math.sqrt(double a) - Calcula a raiz quadrada de um número;

    // Math.pow(double a, double b) - Eleva um número 'a' à potência 'b';

    // Math.abs(int a) - Retorna o valor absoluto de um número;

    // Math.max(int a, int b) - Retorna o maior de dois números.



    /*
     * System.out.println(Math.sqrt(26)); - retorna a raiz quadrada de 26
     * System.out.println(Math.pow(2, 3)); - 2 elevado a 3
     * System.out.println(Math.abs(-10)); - fica "10"
     * System.out.println(Math.max(100, 10)); - retorna "100"
    */



    // Funções Recusiva

    // Recursão é a técnica onde uma função chama a si mesma para resolver um problema
    // que pode ser dividido em subproblemas menores e semelhantes ao original

    // Um caso base/cenário é essencial para terminar a recursão, sem ele, a função
    // entraria em um loop infinito

    // Criando uma função recursiva
    // Ela vai somar números inteiros, na verdade ela vai decrementando o número e somando ele com o anterior
    public static int somaRecursiva(int n) {

        if(n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1); // Vai começar 5(n) + 4(n - 1) e depois continua
        }
    }



    // Sobrecarga de Funções (Sobrecarga de Método)

    // Sobrecarga de funções permite definir várias funções com o mesmo nome, desde que
    // tenham assinaturas diferentes (número de parâmetros ou tipos de parâmetros)

    // Vantagens:
    // Permite criar diferentes versões de uma função para lidar com diferentes tipos de dados ou
    // diferentes quantidades de argumentos
    // Mantém o código limpo e organizado, reutilizando o nome da função para tarefas relacionadas

    // Regras para Sobrecarga:
    // Números de Parâmetros: As funções devem se diferenciar pelo número de parâmetros
    // Tipo de Parâmetros: As funções podem ter o mesmo número de parâmetros, desde que os tipos sejam diferentes
    // Tipo de Retorno: Não pode ser usado sozinho para diferenciar funções sobrecarregadas


    // Criando funções sobrecarregadas
    // Vamos ter 3 funções de soma:

    public static int somando(int a, int b) {
        return a + b;
    }

    public static int somando(int a, int b, int c) {
        return a + b + c;
    }

    public static double somando(double a, double b) {
        return a + b;
    }



    // Funções Anônimas (Lambda Expressions)
    
    // As lambdas são funções anônimas, ou seja, funções sem nome, que podem ser usadas
    // para expressar brevemente pequenas operações ou blocos de código, especialmente
    // em programação funcional

    // OBS:
    // Uma função lambda em Java é uma variável que implementa uma interface funcional

    // Introduzidas no Java 8, as lambdas são uma parte central da API Streams e permitem
    // uma programação mais funcional

    // Sintaxe:
    // (parâmetros) -> {corpo da função}

    // Para expressões simples, o corpo da função pode ser uma única linha sem {}

    // Vantagens:
    // Lambdas permitem escrever código mais conciso e legível
    // São amplamente utilizadas em conjunto com Streams e interfaces funcionais como Comparator


    // Criando uma função lambda
    // E elas vão ter que ser criadas e chamadas dentro do main()

    // E como ela é uma função sem nome, vamos passar ela para uma variável
    // E o tipo dessa variável que recebe essa função lambda
    // vai ser Runnable

    // Você precisa colocar Runnable (ou outro tipo funcional) na variável que recebe uma lambda
    // porque em Java, uma lambda não é um tipo por si só — ela é uma forma compacta de instanciar uma
    // interface funcional

    // Uma interface funcional: É uma interface que possui apenas um método abstrato

    // O compilador vê que Runnable tem um método chamado void run(), sem parâmetros,
    // então ele sabe que essa lambda é equivalente a implementar run()

    // Runnable é uma interface com um método só, o método run()
    Runnable tarefa = () -> System.out.println("Minha função lambda");

    // E para chamar essa função utilizamos o método run()
    // tafera.run();
}
