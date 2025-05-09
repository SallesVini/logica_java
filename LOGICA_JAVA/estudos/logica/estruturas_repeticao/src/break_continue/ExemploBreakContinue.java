package break_continue;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        // Criando um exemplo para mostrar o uso do break
        // Para isso vamos criar um contador de 1 até 5
        // Com o FOR()
        for(int numero = 1; numero <= 5; numero++) {

            // Vamos colocar um IF() aqui dentro do FOR()
            // Porque quando o FOR() durante a iteração
            // Chegar no número 3 - entra no IF() e executa
            // O comando break finalizando o FOR()

            // Porque o break faz isso - ele quebra(para)
            // O loop FOR() e finaliza ele
            if(numero == 3) {
                break;
            }
            System.out.println(numero);
        }


        // Exemplo com o comando continue


        // Agora vamos criar outro contador que vai de 1 até 7
        // E vamos fazer a mesma situação que fizemos no break
        // Vamos criar o FOR() que vai de 1 a 7
        // E vamos colocar um IF() nesse FOR() e quando
        // O FOR() chegar no número 4 entra no IF()
        // E o IF() executa o comando continue
        for(int cont = 1; cont <= 7; cont++) {

            // Quando cont for igual a 4 entra no IF()
            // E executa o comando continue
            // O comando continue vai voltar para o inicio
            // Do FOR() e vai executar ele do inicio
            // Pulando o valor 4 e "continuando" para o próximo
            if(cont == 4) {
                continue;
            }
            System.out.println(cont);
        }
    }
}
