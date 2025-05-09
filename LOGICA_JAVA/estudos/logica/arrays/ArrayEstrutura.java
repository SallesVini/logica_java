package logica.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayEstrutura {
    public static void main(String[] args) {
        
        // Arrays são estruturas de dados que armazenam múltiplos valores do mesmo tipo em
        // uma única variável

        // Arrays podem armazenar tipos primitivos (como int, double, char) ou objetos (como
        // String ou classes personalizadas)

        // Os elementos de um array são acessados por índices, que começam em 0
        // O tamanho de um array é definido na sua criação e não pode ser alterado
        // Arrays são usados para armazenar listas de dados, como números, nomes, ou
        // qualquer coleção de elementos homogêneos


        /*
         * Em Java temos basicamente dois tipos principais de arrays:
         * 
         * ✅ 1. Arrays fixos
         * São criados com tamanho definido no momento da criação;
         * Não podem mudar de tamanho depois de criados;
         * Usam a sintaxe tradicional com colchetes [].
         * No Java, os arrays fixos são construções especiais da linguagem, e suas classes são geradas automaticamente pela JVM
         * em tempo de execução
         * 
         * ✅ 2. Arrays dinâmicos (criados com as Collections do Java)
         * ArrayList<Integer> lista = new ArrayList<>();
         * Mas esses arrays são classes concretas da Java Collections Framework
         * Uma subclasse de AbstractList
        */
        



        // Sintaxe dos arrays

        // Arrays são declarados especificando o tipo dos elementos seguido de colchetes ([])
        // Arrays podem ser inicializados com valores específicos no momento da declaração ou
        // instanciados com um tamanho fixo
        // Os elementos de um array são acessados usando índices que começam em 0
        
        // Sintaxe: tipo[] nomeArray = new tipo[tamanho]; ou
        // Sintaxe2: tipo[] nomeArray = {valores};




        // Criando arrays

        // Criando um array numérico de 1 a 8
        int[] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8}; // Esse foi inicializado já colocando elementos neles

        System.out.println("Acessando primeiro elemento: " + numeros2[0]);


        // Criando um array de Strings - vamos colocar frutas nele
        String[] frutas = new String[3]; // Esse array foi inicializado, mas ainda não tem elementos
        
        // Adicionando elementos no array frutas[]
        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";

        System.out.println(frutas[1]);


        // Criando um array de preços
        double[] precos = {1.99, 2.45, 4.97};

        // Alterando um elemento do array precos[]
        precos[2] = 5;

        System.out.println(precos[2]);




        // Loops em arrays

        // Loops(laços de repetição) são usados para iterar sobre os elementos de um array, acessando e
        // manipulando cada elemento individualmente
        
        // Você pode usar FOR(), While() ou loops aprimorados(como ForEach) para iterar sobre arrays
        // Percorrer todo os elementos, somar valores, encontrar elementos específicos, modificar valores


        // Iremos somar todos os elementos do array numero[]
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8};

        // Então vamos ter que acessar cada um dos elementos(utilizando um laço de repetição)
        // E vamos condensar(armazenar) a soma de cada um deles em uma única variável chamada soma
        int soma = 0;

        // a propriedade length - vai nos retornar a quantidade de elementos que tem no array
        for(int i = 0; i < numero.length; i++) {
            // Isso aqui vai fazer isso: numero[0](é '1') - logo soma=1; numero[1](é '2') - logo soma= 1 + 2
            soma += numero[i];
        }

        System.out.println("Soma dos elementos: " + soma);


        // Usando ForEach
        // Zerando soma, para agora funcionar com ForEach
        // No ForEach criamos uma variável interna do mesmo tipo de dados que tem no array(por isso: int soma2)
        // E ao colocar dois pontos(:) estamos colocando em soma2 cada elemento do array numero[]
        // A cada iteração
        soma = 0;
        for(int soma2 : numero) {
            soma += soma2;
        }

        System.out.println("Soma dos elementos: " + soma);




        // Encontrar o maior valor de um array

        // Vamos criar um array de inteiros
        int[] valores = {10, 25, 8, 22, 1};

        int maiorValor = valores[0];


        // Encontrando o maior valor
        // Vamos usar um while() para percorrer o array valores[]
        // E vamos colocar uma condicional dentro do while() para verificar se:
        // O valor que está na variável maiorValor é maior que o valor que está vindo pela iteração do while()
        // Ou seja, quando o while() começar a percorrer o array e ele começar a trazer o primeiro valor do
        // Array, o IF() vai verificar se esse valor da primeira iteração do while() é maior ou menor
        // Que o valor que está em maiorValor, se for ele adiciona esse valor a maiorValor, se não for
        // A variável maiorValor continua sendo o maior valor do array
        
        // Variável de controle do while()
        int j = 0;

        while(j < valores.length) { 
            
            if(valores[j] > maiorValor) {
                maiorValor = valores[j];
            }

            j++;
        }

        System.out.println("O maior valor é: " + maiorValor);




        // Concatenar elementos de um array

        // Criando um array de String
        String[] palavras = {"Java", "é", "bom!"};


        // Vamos concatenar todas essas palavras do array com o ForEach
        // Criando a variável frase para armazenar a frase toda concatenada
        String frase = "";

        for(String pal : palavras) {
            frase += pal + " ";
        }

        System.out.println("A frase é: " + frase);




        // Verificar se valor esta presente em um array de caracteres
        char[] letras = {'a', 'e', 'i', 'o', 'u'};


        // Verificando
        char letraProcurada = 'a';

        for(char let : letras) {
            if(letraProcurada == let) {
                System.out.println("A letra " + letraProcurada + " está no array.");
                break;
            } else {
                System.out.println("Letra " + letraProcurada + " não encontrada.");
                break;
            }
        }




        // Atualizações de valores em arrays

        // Criando o array[] de inteiros
        int[] numeroInteiro = {1, 2, 3, 4, 5, 6, 7, 8};

        for(int i = 0; i < numeroInteiro.length; i++) {
            
            // E aqui nesse FOR() vamos percorrer o array numeroInteiro[]
            // E vamos dobrar o valor de cada elemento desse array
            numeroInteiro[i] *= 2;
        }

        System.out.println(numeroInteiro[1]);


        // Imprimindo o array numeroInteiro[] agora com os números dobrados
        for(int num : numeroInteiro) {
            System.out.println("Numero dobrado: " + num);
        }




        // Método toString de Arrays

        // O método toString da classe Array é usado para converter um array em uma representação
        // em String, permitindo a exibição direta do conteúdo do array
        // Uso Comum: Facilita a visualização dos elementos de um array em uma única linha,
        // útil para debug e saída de dados
        
        // Sintaxe: Arrays.toString(array) converte o array em uma string formatada
        // E para utilizar esse método toString precisamos importar a classe Arrays do java.util
        // E podemos utilizar esse método com um array de Strings também, na vdd qualquer array


        // O método toString() em Java é um método utilitário da classe Object
        // (a superclasse de todas as classes em Java) e tem como objetivo
        // converter os dados de um objeto em uma representação do tipo String

        // E como um array é um objeto em Java, por isso ela é um método da classe Arrays do Java
        // Que converte os dados qualquer array(objeto) em uma String

        
        // Criando nosso array
        int[] arrayInt = {1, 2, 3, 4, 5, 6, 7, 8};
        
        // Vamos criar aqui uma String para receber os dados do nosso array - já que vamos converter para String
        String dadosNumericos = Arrays.toString(arrayInt);
        
        System.out.println(dadosNumericos);




        // Maneiras de Adicionar Novos Itens a Arrays

        // Arrays em Java têm tamanho fixo, portanto, para adicionar novos itens, é necessário
        // criar um novo array ou usar estruturas como ArrayList

        // Maneiras Comuns de adicionar itens: Criar um novo array maior e copiar os elementos, usar ArrayList
        // para manipulação dinâmica de elementos
        
        
        // Vamos dizer que temos um array, e agora queremos criar um array maior para comportar mais elementos
        // Já que o array que estamos usando ele tem tamanho fixo, não pode ser alterado ao adicionar elemento



        // 1 - Primeira forma de adicionar novos elementos a um array

        // Nosso array inicial - de tamanho fixo 8
        int[] numeroFixo = {1, 2, 3, 4, 5, 6, 7, 8};


        // Criando um array maior para copiarmos os elementos do array numeroFixo e colocar mais elementos
        // O que estamos fazendo é colocando o tamanho do array numeroFixo + 1 - deixando o novoArray maior
        int[] novoArray = new int[numeroFixo.length + 1];


        // Agora vamos copiar os elementos do array numeroFixo para o novoArray
        for(int i = 0; i < numeroFixo.length; i++) {
            novoArray[i] = numeroFixo[i];
        }

        System.out.println(Arrays.toString(novoArray));

        // E para pegar o último elemento do array novoArray fazemos:
        novoArray[novoArray.length - 1] = 4;

        System.out.println(Arrays.toString(novoArray));



        // 2 - forma: Utilizando arraycopy para copiar os elementos de um array para outro array

        // Vamos criar um array de frutas
        String[] frutas2 = {"Maçã", "Uva", "Laranja", "Pera"};


        // Criando o novo array de frutas
        String[] novoFrutas = new String[frutas2.length + 1];


        // Copiando os elementos de frutas2 para novoFrutas
        // Ele recebe: 
        // o array que queremos copiar - frutas2
        // a posição inicial desse elemento que vamos copiar - posição 0
        // o array novo - novoFrutas
        // a posição inicial desse array novo - posição 0
        // E o limite do array que estamos copiando - até que elemento queremos copiar(o array todo)
        System.arraycopy(frutas2, 0, novoFrutas, 0, frutas2.length);


        // Colocando minha nova fruta no novo array
        novoFrutas[novoFrutas.length - 1] = "Jaca";

        System.out.println(Arrays.toString(novoFrutas));



        // 3 forma - Utilizando ArrayList

        // Vamos importar a classe ArrayList de java.util
        // Então estamos criando o array de String listaFrutas e já estamos adicionando elementos a ele
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maçã", "Banana", "Laranja"));

        System.out.println(listaFrutas);


        // E como esse array é dinamico, de tamanho dinamico não precisamos informar tamanho
        // Nem precisamos criar outro array para adicionar novos elementos - já que ele dinamico
        // E para adicionar elementos nesse array usamos o método add()
        listaFrutas.add("Manga");

        System.out.println(listaFrutas);




        // Reference Trap

        // Reference trap ocorre quando duas variáveis apontam para o mesmo objeto na
        // memória, causando modificações não intencionais ao objeto original ao alterar a
        // cópia
        // Ao copiar arrays ou objetos, a nova variável pode compartilhar a referência ao
        // mesmo espaço de memória, em vez de criar uma nova instância
        // Alterações em uma variável refletem na outra, pois ambas referenciam o mesmo
        // objeto


        // Array original
        int[] arrayOriginal = {1, 2, 3};

        // Novo array
        int[] arrayCopia = arrayOriginal;


        // E se fizermos isso agora
        // Vamos está alterando o valor do indice 0 do arrayCopia e do arrayOriginal - pois copiamos para
        // arrayCopia tudo do arrayOriginal até sua referencia na memoria ao fazer isso: 
        // int[] arrayCopia = arrayOriginal;
        arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));


        // Como evitar isso? 
        // Vamos utilizar o método clone() - que vai copiar os elementos do arrayOriginal
        // Mas sem copiar a referencia na memoria do arrayOriginal para o novo array
        int[] arrayClone = arrayOriginal.clone();

        arrayClone[0] = 999;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));




        // Arrays 2D (matrizes)

        // Arrays 2D são arrays de arrays, temos um array dentro de outro array, onde cada elemento
        // do array principal é um outro
        // array, permitindo a criação de estruturas de grade (matriz)
        // Um array 2D é criado especificando o número de linhas e colunas
        // Os elementos são acessados usando dois índices: um para a linha e outro para a coluna
        // Elementos de um array 2D podem ser atribuídos diretamente através de loops
        // Então vamos ter um array pai, com vários arrays filhos dentro

        // A estrutura de um array 2D é
        // Como podemos ver temos um array principal(pai) que são os colchetes de fora []
        // E dentro dele temos 2 arrays, um contendo [1, 2] e outro contendo [2, 3]
        // [[1, 2], [2, 3]]

        // E para acessar eles fariamos
        // array[0][1]
        // [0] - acessa o array que está no indice 0(o primeiro array [1, 2]) 
        // e [1] - acessa o segundo elemento do array do indice 0(que é o elemento 2)


        // Criando o array 2D
        int[][] matriz = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };


        // Vamos acessar o segundo array(do array principal) e vamos acessar o terceiro elemento desse array
        System.out.println(matriz[1][2]);


        // Criando array 2D vazio e preenchendo

        // Ele vai ter [3][3] - o array principal vai ter 3 arrays internos[3] e cada array interno vai ter
        // 3 elementos[3]
        // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        int[][] tabela = new int[3][3];

        // Preenchendo valores sem loop
        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        // E para imprimir os valores desse array 2D precisamos usar um FOR() ou ForEach para ir percorrendo
        // os arrays internos e seus elementos e ir printando

        // Aqui vamos está conseguindo imprimir as linhas do array 2D
        for(int[] linha : tabela) {
            System.out.println(Arrays.toString(linha));
        }


        // Criando o array 2D e preenchendo ele utilizando FOR() ou ForEach
        int[][] grade = new int[4][5];


        // Vamos precisar usar um FOR() dentro de outro FOR()
        // Esse primeiro FOR() entra nos arrays internos
        for(int m = 0; m < grade.length; m++) {

            // E o segundo FOR() entra nos elementos dos arrays internos
            for(int n = 0; n < grade[m].length; n++) {
                grade[m][n] = m * n;
            }
        }


        // Imprimindo os valores de grade[][]
        for(int[] linha : grade) {
            System.out.println(Arrays.toString(linha));
        }




        // Ordenação de arrays com Arrays.sort()

        // Ordena arrays de tipos primitivos em ordem crescente
        // Ordena arrays de objetos que implementam Comparable
        // Pode usar Comparator para definir ordem personalizada


        // Ordenação de Arrays Multidimensionais

        // Ordenação baseada em uma coluna específica
        // Comparator pode ser utilizado para definir critérios complexos


        // Ordenação array de inteiros
        // Como esse nosso array numbers[] está fora de ordem
        // Podemos ordenar ele utilizando o método sort()
        int[] numbers = {5, 6, 1, 4, 2, 22, 1};


        // Ordenando
        // Esse método modifica o array original
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));


        // Ordenação com Comparator
        // Vamos criar um array de nomes e vamos ordenar eles na ordem inversa
        // Para isso vamos ter que utilizar o Comparator
        String[] arrayNames = {"João", "Bob", "Pedro", "Marco"};


        // E para ordenar esse array de String podemos usar também o método sort()
        Arrays.sort(arrayNames, Comparator.reverseOrder());

        System.out.println(arrayNames);


        // Ordenação de matriz
        int[][] matrizOrdem = { {4, 5, 1}, {3, 8, 9}, {2, 3, 1} };


        // Para ordenar em ordem crescente um array de 2D precisamos usar o método sort()
        // Junto com o Comparator
        Arrays.sort(matrizOrdem, Comparator.comparingInt(a -> a[1]));

        for(int[] linha : matrizOrdem) {
            System.out.println(linha);   
        }

        // Outra forma de imprimir os dados de um array 2D é usando o método deppToString()
        System.out.println(Arrays.deepToString(matrizOrdem));




        // Manipulação Avançada de Arrays

        // Cópia de Arrays com Arrays.copyOf()
        // Cria uma nova cópia de um array com tamanho especificado
        // Pode ser utilizado para truncar ou expandir arrays

        // Preenchimento de Arrays com Arrays.fill()
        // Preenche todos os elementos do array com um valor específico
        // Útil para inicialização de arrays com valores padrão

        // Transformação de Arrays com Arrays.stream()
        // Converte um array em um Stream para manipulação funcional
        // Permite filtragem, mapeamento, redução e outras operações


        // Copiando arrays

        // Manipulação avançada
        // Vamos criar um array
        int[] original = {1, 2, 2, 3};


        // Agora vamos criar outro array e copiar os dado do array original para esse array
        // E para isso vamos utilizar o método copyOf() - passando para ele nome do array(que vai ser copiado)
        // E a quantidade de elementos que queremo copiar dele, nesse caso colocamos que vamos copiar 2
        int[] copia = Arrays.copyOf(original, 2);

        System.out.println(Arrays.toString(copia));


        // fill - preenchimento

        // Temos um array de números
        // Só que vamos iniciar sem ele elementos
        int[] number = new int[5];

        // Então vamos preencher esse array com vários números 5
        // Para isso vamos utilizar o método fill()
        Arrays.fill(number, 5);

        System.out.println(Arrays.toString(number));


        // Transformacao de array para stream

        // Vai permitir a gente ter outras funcionalidades para o array
        // Vamos criar um array de inteiros
        int[] values = {1, 2, 3, 4, 5};

        // E a nossa função agora aqui é somar todos esses valores
        // Para isso, vamos utilizar stream que facilita algumas operações com arrays
        // Para isso vamos precisar criar uma variável inteira que vai receber essa transformação
        // E ao transformar o array em stream vamos aplicar o método sum()
        // Isso é possível, pois o stream nos permite fazer certas operações nos arrays
        int sum = Arrays.stream(values).sum();

        System.out.println(sum);




        // Array Dinâmico

        // Arrays em Java são de tamanho fixo; arrays dinâmicos ajustam o tamanho
        // automaticamente

        // ArrayList é a implementação mais comum de arrays dinâmicos

        // Adicionar elementos com ArrayList.add()
        // Permite adicionar elementos ao final do array
        // Não requer redimensionamento manual

        // Remover elementos com ArrayList.remove()
        // Remove elementos pelo índice ou valor
        // Ajusta automaticamente o tamanho do array

        
        // E para criarmos esses arrays dinâmicos vamos utilizar o ArrayList
        // Para isso precisamos importar o ArrayList de java.util

        // Declarando um array dinâmico - chamamos o ArrayList<tipo> e colocamos o tipo do array entre "<>"
        // Depois inicializamos o ArrayList com "new"
        ArrayList<String> frutas4 = new ArrayList<>();

        // Adicionando elementos ao array dinâmico ArrayList
        frutas4.add("Maçã");
        frutas4.add("Pera");
        frutas4.add("Uva");


        // Percorrendo o ArrayList
        for(String fruta : frutas4) {
            System.out.println(fruta);
        }
        

        // Removendo elementos do array dinâmico ArrayList
        // E podemos remover o elemento colocando no método remove() o índice do elemento ou valor do elemento
        frutas4.remove("Pera");

        System.out.println(frutas4);


        // E podemos capturar um elemento específico utilizando o método get() do ArrayList
        // A forma correta de acessar um elemento ao usar ArrayList é através do método get(int index),
        // passando o índice desejado como argumento. Ou seja, você não acessa
        // diretamente pelo índice como em arrays com colchetes(feito em arrays fixos)
        String frutaEspecifica = frutas4.get(0);

        System.out.println(frutaEspecifica);
    }
}

