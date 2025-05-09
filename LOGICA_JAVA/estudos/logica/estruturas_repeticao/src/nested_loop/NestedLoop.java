package nested_loop;

public class NestedLoop {
    public static void main(String[] args) {
        
        // Nested loops ocorrem quando um loop é colocado dentro de outro loop, permitindo
        // que o loop interno seja executado completamente para cada iteração do loop externo

        // Ou seja, é quando você tem uma estrutura de repetição dentro de outra estrutura de repetição
        // E funciona assim: a estrutura de repetição interna vai ser executada por completo para depois
        // executar uma iteração na estrutura de repetição externa

        // Então se eu tenho um FOR() externo e outro interno
        // O FOR() externo vai ser executado, entrando no FOR() interno e esperando o FOR() interno
        // executar toda sua iteração, para só depois o FOR() externo poder executar sua segunda iteração
        // E com isso continuar o ciclo de entrar no FOR() interno e esperar ele executar todas as suas iterações
        
        // Frequantemente usado para manipular matrizes, tabelas e para iterar sobre estrutura de dados
        // mais complexas

        // Podem ser menos eficientes e mais complexos de entender, exigindo cuidado para evitar loops
        // infinitos ou comportamentos inesperados


        
        // Criando um nested loop
        // Vamos criar dois FOR()

        // Ou seja, 1 execução do FOR() externo gera 3 execuções do FOR() interno
        // O FOR() externo ao executar uma vez, espera o FOR() interno executar 3 vezes para ele poder executar
        // as outras 3 iterações
        for(int m = 1; m <= 3; m++) {
            
            System.out.println("EXTERNO!");

            for(int n = 1; n <= 3; n++) {

                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }
    }
}
