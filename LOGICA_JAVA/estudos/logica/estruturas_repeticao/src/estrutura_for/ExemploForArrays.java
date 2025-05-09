package estrutura_for;

public class ExemploForArrays {
    public static void main(String[] args) {

        // Também podemos usar o laço de repetição FOR()
        // para percorrer sobre arrays e coleções de dados

        // Um array é um conjunto de elementos(valores)
        // De um tipo de dado correspondente(do mesmo tipo)
        // Ou seja, podemos ter um array só com Strings
        // Um array só com inteiros e entre outros

        // Vamos agora criar um array de Strings
        // Que tem nomes de alunos, ou seja, uma lista de nomes

        // E o indice dos array começam em 0
        // O indice é a posição onde está aquele elemento no array
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};


        // E agora vamos criar o FOR() que vai percorrer
        // Esses elementos(esses nomes) dentro do array
        // E a medida que esse FOR() com seu loop percorre
        // Esse array, ele vai printando na tela os nomes

        // Então criamos a variável inteira x - que inicia em 0
        // E enquanto x for menor que o tamanho do array
        // O FOR() deve ficar percorrendo o array e printando
        // Os nomes

        // Para saber o tamanho do array colocamos nome.length
        // Length é uma propriedade do array que diz o seu tamanho

        // E por fim temos o incremento da variável x
        // Para que o FOR() consiga percorrer o array
        // Até o último nome de aluno
        for(int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }



        // ------------------------------// ------------- //

        // Podemos fazer esse mesmo exemplo do array e do FOR()
        // Utilizando uma outra estrutura FOR()
        // Que é chamada de ForEach()

        // O ForEach() ele é parte das coleções do Java 8
        // E pode ser usado com qualquer coleção do Java
        // Que implemente a interface Iterable, ou seja,
        // As coleções: listas, conjuntos e mapas

        // E como um array é um conjunto de elementos do mesmo
        // Tipo - podemos utilizar nele o laço de repetição
        // ForEach

        // E para usar o ForEach() para percorrer o array alunos[]
        // Fazemos dessa maneira:

        // Ele abrevia a estrutura FOR() que vimos antes

        // Eu sei que tenho elementos nesse array que são do tipo
        // String, com isso eu crio uma variável String
        // No ForEach()
        // E quando coloco 2 pontos o ForEach() diz que:
        // A cada iteração de alunos(ou seja, a cada aluno)
        // Percorrido, o aluno atual de alunos, vai ser inserido
        // Na variável interna aluno
        // E como a cada repetição ele coloca um aluno em "aluno"
        // Logo ele sempre vai printar aquele aluno específico
        // Que está na variável interna "aluno"
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é " + aluno);
        }

    }
}
